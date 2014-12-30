<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@page import="com.imyueyue.common.Constants"%>
<%request.setAttribute("ctx", request.getContextPath());%> 

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="common" uri="http://javass.cn/common/" %>

<!DOCTYPE html>
<!--[if lt IE 7 ]><html lang="en" class="ie6 ielt7 ielt8 ielt9"><![endif]--><!--[if IE 7 ]><html lang="en" class="ie7 ielt8 ielt9"><![endif]--><!--[if IE 8 ]><html lang="en" class="ie8 ielt9"><![endif]--><!--[if IE 9 ]><html lang="en" class="ie9"> <![endif]--><!--[if (gt IE 9)|!(IE)]><!--> 
<html lang="zh"><!--<![endif]--> 
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>YUECMS</title>

		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<link href="${ctx}/themes/${themes }/media/css/bootstrap.min.css" rel="stylesheet">
		<link href="${ctx}/themes/${themes }/media/css/bootstrap-responsive.min.css" rel="stylesheet">
		<link href="${ctx}/themes/${themes }/media/css/site.css" rel="stylesheet">
		<!--[if lt IE 9]><script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script><![endif]-->
	</head>
        
    </head>
    <body>
      <div id="login-page" class="container">
         <h3><spring:message code="users.Login.wellcome" /></h3>
         <form:form method="POST" class="well">
                <form:errors path="*" cssStyle="font-color:red"/>${errors}<br/>
                <label for="username" ><spring:message code="users.UserName" />:</label>
                <form:input path="username" class="span2" /><br/>
                <label for="password" ><spring:message code="users.Password" />:</label>
                <form:input path="password" class="span2" /><br/>
                <label class="checkbox"> <input type="checkbox" /><spring:message code="users.Remember.me" /> </label>
                <button type="submit"  class="btn btn-primary"><spring:message code="users.Sign.in" /></button><br/>
            </form:form>
      </div>       
    </body>
    
   <script src="${ctx}/themes/${themes }/media/js/jquery.min.js"></script>
   <script src="${ctx}/themes/${themes }/media/js/bootstrap.min.js"></script>
   <script src="${ctx}/themes/${themes }/media/js/site.js"></script>
   
</html>
