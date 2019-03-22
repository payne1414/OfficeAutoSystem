package com.qf.service;

import com.qf.mapper.LeaveMapper;
import com.qf.pojo.TbLeave;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by payne on 2018/11/14.
 */
@Service
public class LeaveServiceImpl implements LeaveService {
    @Autowired
    private LeaveMapper leaveMapper;

    public LeaveMapper getLeaveMapper() {
        return leaveMapper;
    }

    public void setLeaveMapper(LeaveMapper leaveMapper) {
        this.leaveMapper = leaveMapper;
    }

    @Override
    public int addStudentLeave(TbLeave tbLeave) {
        return leaveMapper.addLeave(tbLeave);
    }

    @Override
    public List<TbLeave> selectTbLeaveListByUnum(String unum) {
        return leaveMapper.selectTbLeaveListByUnum(unum);
    }
}
