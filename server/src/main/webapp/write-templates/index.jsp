<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>
<%@ page session="false"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<html>
<head>
	<title>租户活动管理</title>
	<link href="${ctx}/static/bootstrap/additions/lightbox/bootstrap-lightbox.min.css" type="text/css" rel="stylesheet" />
	<script src="${ctx}/static/bootstrap/additions/lightbox/bootstrap-lightbox.min.js" type="text/javascript"></script>
</head>
<body>
   
	<div >
		<div class="page-header">
			<h3>租户活动管理</h3>
		</div>
		 <c:if test="${not empty message}">
			<div id="message" class="alert alert-success"><button data-dismiss="alert" class="close">×</button>${message}</div>
		</c:if>
		<div class="bs-callout bs-callout-info">
		    <p>输入查询条件过滤列表.</p>
		    <form id="queryForm" class="form-inline" role="form"  method="get" action="${ctx}/mgr/events/index">
				<label>活动名称：</label> 
				<input name="search_LIKE_name" type="text" class="form-control" value="${param.search_LIKE_name}" /> 
				<input type="submit" class="btn btn-success" value="查 找" />
			</form>
		</div>
		
		<table class="table table-striped table-bordered table-condensed">
			<thead>
				<tr>
					<th title="编号">编号</th>
					<th title="活动名称">活动名称</th>
					<th title="起始日期">起始日期</th>
					<th title="截止日期">截止日期</th>
					<th title="创建日期">创建日期</th>
				</tr>
			</thead>
			<tbody>
				<c:forEach items="${events.content}" var="event" varStatus="s">
				
					<tr>
						<td>
							<div class="btn-group">
								<button type="button" class="btn btn-info">操作</button>
								<button type="button" class="btn btn-info dropdown-toggle" data-toggle="dropdown">
							        <span class="caret"></span>
							        <span class="sr-only">Toggle Dropdown</span>
							      </button>
								<ul class="dropdown-menu">
									<li><a href="${ctx}/mgr/events/delete/${event.id}">删除</a></li>
								</ul>
							</div>
						</td>
						<td>
							<a class="myLightbox" data-toggle="lightbox" href="#demoLightbox">${event.title}</a>
						</td>
						<td>
							<fmt:formatDate value="${event.startDate}" pattern="yyyy年MM月dd日  HH时mm分ss秒" />
						</td>
						<td>
							<fmt:formatDate value="${event.endDate}" pattern="yyyy年MM月dd日  HH时mm分ss秒" />
						</td>
						<td>
							<fmt:formatDate value="${event.crtDate}" pattern="yyyy年MM月dd日  HH时mm分ss秒" />
						</td>
					</tr>
				</c:forEach>
			</tbody>
		</table>
		<div id="demoLightbox" class="lightbox hide fade"  tabindex="-1" role="dialog" aria-hidden="true">
			<div class='lightbox-content'>
				<div class="lightbox-caption"><p>Your caption here</p></div>
			</div>
		</div>
		<div class="row">
			<div class="col-sm-2">
				<a href="<%=request.getContextPath()%>/mgr/events/add" class="btn btn-primary"><span class="glyphicon glyphicon-plus"></span>新建活动</a>
			</div>
			<div class="col-sm-10">
				<tags:pagination page="${events}" paginationSize="5"/>
			</div>
		</div>
		
		<script type="text/javascript">
			$("#tenancy").addClass("active");
			$(document).ready(function(){
				$('.myLightbox').click(function(){
					$(this).lightbox();
				});
			});
	
		</script> 	
	</div>
</body>
</html>