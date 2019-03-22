package com.qf.service;

import com.qf.mapper.UserMapper;
import com.qf.pojo.TbUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by mzy06 on 2018/11/13.
 */
@Service("UserService")
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public UserMapper getUserMapper() {
        return userMapper;
    }

    public TbUser selectUserList(TbUser user) {
        return userMapper.selectUserListByUnum(user);
    }
}
