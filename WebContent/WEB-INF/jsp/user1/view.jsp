<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<html>
    <head>
        <title>浏览 ==== ${ctx}</title>
       
    </head>
    <body>
            浏览<br/>
            =============<br/>
            <label>${command.id}</label><br/>
            <label>${command.username}</label><br/>
            <label>${command.email}</label><br/>
            <label>${command.registerDate}</label><br/>
            =============<br/>
    </body>
</html>
