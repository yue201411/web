<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
    <head>
        <title>登录</title>
    </head>
    <body>
         <form:form method="POST">
               
                <form:errors path="*" cssStyle="font-color:red"/>${errors}<br/>
                <label for="username" class="label">用户名:</label>
                <form:input path="username"/><br/>
                <label for=password class="label">密码:</label>
                <form:input path="password"/><br/>
                <label class="label" />
               <input type="submit" value="确定"/><br/>
            </form:form>

    </body>
</html>
