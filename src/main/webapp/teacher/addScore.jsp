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
            <div class="panel-heading">讲师录入学生成绩</div>
            <div class="panel-body">
                <!-- 列表显示 -->
                    <form action="addScore">
                        <tr class='tr_head'>
                            分数：<input type="text" name="score"><br>
                            阶段：<input type="text" name="moment"></td><br>
                            学号：<input type="text" name="unum"><br>
                            班级：<input type="text" name="classname"><br>
                            <input type="submit" value="提交">
                        </tr>
                    </form>
            </div>
        </div>
    </div>
</div>
</body>
</html>
