package com.qf.mapper;

import com.qf.pojo.TbLeave;

import java.util.List;

/**
 * Created by payne on 2018/11/14.
 */
public interface LeaveMapper {
    public int addLeave(TbLeave tbLeave);
    public List<TbLeave> selectTbLeaveListByUnum(String unum);
}
