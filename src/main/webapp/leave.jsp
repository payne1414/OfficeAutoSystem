<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>管理页面</title>
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <script src="js/jquery.min.js"></script>
    <script src="js/bootstrap.min.js"></script>

</head>
<body>

<div class="row" style="width: 100%;">
    <div class="col-md-12">
        <div class="panel panel-default">
            <div class="panel-heading">请假界面</div>
            <div class="panel-body">
                <!-- 列表显示 -->
                <table id="tb_list" class="table table-striped table-hover table-bordered">
                    <form action="addLeave" method="post" class="form-inline">
                        <tr class='tr_head'>
                            <div class="form-group form-inline ">
                            请假时间：<input type="date" name="startDay" class="form-control">
                            <select name="startHour" class="form-control">
                                <option value="9">9</option>
                                <option value="10">10</option>
                                <option value="11">11</option>
                                <option value="12">12</option>
                            </select>
                                <select name="startMinuter" class="form-control">
                                    <option value="00">00</option>
                                    <option value="30">30</option>
                                </select>--
                            <input type="date" name="endDay" class="form-control">
                            <select name="endHour" class="form-control">
                                <option value="9">9</option>
                                <option value="10">10</option>
                                <option value="11">11</option>
                                <option value="12">12</option>
                            </select>
                                <select name="endMinuter" class="form-control">
                                    <option value="00">00</option>
                                    <option value="30">30</option>
                                </select><br>
                             共计<input class="form-control" type="text" name="days">天
                            </div>
                            请假原因：<textarea name="reason" class="form-control" rows="10"></textarea><br>
                            <input type="hidden" name="unum" value="${unum}">
                            <input type="hidden" name="username" value="${username}">
                            <button type="submit" class="btn btn-primary"><span class="glyphicon glyphicon-ok"></span></button>
                        </tr>
                    </form>
                </table>

            </div>
        </div>
    </div>
</div>
</body>
</html>