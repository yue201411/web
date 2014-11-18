<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="com.imyueyue.common.Constants"%>
<%request.setAttribute("ctx", request.getContextPath());%> 


<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="common" uri="http://javass.cn/common/" %>


  
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head> 
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>SiteMesh example: <sitemesh:write property='title'/></title>
    
    <link href="<c:url value='/themes/${themes }/media/css/css.css'/>" rel="stylesheet" type="text/css" media="all"></link>
    <script type="text/javascript" src="<c:url value='/themes/${themes }/media/js/jquery-1.3.2.js'/>"></script>
    <script type="text/javascript" src="<c:url value='/themes/${themes }/media/js/application.js'/>"></script>
    
    <sitemesh:write property='head'/>
  </head>
  <body>
    <h1> 路径  - <c:url value='/' /> ${ctx}</h1>
    <h1 class='title'>SiteMesh example site: <sitemesh:write property='title'/></h1>

    <div class='mainBody'>
      <sitemesh:write property='body'/>
    </div>

    <div class='disclaimer'>Site disclaimer. This is an example.</div>

  </body>
</html>