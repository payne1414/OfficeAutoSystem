package com.qf.controller;

import com.qf.mapper.TeacherMapper;
import com.qf.pojo.TbReport;
import com.qf.pojo.TbScore;
import com.qf.pojo.TbUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * Created by Administrator on 2018/11/13.
 */
@Controller
public class TeacherController {
   @Autowired
    private TeacherMapper teacherMapper;

    public TeacherMapper getTeacherMapper() {
        return teacherMapper;
    }

    public void setTeacherMapper(TeacherMapper teacherMapper) {
        this.teacherMapper = teacherMapper;
    }
    @RequestMapping("selectTeacher")
    public String selectTeacher(String unum, HttpServletRequest request){
        TbUser tbUser = teacherMapper.selectTeacher(unum);
        request.setAttribute("tbUser",tbUser);
        return "/teacher/teacherlist.jsp";
    }
    @RequestMapping("updateTeacher1")
    public String selectTeacher1(String unum, HttpServletRequest request){
        TbUser tbUser = teacherMapper.selectTeacher(unum);
        request.setAttribute("tbUser",tbUser);
        return "/teacher/updateteacher.jsp";
    }
    @RequestMapping("updateTeacher2")
    public String updateTeacher(TbUser tbUser){
        int i = teacherMapper.updateTeacher(tbUser);
        return "/teacher/teacherlist.jsp";
    }
    //讲师查看周报
    @RequestMapping("teacherCheckReport")
    public String checkReport(HttpServletRequest request){
        List<TbReport> tbReportList = teacherMapper.selectReport();
        request.setAttribute("tbReportList",tbReportList);
        return "/teacher/reportlist.jsp";
    }
    //周报打分
    @RequestMapping("teacherUpdateReport")
    public String updateReport(int grade,int rid){
        int i = teacherMapper.updateReport(grade,rid);
        return "teacherCheckReport";
    }
    //成绩录入
    @RequestMapping("addScore")
    public String addScore(TbScore tbScore){
        int i = teacherMapper.addScore(tbScore);
        return "/teacher/addScore.jsp";
    }
}
