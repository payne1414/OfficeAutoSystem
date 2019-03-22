package com.qf.mapper;

import com.qf.pojo.TbUser;

import java.util.List;

/**
 * Created by mzy06 on 2018/11/13.
 */
public interface UserMapper {
    public TbUser selectUserListByUnum(TbUser user);
}
