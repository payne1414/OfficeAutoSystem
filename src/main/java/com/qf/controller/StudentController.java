package com.qf.controller;

import com.qf.pojo.TbReport;
import com.qf.pojo.TbStudent;
import com.qf.pojo.TbUser;
import com.qf.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by Administrator on 2018/11/13.
 */
@Controller
public class StudentController {
    @Autowired
    private StudentService studentService;

    public StudentService getStudentService() {
        return studentService;
    }

    public void setStudentService(StudentService studentService) {
        this.studentService = studentService;
    }
    @RequestMapping("selectStudent")
    public String selectStudent(String unum, HttpServletRequest request){
        TbUser tbUser = studentService.selectStudent(unum);
        request.setAttribute("tbUser",tbUser);
        return "/student/studentlist.jsp";
    }
    @RequestMapping("update")
    public String update(String unum,HttpServletRequest request){
        TbUser tbUser = studentService.selectStudentById(unum);
        request.setAttribute("tbUser",tbUser);
        return "/student/updatestudent.jsp";
    }
    @RequestMapping("updateStudent")
    public String updateStudent(TbUser tbUser){
        int i = studentService.updateStudent(tbUser);
        return "/student/studentlist.jsp";
    }
    //添加周报
    @RequestMapping("addReport")
    public String addReport(TbReport tbReport, HttpSession session,HttpServletRequest request){
        int i = studentService.addReport(tbReport);
        String unum = (String) session.getAttribute("unum");
        List<TbReport> tbReportList = studentService.selectReport(unum);
        request.setAttribute("tbReportList",tbReportList);
        return "/student/reportlist.jsp";
    }
}
