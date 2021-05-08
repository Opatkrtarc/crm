<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>狼码客户关系管理系统</title>
    <link rel="stylesheet" href="/static/css/style.css">
    <link rel="stylesheet" href="/static/js/plugins/jquery-easyui/themes/default/easyui.css" type="text/css"/>
    <link rel="stylesheet" href="/static/js/plugins/jquery-easyui/themes/icon.css" type="text/css"/>
    <script type="text/javascript" src="/static/js/plugins/jquery-easyui/jquery.min.js"></script>
    <script type="text/javascript" src="/static/js/plugins/jquery-easyui/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="/static/js/plugins/jquery-easyui/locale/easyui-lang-zh_CN.js"></script>
    <script type="text/javascript">
        function login(){
            $('#loginForm').form("submit",{
                url:"/login2",
                success:function(data){
                    //后续改用shiro
                    data=$.parseJSON(data)
                    if(data.success){
                        window.location.href='/index'
                    }else{
                        $.messager.alert('温馨提示',data.msg);
                    }
                }
            });
        }
    </script>

</head>
<body>
<section class="container">
    <div class="login">
        <h1>用户登录</h1>
        <form id="loginForm" method="post">
            <p><input type="text" name="username" value="" placeholder="账号"></p>
            <p><input type="password" name="password" value="" placeholder="密码"></p>
            <p class="submit">
                <input type="button" value="登录" onclick="login()">
                <input type="button" value="重置">
            </p>
        </form>
    </div>
</section>
<div style="text-align:center;" class="login-help">
    <p>Copyright ©2017 狼码教育科技有限公司</p>
</div>
</html>