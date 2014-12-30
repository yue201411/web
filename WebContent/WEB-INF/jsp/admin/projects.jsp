<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

 <div class="span9">
					<h4>
						<spring:message code="Admins.Projects" />
					</h4>
					
					<table class="table table-bordered table-striped">
        <tr>
                        <th>栏目ID</th>
                        <th>所属栏目ID</th>
                        <th>项目名称</th>
                        <th>是否激活</th>
                        <th>登记时间</th>
                        <th>操作</th>
        </tr>
        <c:forEach items="${page.items}" var="t" varStatus="status">
        <tr>
                        <td>${ t.channelID }</td>
                        <td>${ t.parentID }</td>
                        <td>${ t.channelPath }</td>
                        <td>${ t.isActive }</td>
                        <td>${ t.addTime }</td>
                        <td><a href="<c:url value='/admin/projects/${t.channelID}/delete'/>">删除</a>|<a href="<c:url value='/admin/projects/${t.channelID}/update'/>">修改</a></td>
        </tr>
        </c:forEach>
         </table>
                  <common:pageV2 url="/admin/projects" optimize="true"/>
					
					<a class="toggle-link" href="#new-project"><b class="icon-plus"></b> <spring:message code="Admins.Projects.Add" /></a>
					
					<form:form method="POST" modelAttribute="command" id="new-project" class="form-horizontal hidden">
					    <form:errors path="*" cssStyle="font-color:red"/><br/>
						<fieldset>
							<legend></legend>
							<div class="control-group">
								<label class="control-label" for="input01"><spring:message code="Admins.Projects.Name" /></label>
								<div class="controls">
									<form:input path="channelID" class="input-xlarge"  />
								</div>
							</div>
							<div class="control-group">
								<label class="control-label" for="input01"><spring:message code="Admins.Projects.Name" /></label>
								<div class="controls">
									<form:input path="channelPath" class="input-xlarge"  />
								</div>
							</div>
							<div class="control-group">
								<label class="control-label" for="select01"><spring:message code="Admins.Projects.Client" /></label>
								<div class="controls">
									<select id="select01"> 
									<option>-- 选择 上级目录--</option>
									<c:forEach items="${page.items}" var="row" varStatus="status">
									  <option value="${ row.channelID }">${ row.channelPath }</option> 
									</c:forEach> 
									</select>
								</div>
							</div>
							<div class="control-group">
								<label class="control-label" for="textarea"><spring:message code="Admins.Projects.Summary" /></label>
								<div class="controls">
									<textarea class="input-xlarge" id="textarea" rows="3"></textarea>
								</div>
							</div>
							<div class="form-actions">
								<button type="submit" class="btn btn-primary"><spring:message code="Admins.Projects.Create" /></button> <button class="btn"><spring:message code="Admins.Projects.Cancel" /></button>
							</div>
						</fieldset>
					</form:form>
				</div>
		