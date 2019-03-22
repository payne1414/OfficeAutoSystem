package com.qf.mapper;

import com.qf.pojo.TbClass;
import com.qf.pojo.TbManager;
import com.qf.pojo.TbScore;
import com.qf.pojo.TbUser;

import java.util.List;

/**
 * Created by Administrator on 2018/11/13.
 */
public interface ManagerMapper {
    //校长个人资料管理
    public TbUser selectManager(String unum);
    public int updateManager(TbUser tbUser);
    //成绩查看
    public List<TbClass> selectClass();
    public List<TbScore> selectScore(String classname);
    public TbScore selectScoreOne(String unum);
}
