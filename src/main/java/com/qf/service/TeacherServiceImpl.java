package com.qf.service;

import com.qf.mapper.TeacherMapper;
import com.qf.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/11/13.
 */
@Service
public class TeacherServiceImpl implements TeacherService {
    @Autowired
    private TeacherMapper teacherMapper;

    public TeacherMapper getTeacherMapper() {
        return teacherMapper;
    }

    public void setTeacherMapper(TeacherMapper teacherMapper) {
        this.teacherMapper = teacherMapper;
    }

    @Override

    public TbUser selectTeacher(String unum) {
        return teacherMapper.selectTeacher(unum);
    }

    @Override
    public int updateTeacher(TbUser tbUser) {
        return teacherMapper.updateTeacher(tbUser);
    }

    @Override
    public List<TbReport> selectReport() {
        return teacherMapper.selectReport();
    }

    @Override
    public int updateReport(int grade,int rid) {
        return teacherMapper.updateReport(grade,rid);
    }

    @Override
    public int addScore(TbScore tbScore) {
        return teacherMapper.addScore(tbScore);
    }

    @Override
    public List<TbClass> selectClass() {
        return teacherMapper.selectClass();
    }

    @Override
    public List<TbScore> selectScore(String classname) {
        return teacherMapper.selectScore(classname);
    }

    @Override
    public TbScore selectScoreOne(String unum) {
        return teacherMapper.selectScoreOne(unum);
    }

    @Override
    public List<TbUser> selectStudent(String unum) {
        return teacherMapper.selectStudent(unum);
    }
}
