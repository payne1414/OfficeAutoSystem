package com.qf.mapper;

import com.qf.pojo.TbReport;
import com.qf.pojo.TbStudent;
import com.qf.pojo.TbUser;

import java.util.List;

/**
 * Created by Administrator on 2018/11/13.
 */
public interface StudentMapper {
    //个人资料的管理
    public TbUser selectStudent(String unum);
    public TbUser selectStudentById(String unum);
    public int updateStudent(TbUser tbUser);
    //周报管理
    public int addReport(TbReport tbReport);
    public List<TbReport> selectReport(String unum);
}
