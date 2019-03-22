package com.qf.controller;

import com.qf.pojo.TbUser;
import com.qf.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

/**
 * Created by mzy06 on 2018/11/13.
 */
@Controller

public class UserController {
    @Autowired
    private UserService service;

    @RequestMapping("login")
    public String login(TbUser tbuser, Map<String, Object> map, HttpSession session) {
        //业务逻辑层返回模型数据
        TbUser realUser = service.selectUserList(tbuser);
        if (realUser != null) {
            //把用户数据保存在session当中
            session.setAttribute("username",realUser.getUsername());
            session.setAttribute("unum", tbuser.getUnum());
            if (realUser.getPosition().equals("admin")) {
                return "/admin.jsp";   //管理员页面
            } else if (realUser.getPosition().equals("teacher")) {
                return "/teacher.jsp";    //老师页面
            } else if (realUser.getPosition().equals("leader")) {
                return "/leader.jsp"; //班主任页面
            } else if (realUser.getPosition().equals("manager")) {
                return "/manager.jsp"; //校长页面
            } else {
                return "/student.jsp"; //学生页面
            }
            //登录成功
        } else {
            //登录失败
            map.put("error", "账号或密码错误");
            return "/login.jsp";   //返回登录页面
        }
    }
    @RequestMapping("logout")
    public String logout(HttpSession session){
        session.invalidate();
        return "redirect:/login.jsp";
    }

}
