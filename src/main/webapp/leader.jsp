<?xml version="1.0" encoding="UTF-8" ?>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8">
    <title>后台首页</title>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <link href="css/bootstrap.min.css" rel="stylesheet">
        <script src="js/jquery.min.js"></script>
        <script src="js/bootstrap.min.js"></script>
        <title>后台主页面</title>
        <style>
            @media ( min-width :768px ) {
                #left_tab {
                    width: 250px;
                    position: absolute;
                    z-index: 1;
                    height: 640px;
                }
                .mysearch {
                    margin: 10px;
                }
                .page_main {
                    margin-left: 255px;
                }
                .dv_content{
                    width: 100%;
                    height: 500px;
                }
            }
        </style>
    </head>
<body>
<!--导航 -->
<div style="width: 80%;margin-left: 10%;">
    <nav class="navbar navbar-default navbar-static-top">
        <div class="navbar-header">
            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#left_tab,#top_right">
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
                <span class="icon-bar"></span>
            </button>
            <a href="#" class="navbar-brand">班主任管理页面</a>
        </div>
        <ul id="top_right" class="collapse navbar-collapse nav navbar-nav navbar-right"	style="margin-right: 20px;">
            <li>
                <a href="#">
                    <span class="badge"	style="background-color: red;">23</span>
                </a>
            </li>
            <li>
                <a href="userLogout?t=1">
                    <span class="glyphicon glyphicon-off"></span>注销
                </a>
            </li>
        </ul>
        <!--左侧边栏 -->
        <div id="left_tab" style="margin-top: 70px;" class="collapse navbar-default navbar-collapse">
            <ul class="nav panel-group" id="myPanel">
                <!--栏目-->
                <li class="panel">
                    <a href="#sub1" data-toggle="collapse" data-parent="#myPanel"> 个人资料管理
                        <span class="glyphicon glyphicon-triangle-bottom pull-right"></span>
                    </a>
                    <ul id="sub1" class="nav panel-collapse collapse">
                        <li>
                            <a href="#" id="showGood" target="main">
                                <span class="glyphicon glyphicon-record"></span>&nbsp;&nbsp;个人资料管理
                            </a>
                        </li>
                    </ul>
                </li>
                <li class="panel">
                    <a href="#sub2" data-toggle="collapse" data-parent="#myPanel"> 周报查看
                        <span class="glyphicon glyphicon-triangle-bottom pull-right"></span>
                    </a>
                    <ul id="sub2" class="nav panel-collapse collapse">
                        <li>
                            <a href="#" id="showGoo" target="main">
                                <span class="glyphicon glyphicon-record"></span>&nbsp;&nbsp;查看周报
                            </a>
                        </li>
                    </ul>
                </li>
                <li class="panel">
                    <a href="#sub3" data-toggle="collapse" data-parent="#myPanel"> 请假审批
                        <span class="glyphicon glyphicon-triangle-bottom pull-right"></span>
                    </a>
                    <ul id="sub3" class="nav panel-collapse collapse">
                        <li>
                            <a href="#" id="showGo" target="main">
                                <span class="glyphicon glyphicon-record"></span>&nbsp;&nbsp;请假审批
                            </a>
                        </li>
                    </ul>
                </li>
                <li class="panel">
                    <a href="#sub4" data-toggle="collapse" data-parent="#myPanel"> 学生管理
                        <span class="glyphicon glyphicon-triangle-bottom pull-right"></span>
                    </a>
                    <ul id="sub4" class="nav panel-collapse collapse">
                        <li>
                            <a href="#" id="showG" target="main">
                                <span class="glyphicon glyphicon-record"></span>&nbsp;&nbsp;学生管理
                            </a>
                        </li>

                    </ul>
                </li>
                <li class="panel">
                    <a href="#sub5" data-toggle="collapse" data-parent="#myPanel"> 学生信息查看
                        <span class="glyphicon glyphicon-triangle-bottom pull-right"></span>
                    </a>
                    <ul id="sub5" class="nav panel-collapse collapse">
                        <li>
                            <a href="#" id="sh" target="main">
                                <span class="glyphicon glyphicon-record"></span>&nbsp;&nbsp;班级成绩查看
                            </a>
                        </li>
                        <li>
                            <a href="#" id="sho" target="main">
                                <span class="glyphicon glyphicon-record"></span>&nbsp;&nbsp;学生个人成绩查看
                            </a>
                        </li>
                    </ul>
                </li>
                <li class="panel">
                    <a href="#sub6" data-toggle="collapse" data-parent="#myPanel"> 个人请假
                        <span class="glyphicon glyphicon-triangle-bottom pull-right"></span>
                    </a>
                    <ul id="sub6" class="nav panel-collapse collapse">
                        <li>
                            <a href="#" id="shot" target="main">
                                <span class="glyphicon glyphicon-record"></span>&nbsp;&nbsp;个人请假
                            </a>
                        </li>
                    </ul>
                </li>
            </ul>
        </div>
    </nav>
    <!--右侧部分-->
    <div class="page_main">

        <iframe name="main" class="dv_content" frameborder="0" scrolling="no">

        </iframe>
    </div>
</div>
</body>
</html>
