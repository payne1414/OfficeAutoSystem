package com.qf.service;

import com.qf.mapper.ManagerMapper;
import com.qf.pojo.TbClass;
import com.qf.pojo.TbManager;
import com.qf.pojo.TbScore;
import com.qf.pojo.TbUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/11/13.
 */
@Service
public class ManagerServiceImpl implements ManagerService {
    @Autowired
    private ManagerMapper managerMapper;

    public ManagerMapper getManagerMapper() {
        return managerMapper;
    }

    public void setManagerMapper(ManagerMapper managerMapper) {
        this.managerMapper = managerMapper;
    }

    @Override
    public TbUser selectManager(String unum) {
        return managerMapper.selectManager(unum);
    }

    @Override
    public int updateManager(TbUser tbUser) {
        return managerMapper.updateManager(tbUser);
    }

    @Override
    public List<TbClass> selectClass() {
        return managerMapper.selectClass();
    }

    @Override
    public List<TbScore> selectScore(String classname) {
        return managerMapper.selectScore(classname);
    }

    @Override
    public TbScore selectScoreOne(String unum) {
        return managerMapper.selectScoreOne(unum);
    }
}
