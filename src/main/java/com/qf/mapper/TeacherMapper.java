package com.qf.mapper;

import com.qf.pojo.*;

import java.util.List;

/**
 * Created by Administrator on 2018/11/13.
 */
public interface TeacherMapper {
    //讲师个人资料管理

    public TbUser selectTeacher(String unum);
    public int updateTeacher(TbUser tbUser);
    //周报查看和打分
    public List<TbReport> selectReport();
    public int updateReport(int grade,int rid);
    //学生成绩管理
    public int addScore(TbScore tbScore);
    //根据班级查看
    public List<TbClass> selectClass();
    public List<TbScore> selectScore(String classname);

    public TbScore selectScoreOne(String unum);
    //学生信息查看
    public List<TbUser> selectStudent(String unum);
}
