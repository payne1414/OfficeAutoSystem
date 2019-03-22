<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>课程管理页面</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>

</head>
<body>

<div class="row" style="width: 100%;">
    <div class="col-md-12">
        <div class="panel panel-default">
            <div class="panel-heading">课程列表</div>
            <div class="panel-body">
                <form action="addCourse" method="get" >
                    <div class="col-xs-6 col-sm-6 col-md-6 col-lg-6">
                        <div class="form-group form-inline">
                            <span>添加课程</span>
                            <input type="text" name="cname" class="form-control">
                        </div>
                    </div>
                    <div class="col-xs-3 col-sm-3 col-md-3 col-lg-3">
                        <button type="submit" class="btn btn-primary" id="search"><span class="glyphicon glyphicon-plus"></span></button>
                    </div>
                </form>
                <!-- 列表显示 -->
                <table id="tb_list" class="table table-striped table-hover table-bordered">
                    <tr class='tr_head'><td>编号</td><td>课程名</td><td>操作</td></tr>
                    <c:forEach items="${courseList}" var="cl" varStatus="i">
                        <tr>
                            <td>${i.count}</td>
                            <td>${cl.cname}</td>
                            <td><a href="deleteCourse?cid=${cl.cid}" class='btn btn-danger btn-xs'>删除</a></td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </div>
    </div>
</div>
</body>
</html>