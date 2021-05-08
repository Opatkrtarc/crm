<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title></title>


    <link rel="stylesheet" href="/static/js/plugins/jquery-easyui/themes/default/easyui.css" type="text/css"/>
    <link rel="stylesheet" href="/static/js/plugins/jquery-easyui/themes/icon.css" type="text/css"/>
    <script type="text/javascript" src="/static/js/plugins/jquery-easyui/jquery.min.js"></script>
    <script type="text/javascript" src="/static/js/plugins/jquery-easyui/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="/static/js/plugins/jquery-easyui/locale/easyui-lang-zh_CN.js"></script>
    <script type="text/javascript" src="/static/js/system/index.js"></script>

    <link rel="stylesheet" href="/static/css/reset.css">
    <link rel="stylesheet" href="/static/css/public.css">
</head>
<body>

<div class="easyui-layout" fit="true">
    <div data-options="region:'north',height:70,split:true" >
       <%-- <h1 align="center">叩丁狼员工管理系统</h1>--%>
           <div class="public-header-warrp">
               <div class="public-header">
                   <div class="content">
                       &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<img  src="/static/images/logo.png"/>
                       <div class="public-header-admin fr">
                           <p class="admin-name"><font  color ="green">您好！</font> </p>
                           <div class="public-header-fun fr">
                               <a href="/logout" class="public-header-loginout">安全退出</a>
                           </div>
                       </div>
                   </div>
               </div>
           </div>
    </div>
    <div data-options="region:'south',height:40" >
        <p align="center">版权声明</p>
    </div>
    <div data-options="region:'west',width:150" >
        <div class="easyui-accordion" fit="true">
            <div title="客户管理">
                <ul id="index_tree"></ul>
            </div>
            <div title="车险投保">
                <ul id="index_tree2"></ul>
            </div>
            <div title="理赔管理">
                <ul id="index_tree3"></ul>
            </div>
            <div title="系统管理">
                <ul id="index_tree4"></ul>
            </div>
        </div>
    </div>
    <div data-options="region:'center'" >
        <div id="index_tabs" fit="true">
            <div title="主页" fit="true">
                欢迎进入主页
            </div>
        </div>
    </div>
</div>


</body>
</html>