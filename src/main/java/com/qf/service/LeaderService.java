package com.qf.service;


import com.qf.pojo.*;

import java.util.List;

/**
 * Created by Administrator on 2018/11/13.
 */
public interface LeaderService {
    //班主任个人信息管理
    public TbUser selectLeader(String unum);
    public int updateLeader(TbUser tbUser);
    //周报查看
    public List<TbReport> selectReport();
    //学生管理
    public List<TbClass> selectClass();
    public List<TbUser> selectTeacher(int claid);
    //成绩查看
    public List<TbScore> selectScore(String classname);
    public TbScore selectScoreOne(String unum);


}
