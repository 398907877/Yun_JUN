<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" />

<html>
<head>
<title>学校管理</title>
</head>

<body>
	<div class="page-header">
		<h1>
			学校管理 <small>管理系统操作学校</small>
		</h1>
	</div>
	<ol class="breadcrumb">
		<li><i class="fa fa-dashboard"></i>系统管理</li>
		<li>学校管理</li>
	</ol>

	<c:if test="${not empty message}">
		<div id="message" class="alert alert-success">
			<button data-dismiss="alert" class="close">×</button>
			${message}
		</div>
	</c:if>

	<table id="contentTable"
		class="table table-striped table-bordered table-condensed">
		<thead>
			<tr>
				<th>学校</th>
				<th>简称</th>
				<th>省份</th>
				<th>城市</th>
				<th>区域</th>
				<th>&nbsp;</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${schools.content}" var="school">
				<tr>
					<td><a href="${ctx}/mgr/schools/schoolView/${school.id}">${school.name}</a></td>
					<td>${school.abbr}</td>
					<td>${school.province}</td>
					<td>${school.city}</td>
					<td>${school.area}</td>
					<td class="buttons">
						<a href="${ctx}/mgr/schools/schoolUpdate/${school.id}"><span class="glyphicon glyphicon-off"></span>修改</a>
						<a href="${ctx}/mgr/schools/delete/${school.id}"><span class="glyphicon glyphicon-trash"></span>删除</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<div class="form-actions">
		<input id="submit_btn" class="btn btn-primary" type="submit" value="新增学校" onclick="location.href='${ctx}/mgr/schools/schoolAdd';"/>
	</div>
	
	<tags:pagination page="${schools}" paginationSize="5"/>
	
	
	<script type="text/javascript">
	$(document).ready(function() {
		$("#nav_sys").addClass("active");
	});
	</script>
	
</body>
</html>
