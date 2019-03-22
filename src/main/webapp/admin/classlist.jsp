<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>班级管理页面</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>

</head>
<body>

<div class="row" style="width: 100%;">
    <div class="col-md-12">
        <div class="panel panel-default">
            <div class="panel-heading">班级列表</div>
            <div class="panel-body">
                <!-- 添加班级 -->
                <div class="row">
                    <form action="addClass" method="get" >
                        <div class="col-xs-3 col-sm-3 col-md-3 col-lg-3">
                            <div class="form-group form-inline">
                                <span>添加班级</span>
                                <input type="text" name="classname" class="form-control">
                            </div>
                        </div>
                        <div class="col-xs-3 col-sm-3 col-md-3 col-lg-3">
                            <div class="form-group form-inline">
                                <span>讲师</span><br>
                                <select class="form-control" name="teachername">
                                    <c:forEach items="${tUserList}" var="tl" varStatus="i">
                                        <option value="${tl.username}">${tl.username}</option>
                                    </c:forEach>
                                </select>
                            </div>
                        </div>
                        <div class="col-xs-3 col-sm-3 col-md-3 col-lg-3">
                            <div class="form-group form-inline">
                                <span>班主任</span><br>
                                <select class="form-control" name="leadername">
                                    <c:forEach items="${lUserList}" var="ll" varStatus="i">
                                        <option value="${ll.username}">${ll.username}</option>
                                    </c:forEach>
                                </select>
                            </div>
                        </div>
                        <div class="col-xs-3 col-sm-3 col-md-3 col-lg-3">
                            <button type="submit" class="btn btn-primary btn-lg" id="search"><span class="glyphicon glyphicon-plus"></span></button>
                        </div>
                    </form>
                </div>
                <!-- 列表显示 -->
                <table id="tb_list" class="table table-striped table-hover table-bordered">
                    <tr class='tr_head'><td>编号</td><td>班级名称</td><td>讲师</td><td>班主任</td><td>操作</td></tr>
                    <c:forEach items="${classList}" var="cl" varStatus="i">
                        <tr>
                            <td>${i.count}</td>
                            <td>${cl.classname}</td>
                            <td>${cl.teachername}</td>
                            <td>${cl.teachername}</td>
                            <td><a href="deleteClass?classid=${cl.classid}" class='btn btn-danger btn-xs'>删除</a></td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </div>
    </div>
</div>
</body>
</html>

