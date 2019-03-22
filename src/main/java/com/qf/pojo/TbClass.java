package com.qf.pojo;

/**
 * Created by payne on 2018/11/12.
 */
public class TbClass {
    private int classid;
    private String classname;
    private String teachername;
    private String leadername;
    private String managername;
    private TbUser tbUser;


    public TbUser getTbUser() {
        return tbUser;
    }

    public void setTbUser(TbUser tbUser) {
        this.tbUser = tbUser;
    }

    public String getManagername() {
        return managername;
    }

    public void setManagername(String managername) {
        this.managername = managername;
    }

    public int getClassid() {
        return classid;
    }

    public void setClassid(int classid) {
        this.classid = classid;
    }

    public String getClassname() {
        return classname;
    }

    public void setClassname(String classname) {
        this.classname = classname;
    }

    public String getTeachername() {
        return teachername;
    }

    public void setTeachername(String teachername) {
        this.teachername = teachername;
    }

    public String getLeadername() {
        return leadername;
    }

    public void setLeadername(String leadername) {
        this.leadername = leadername;
    }

    @Override
    public String toString() {
        return "TbClass{" +
                "classid=" + classid +
                ", classname='" + classname + '\'' +
                '}';
    }
}
