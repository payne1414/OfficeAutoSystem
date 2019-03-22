package com.qf.service;

import com.qf.mapper.StudentMapper;
import com.qf.pojo.TbReport;
import com.qf.pojo.TbStudent;
import com.qf.pojo.TbUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/11/13.
 */
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentMapper studentMapper;

    public StudentMapper getStudentMapper() {
        return studentMapper;
    }

    public void setStudentMapper(StudentMapper studentMapper) {
        this.studentMapper = studentMapper;
    }

    @Override
    public TbUser selectStudent(String unum) {
        return studentMapper.selectStudent(unum);
    }

    @Override
    public TbUser selectStudentById(String unum) {
        return studentMapper.selectStudentById(unum);
    }

    @Override
    public int updateStudent(TbUser tbUser) {
        return studentMapper.updateStudent(tbUser);
    }

    @Override
    public int addReport(TbReport tbReport) {
        return studentMapper.addReport(tbReport);
    }

    @Override
    public List<TbReport> selectReport(String unum) {
        return studentMapper.selectReport(unum);
    }
}
