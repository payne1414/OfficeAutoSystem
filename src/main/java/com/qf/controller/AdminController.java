package com.qf.controller;

import com.qf.pojo.*;
import com.qf.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * Created by payne on 2018/11/13.
 */
@Controller
public class AdminController {
    @Autowired
    private AdminService adminService;

    public AdminService getAdminService() {
        return adminService;
    }

    public void setAdminService(AdminService adminService) {
        this.adminService = adminService;
    }

    /**
     * 课程管理
     * @param request
     * @return
     */
    @RequestMapping("courseList")
    public String courseList(HttpServletRequest request){
        List<TbCourse>courseList = adminService.selectTbCourseList();
        request.setAttribute("courseList",courseList);
        return "/admin/courselist.jsp";
    }
    @RequestMapping("addCourse")
    public String addCourse(String cname,HttpServletRequest request){
        TbCourse tbCourse = new TbCourse();
        tbCourse.setCname(cname);
        int i = adminService.addCourse(tbCourse);
        List<TbCourse>courseList = adminService.selectTbCourseList();
        request.setAttribute("courseList",courseList);
        return "/admin/courselist.jsp";
    }
    @RequestMapping("deleteCourse")
    public String deleteCourse(int cid,HttpServletRequest request){
        int i = adminService.deleteCourse(cid);
        List<TbCourse>courseList = adminService.selectTbCourseList();
        request.setAttribute("courseList",courseList);
        return "/admin/courselist.jsp";
    }

    /**
     * 角色管理
     * @param request
     * @return
     */
    @RequestMapping("positionList")
    public String positionList(HttpServletRequest request){
        List<TbPosition>positionList = adminService.selectTbPositionList();
        request.setAttribute("positionList",positionList);
        return "/admin/positionlist.jsp";
    }
    @RequestMapping("addPosition")
    public String addPosition(String position,HttpServletRequest request){
        TbPosition tbPosition = new TbPosition();
        tbPosition.setPosition(position);
        int i = adminService.addPosition(tbPosition);
        List<TbPosition>positionList = adminService.selectTbPositionList();
        request.setAttribute("positionList",positionList);
        return "/admin/positionlist.jsp";
    }
    @RequestMapping("deletePosition")
    public String deletePosition(int pid,HttpServletRequest request){
        int i = adminService.deletePosition(pid);
        List<TbPosition>positionList = adminService.selectTbPositionList();
        request.setAttribute("positionList",positionList);
        return "/admin/positionlist.jsp";
    }

    /**
     *部门管理
     */
    @RequestMapping("departmentList")
    public String departmentList(HttpServletRequest request){
        List<TbDepartment>departmentList = adminService.selectTbDepartmentList();
        request.setAttribute("departmentList",departmentList);
        return "/admin/departmentlist.jsp";
    }
    @RequestMapping("addDepartment")
    public String addDepartment(String dname,HttpServletRequest request){
        TbDepartment tbDepartment = new TbDepartment();
        tbDepartment.setDname(dname);
        int i = adminService.addDepartment(tbDepartment);
        List<TbDepartment>departmentList = adminService.selectTbDepartmentList();
        request.setAttribute("departmentList",departmentList);
        return "/admin/departmentlist.jsp";
    }
    @RequestMapping("deleteDepartment")
    public String deleteDepartment(int did,HttpServletRequest request){
        int i = adminService.deleteDepartment(did);
        List<TbDepartment>departmentList = adminService.selectTbDepartmentList();
        request.setAttribute("departmentList",departmentList);
        return "/admin/departmentlist.jsp";
    }

    /**
     * 员工管理
     * @param request
     * @return
     */
    @RequestMapping("staffList")
    public String staffList(HttpServletRequest request){
        List<TbPosition> positionList = adminService.selectTbPositionList();
        List<TbUser> staffList = adminService.selectTbStaffList();
        request.setAttribute("staffList",staffList);
        request.setAttribute("positionList",positionList);
        return "/admin/stafflist.jsp";
    }
    @RequestMapping("staffListByNameOrPosition")//搜索
    public String staffListByName(String username,String position,HttpServletRequest request){
      /*  if(username.equals("") && position != null){
            List<TbUser> staffList = adminService.selectTbStaffListByPosition(position);
            request.setAttribute("staffList",staffList);
        }else*/ if(!username.equals("")){
            List<TbUser> staffList= adminService.selectTbStaffListByName(username);
            request.setAttribute("staffList",staffList);
        }else{
            List<TbUser> staffList = adminService.selectTbStaffList();
            request.setAttribute("staffList",staffList);
        }
        List<TbPosition> positionList = adminService.selectTbPositionList();
        request.setAttribute("positionList",positionList);
        return "/admin/stafflist.jsp";
    }
    @RequestMapping("deleteStaff")
    public String deleteStaff(int uid,HttpServletRequest request){
        int i = adminService.deleteStaff(uid);
        List<TbPosition> positionList = adminService.selectTbPositionList();
        List<TbUser> staffList = adminService.selectTbStaffList();
        request.setAttribute("staffList",staffList);
        request.setAttribute("positionList",positionList);
        return "/admin/staff.jsp";
    }
    /**
     * 班级管理
     */
    @RequestMapping("classList")
    public String classList(HttpServletRequest request){
        List<TbUser> tUserList = adminService.selectTbUserListByPosition("teacher");
        List<TbUser> lUserList = adminService.selectTbUserListByPosition("leader");
        List<TbClass> classList = adminService.selectTbClassList();
        request.setAttribute("classList",classList);
        request.setAttribute("tUserList",tUserList);
        request.setAttribute("lUserList",lUserList);
        return "/admin/classlist.jsp";
    }
    @RequestMapping("addClass")
    public String addClass(TbClass tbClass,HttpServletRequest request){
        int i = adminService.addClass(tbClass);
        List<TbUser> tUserList = adminService.selectTbUserListByPosition("teacher");
        List<TbUser> lUserList = adminService.selectTbUserListByPosition("leader");
        List<TbClass> classList = adminService.selectTbClassList();
        request.setAttribute("classList",classList);
        request.setAttribute("tUserList",tUserList);
        request.setAttribute("lUserList",lUserList);
        return "/admin/classlist.jsp";
    }
    @RequestMapping("deleteClass")
    public String deleteClass(int classid,HttpServletRequest request){
        int i = adminService.deleteClassByClassid(classid);
        List<TbUser> tUserList = adminService.selectTbUserListByPosition("teacher");
        List<TbUser> lUserList = adminService.selectTbUserListByPosition("leader");
        List<TbClass> classList = adminService.selectTbClassList();
        request.setAttribute("classList",classList);
        request.setAttribute("tUserList",tUserList);
        request.setAttribute("lUserList",lUserList);
        return "/admin/classlist.jsp";
    }
}
