package com.qf.service;

import com.qf.mapper.AdminMapper;
import com.qf.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by payne on 2018/11/13.
 */
@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminMapper adminMapper;

    public AdminMapper getAdminMapper() {
        return adminMapper;
    }

    public void setAdminMapper(AdminMapper adminMapper) {
        this.adminMapper = adminMapper;
    }

    /**
     * 课程管理
     * @param tbCourse
     * @return
     */
    @Override
    public int addCourse(TbCourse tbCourse) {
        return adminMapper.addCourse(tbCourse);
    }

    @Override
    public int deleteCourse(int cid) {
        return adminMapper.deleteCourse(cid);
    }

    @Override
    public int updateCourse(TbCourse tbCourse) {
        return adminMapper.updateCourse(tbCourse);
    }

    @Override
    public List<TbCourse> selectTbCourseList() {
        return adminMapper.selectTbCourseList();
    }

    /**
     * 角色管理
     * @param tbPosition
     * @return
     */
    @Override
    public int addPosition(TbPosition tbPosition) {
        return adminMapper.addPosition(tbPosition);
    }

    @Override
    public int deletePosition(int pid) {
        return adminMapper.deletePosition(pid);
    }

    @Override
    public int updatePosition(TbPosition tbPosition) {
        return adminMapper.updatePosition(tbPosition);
    }

    @Override
    public List<TbPosition> selectTbPositionList() {
        return adminMapper.selectTbPositionList();
    }

    /**
     * 用户管理
     * @param tbUser
     * @return
     */
    @Override
    public int addUser(TbUser tbUser) {
        return adminMapper.addUser(tbUser);
    }

    @Override
    public int deleteUser(int uid) {
        return adminMapper.deleteUser(uid);
    }

    @Override
    public int updateUserPassword(TbUser tbUser) {
        return adminMapper.updateUserPassword(tbUser);
    }

    @Override
    public TbUser selectUser(String unum) {
        return adminMapper.selectUser(unum);
    }

    @Override
    public List<TbUser> selectTbUserListByName(String username) {
        return adminMapper.selectTbUserListByName(username);
    }

    @Override
    public List<TbUser> selectTbUserListByPosition(String position) {
        return adminMapper.selectTbUserListByPosition(position);
    }

    @Override
    public List<TbUser> selectTbUserList() {
        return adminMapper.selectTbUserList();
    }

    /**
     * 部门管理
     * @param tbDepartment
     * @return
     */
    @Override
    public int addDepartment(TbDepartment tbDepartment) {
        return adminMapper.addDepartment(tbDepartment);
    }

    @Override
    public int deleteDepartment(int did) {
        return adminMapper.deleteDepartment(did);
    }

    @Override
    public int updateDepartment(TbDepartment tbDepartment) {
        return adminMapper.updateDepartment(tbDepartment);
    }

    @Override
    public TbDepartment selectDepartment(int did) {
        return adminMapper.selectDepartment(did);
    }

    @Override
    public List<TbDepartment> selectTbDepartmentList() {
        return adminMapper.selectTbDepartmentList();
    }

    /**
     * 员工管理
     * @param tbStaff
     * @return
     */
    @Override
    public int addStaff(TbStaff tbStaff) {
        return 0;
    }

    @Override
    public int deleteStaff(int sid) {
        return 0;
    }

    @Override
    public List<TbUser> selectTbStaffList() {
        return adminMapper.selectTbStaffList();
    }

    @Override
    public List<TbUser> selectTbStaffListByName(String username) {
        return adminMapper.selectTbStaffListByName(username);
    }

    @Override
    public List<TbUser> selectTbStaffListByPosition(String position) {
        return adminMapper.selectTbStaffListByPosition(position);
    }

    @Override
    public List<TbUser> selectTbStaffListBySex(String sex) {
        return null;
    }

    @Override
    public List<TbUser> selectTbStaffListByAge(int age) {
        return null;
    }


    /**
     * 班级管理
     * @return
     */
    @Override
    public List<TbClass> selectTbClassList() {
        return adminMapper.selectTbClassList();
    }

    @Override
    public int addClass(TbClass tbClass) {
        return adminMapper.addClass(tbClass);
    }

    @Override
    public int deleteClassByClassid(int classid) {
        return adminMapper.deleteClassByClassid(classid);
    }

    @Override
    public TbClass selectClassByStudent(String unum) {
        return adminMapper.selectClassByStudent(unum);
    }
}
