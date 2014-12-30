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
		<title>YUECMS <sitemesh:write property='title'/></title>
		<meta name="viewport" content="width=device-width, initial-scale=1.0">
		<link href="${ctx}/themes/${themes }/media/css/bootstrap.min.css" rel="stylesheet">
		<link href="${ctx}/themes/${themes }/media/css/bootstrap-responsive.min.css" rel="stylesheet">
		<link href="${ctx}/themes/${themes }/media/css/site.css" rel="stylesheet">
		<!--[if lt IE 9]><script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script><![endif]-->
	    <sitemesh:write property='head'/>
	</head>
  <body>

     <div class="container">
      <div class="navbar">
				<div class="navbar-inner">
					<div class="container">
						<a class="btn btn-navbar" data-toggle="collapse" data-target=".nav-collapse"> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span> </a> <a class="brand" href="#">YUECMS</a>
						<div class="nav-collapse">
							<ul class="nav">
								<li ${index}>
									<a href="<c:url value='/admin/index' />"> <spring:message code="Admins.Dashboard" /></a>
								</li>
								<li ${settings}>
									<a href="<c:url value='/admin/settings' />"><spring:message code="Admins.Account.Settings" /></a>
								</li>
								<li>
									<a href="help.htm"><spring:message code="Admins.Help" /></a>
								</li>
								<li class="dropdown">
									<a href="help.htm" class="dropdown-toggle" data-toggle="dropdown">Tours <b class="caret"></b></a>
									<ul class="dropdown-menu">
										<li>
											<a href="help.htm">Introduction Tour</a>
										</li>
										<li>
											<a href="help.htm">Project Organisation</a>
										</li>
										<li>
											<a href="help.htm">Task Assignment</a>
										</li>
										<li>
											<a href="help.htm">Access Permissions</a>
										</li>
										<li class="divider">
										</li>
										<li class="nav-header">
											Files
										</li>
										<li>
											<a href="help.htm">How to upload multiple files</a>
										</li>
										<li>
											<a href="help.htm">Using file version</a>
										</li>
									</ul>
								</li>
							</ul>
							<form class="navbar-search pull-left" action="">
								<input type="text" class="search-query span2" placeholder="Search" />
							</form>
							<ul class="nav pull-right">
								<li>
									<a href="profile.htm">${users.getUserName()}</a>
								</li>
								<li>
									<a href="<c:url value='/logout' /> ">Logout</a>
								</li>
							</ul>
						</div>
					</div>
				</div>
			</div>
			<div class="row">
				<div class="span3">
					<div class="well" style="padding: 8px 0;">
						<ul class="nav nav-list">
							<li class="nav-header">
								<spring:message code="Admins.Menus" />
							</li>
							<li ${index}>
								<a href="index.htm"><i class="icon-home"></i> <spring:message code="Admins.Dashboard" /></a>
							</li>
							<li ${projects}>
								<a href="projects.htm"><i class="icon-folder-open"></i> <spring:message code="Admins.Projects" /></a>
							</li>
							<li>
								<a href="tasks.htm"><i class="icon-check"></i> <spring:message code="Admins.Tasks" /></a>
							</li>
							<li>
								<a href="messages.htm"><i class="icon-envelope"></i> <spring:message code="Admins.Messages" /></a>
							</li>
							<li>
								<a href="files.htm"><i class="icon-file"></i> <spring:message code="Admins.Files" /></a>
							</li>
							<li>
								<a href="activity.htm"><i class="icon-list-alt"></i> <spring:message code="Admins.Activity" /></a>
							</li>
							<li class="nav-header">
								<spring:message code="Admins.Account" />
							</li>
							<li>
								<a href="profile.htm"><i class="icon-user"></i> <spring:message code="Admins.Account.Profile" /></a>
							</li>
							<li ${settings}>
								<a href="settings.htm"><i class="icon-cog"></i> <spring:message code="Admins.Account.Settings" /></a>
							</li>
							<li class="divider">
							</li>
							<li>
								<a href="help.htm"><i class="icon-info-sign"></i> <spring:message code="Admins.Help" /></a>
							</li>
							<li class="nav-header">
								<spring:message code="Admins.Templates" />
							</li>
							<li>
								<a href="gallery.htm"><i class="icon-picture"></i> <spring:message code="Admins.Gallery" /></a>
							</li>
							
						</ul>
					</div>
				</div>
			 <sitemesh:write property='body'/>
			 </div>
			 
			 
			
	</div>		
   
   <script src="${ctx}/themes/${themes }/media/js/jquery.min.js"></script>
   <script src="${ctx}/themes/${themes }/media/js/bootstrap.min.js"></script>
   <script src="${ctx}/themes/${themes }/media/js/site.js"></script>
   
  </body>
</html>