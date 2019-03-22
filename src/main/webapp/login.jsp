<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>嘀嗒OA教育教学系统</title>
    <link rel="stylesheet" type="text/css" href="css/bootstrap.css"/>
    <link rel="stylesheet" href="css/jigsaw.css">
    <style type="text/css">
        body {
            background-image: url(image/shouji.jpg);
            background-attachment: fixed;
            background-repeat: no-repeat;
            background-size: 100%, 100%;
        }

        .container {
            width: 310px;
            margin: 100px auto;
        }

        input {
            display: block;
            width: 290px;
            line-height: 40px;
            margin: 10px 0;
            padding: 0 10px;
            outline: none;
            border: 1px solid #c8cccf;
            border-radius: 4px;
            color: #6a6f77;
        }

        #msg {
            width: 100%;
            line-height: 40px;
            font-size: 14px;
            text-align: center;
        }

        a:link, a:visited, a:hover, a:active {
            margin-left: 100px;
            color: #0366D6;
        }
    </style>
</head>
<body>
<div class="container" style="width:400px;margin-top: 100px;">
    <h3>嘀嗒OA教育教学管理系统</h3>
    <form action="login" method="post" class="form-horizontal" style="line-height: 10px">
        <label for="unum" class="glyphicon glyphicon-user"></label>
        <input style="opacity:0.6" type="text" class="form-control" name="unum" id="unum" placeholder="请输入您的工号"
               required autofocus>
        <label for="userpassword" class="glyphicon glyphicon-lock"></label>
        <input style="opacity:0.6" type="password" class="form-control" name="userpassword" id="userpassword"
               placeholder="请输入您的密码" required><br>

        <div id="captcha" style="position: relative"></div>
        <div id="msg" ></div>
        <input style="width:320px" type="submit" class="btn btn-primary " name="" id="login" value="登录" disabled="disabled"/>
        <button type="reset" class="btn btn-info"><span class="glyphicon glyphicon-repeat"></span></button>
    </form>
</div>
<script src="js/jigsaw.js"></script>
<script>
    jigsaw.init(document.getElementById('captcha'), function () {
        document.getElementById('msg').innerHTML = '验证成功！'
        document.getElementById('login').disabled=false
    })
</script>
</body>
</html>