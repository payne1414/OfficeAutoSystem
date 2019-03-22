package com.qf.service;

import com.qf.mapper.LeaderMapper;
import com.qf.pojo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/11/13.
 */
@Service
public class LeaderServiceImpl implements LeaderService {
    @Autowired
    private LeaderMapper leaderMapper;

    public LeaderMapper getLeaderMapper() {
        return leaderMapper;
    }

    public void setLeaderMapper(LeaderMapper leaderMapper) {
        this.leaderMapper = leaderMapper;
    }

    @Override
    public TbUser selectLeader(String unum) {
        return leaderMapper.selectLeader(unum);
    }

    @Override
    public int updateLeader(TbUser tbUser) {
        return leaderMapper.updateLeader(tbUser);
    }

    @Override
    public List<TbReport> selectReport() {
        return leaderMapper.selectReport();
    }

    @Override
    public List<TbClass> selectClass() {
        return leaderMapper.selectClass();
    }

    @Override
    public List<TbUser> selectTeacher(int claid) {
        return leaderMapper.selectTeacher(claid);
    }

    @Override
    public List<TbScore> selectScore(String classname) {
        return leaderMapper.selectScore(classname);
    }

    @Override
    public TbScore selectScoreOne(String unum) {
        return leaderMapper.selectScoreOne(unum) ;
    }
}
