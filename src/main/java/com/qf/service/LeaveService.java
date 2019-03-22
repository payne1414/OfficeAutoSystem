package com.qf.service;

import com.qf.pojo.TbLeave;

import java.util.List;

/**
 * Created by payne on 2018/11/14.
 */
public interface LeaveService {
    public int addStudentLeave(TbLeave tbLeave);
    public List<TbLeave> selectTbLeaveListByUnum(String unum);
}
