<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
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
            <div class="panel-heading">学生个人信息修改</div>
            <div class="panel-body">
                <!-- 列表显示 -->

                <table id="tb_list" class="table table-striped table-hover table-bordered">
                    <form action="updateTeacher2">
                        <tr class='tr_head'>
                            <input type="hidden" name="unum" value="${tbUser.unum}">
                            <td>讲师名</td>
                            <td><input type="text" name="username" value="${tbUser.username}"></td>
                        </tr>
                        <tr class='tr_head'>
                            <td>密码</td>
                            <td><input type="text" name="userpassword" value="${tbUser.userpassword}"></td>
                        </tr>
                        <tr class='tr_head'>
                            <td><input type="submit" value="提交"></td>
                        </tr>
                    </form>
                </table>

            </div>
        </div>
    </div>
</div>
</body>
</html>
