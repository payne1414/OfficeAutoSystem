package com.qf.service;

import com.qf.pojo.*;

import java.util.List;

/**
 * Created by payne on 2018/11/12.
 */
public interface AdminService {
    //课程管理
    public int addCourse(TbCourse tbCourse);
    public int deleteCourse(int cid);
    public int updateCourse(TbCourse tbCourse);//暂无修改课程的功能
    public List<TbCourse> selectTbCourseList();

    //角色管理
    public int addPosition(TbPosition tbPosition);
    public int deletePosition(int pid);
    public int updatePosition(TbPosition tbPosition);//暂无修改角色的功能
    public List<TbPosition>selectTbPositionList();

    //用户管理
    public int addUser(TbUser tbUser);
    public int deleteUser(int uid);
    public int updateUserPassword(TbUser tbUser);//重置用户密码
    public TbUser selectUser(String unum);//根据工号查单个用户
    public List<TbUser> selectTbUserListByName(String username);//根据名字模糊查询
    public List<TbUser> selectTbUserListByPosition(String position);//根据职位查询
    public List<TbUser> selectTbUserList();

    //部门管理
    public int addDepartment(TbDepartment tbDepartment);
    public int deleteDepartment(int did);
    public int updateDepartment(TbDepartment tbDepartment);//暂无修改部门的功能
    public TbDepartment selectDepartment(int did);
    public List<TbDepartment> selectTbDepartmentList();

    //员工管理
    public int addStaff(TbStaff tbStaff);
    public int deleteStaff(int sid);
    public List<TbUser> selectTbStaffList();//方法名字对应AdminMapper中的SQL语句
    public List<TbUser> selectTbStaffListByName(String username);
    public List<TbUser> selectTbStaffListByPosition(String position);
    public List<TbUser> selectTbStaffListBySex(String sex);//暂无
    public List<TbUser> selectTbStaffListByAge(int age);//暂无

    //班级管理
    public List<TbClass> selectTbClassList();
    public int addClass(TbClass tbClass);
    public int deleteClassByClassid(int classid);
    public TbClass selectClassByStudent(String unum);

}
