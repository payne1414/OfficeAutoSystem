<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>员工管理页面</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>

</head>
<body>

<div class="row" style="width: 100%;">
    <div class="col-md-12">
        <div class="panel panel-default">
            <div class="panel-heading">员工列表</div>
            <div class="panel-body">
                <!-- 条件查询 -->
                <div class="row">
                    <form action="staffListByNameOrPosition" method="get" >
                        <div class="col-xs-6 col-sm-6 col-md-6 col-lg-6">
                            <div class="form-group form-inline">
                                <span>员工姓名</span>
                                <input type="text" name="username" class="form-control">
                            </div>
                        </div>
                        <div class="col-xs-3 col-sm-3 col-md-3 col-lg-3">
                            <div class="form-group form-inline">
                                <span>职位</span>
                                &nbsp;&nbsp;&nbsp;&nbsp;
                                <select class="form-control" name="position">
                                    <c:forEach items="${positionList}" var="pl" varStatus="i">
                                    <option value="${pl.position}">${pl.position}</option>
                                    </c:forEach>
                                </select>
                            </div>
                        </div>
                        <div class="col-xs-3 col-sm-3 col-md-3 col-lg-3">
                            <button type="submit" class="btn btn-primary" id="search"><span class="glyphicon glyphicon-search"></span></button>
                        </div>
                    </form>
                </div>
                <!-- 列表显示 -->
                <table id="tb_list" class="table table-striped table-hover table-bordered">
                    <tr class='tr_head'><td>工号</td><td>员工名字</td><td>职位</td><td>操作</td></tr>
                    <c:forEach items="${staffList}" var="sl" varStatus="i">
                        <tr>
                            <td>${sl.unum}</td>
                            <td>${sl.username}</td>
                            <td>${sl.position}</td>
                            <td><a href="deleteStaff?uid=${sl.uid}" class='btn btn-danger btn-xs'>删除</a></td>
                        </tr>
                    </c:forEach>
                </table>
            </div>
        </div>
    </div>
</div>
</body>
</html>

