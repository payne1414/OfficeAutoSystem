package com.qf.controller;

import com.qf.pojo.TbClass;
import com.qf.pojo.TbLeave;
import com.qf.pojo.TbUser;
import com.qf.service.AdminService;
import com.qf.service.LeaveService;
import org.activiti.engine.ProcessEngine;
import org.activiti.engine.RepositoryService;
import org.activiti.engine.RuntimeService;
import org.activiti.engine.TaskService;
import org.activiti.engine.runtime.ProcessInstance;
import org.activiti.engine.task.Task;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by payne on 2018/11/14.
 */
@Controller
public class LeaveController {
    @Autowired
    private AdminService adminService;
    @Autowired
    private RepositoryService repositoryService;
    @Autowired
    private LeaveService leaveService;
    @Autowired
    private RuntimeService runtimeService;
    @Autowired
    private TaskService taskService;

    public LeaveService getLeaveService() {
        return leaveService;
    }

    public void setLeaveService(LeaveService leaveService) {
        this.leaveService = leaveService;
    }
    @RequestMapping("addLeave")
    public String addLeave(HttpServletRequest request,String reason, String username, String unum, String startDay, String startHour, String startMinuter, String endDay, String endHour, String endMinuter){
        TbClass tbClass = adminService.selectClassByStudent(unum);
        TbUser tbUser = adminService.selectUser("m01");
       /* SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");*/
        String startDate = startDay +" "+startHour+":"+startMinuter+":00";
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println(startDate);
        String endDate = endDay +" "+ endHour+":"+endMinuter+":00";
        System.out.println(endDate);
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++");
        Map<String,Object> variables = new HashMap<String,Object>();
        variables.put("days",2);
        variables.put("studentname",username);
        variables.put("teachername",tbClass.getTeachername());
        variables.put("leadername",tbClass.getLeadername());
        variables.put("managername",tbUser.getUsername());
        repositoryService.createDeployment().addClasspathResource("studentLeave.bpmn").deploy();
        ProcessInstance processInstance = runtimeService.startProcessInstanceByKey("student_leave",variables);
        Task task = taskService.createTaskQuery().processInstanceId(processInstance.getId()).taskAssignee(username).singleResult();
        taskService.complete(task.getId());
        TbLeave tbLeave = new TbLeave();
        tbLeave.setReason(reason);
        tbLeave.setUnum(unum);
        tbLeave.setStartDate(startDate);
        tbLeave.setEndDate(endDate);
        tbLeave.setState("未审批");
        tbLeave.setProcessId(processInstance.getId());
        int i = leaveService.addStudentLeave(tbLeave);
        List<TbLeave> tbLeaveList = leaveService.selectTbLeaveListByUnum(unum);
        request.setAttribute("tbLeaveList",tbLeaveList);
        return "/student/studentleave.jsp";
    }
}

