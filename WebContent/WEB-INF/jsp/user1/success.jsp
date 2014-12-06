<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
    <head>
        <title>操作成功</title>
        <meta http-equiv="refresh" content="3;url=<c:url value='/user'/>"/>
    </head>
    <body>
    =============<br/>
        操作成功,3秒后返回！<br/>
     <a href="<c:url value='/user'/>">返回列表</a><br/>
    =============<br/>
    </body>
</html>
