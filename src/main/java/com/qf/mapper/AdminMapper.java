package com.qf.mapper;

import com.qf.pojo.*;

import java.util.List;

/**
 * Created by payne on 2018/11/13.
 */
public interface AdminMapper {
    //课程管理
    public int addCourse(TbCourse tbCourse);
    public int deleteCourse(int cid);
    public int updateCourse(TbCourse tbCourse);
    public List<TbCourse> selectTbCourseList();

    //角色管理
    public int addPosition(TbPosition tbPosition);
    public int deletePosition(int pid);
    public int updatePosition(TbPosition tbPosition);
    public List<TbPosition>selectTbPositionList();

    //用户管理
    public int addUser(TbUser tbUser);
    public int deleteUser(int uid);
    public int updateUserPassword(TbUser tbUser);
    public TbUser selectUser(String unum);
    public List<TbUser> selectTbUserListByName(String username);
    public List<TbUser> selectTbUserListByPosition(String position);
    public List<TbUser> selectTbUserList();

    //部门管理
    public int addDepartment(TbDepartment tbDepartment);
    public int deleteDepartment(int did);
    public int updateDepartment(TbDepartment tbDepartment);
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
    //添加新班级，同时为其添加讲师和班主任
    public int addClass(TbClass tbClass);
    public int deleteClassByClassid(int classid);
    //根据学生编号查询班级信息
    public TbClass selectClassByStudent(String unum);

}
