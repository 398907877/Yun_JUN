<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" />

<html>
<head>
<title>用户管理</title>
</head>

<body>
	<div class="page-header">
		<h1>
			用户管理 <small>管理系统操作用户</small>
		</h1>
	</div>
	<ol class="breadcrumb">
		<li><i class="fa fa-dashboard"></i>系统管理</li>
		<li>用户管理</li>
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
				<th>登录名</th>
				<th>用户名</th>
				<th>角色</th>
				<th>注册时间</th>
				<th>&nbsp;</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${users}" var="user">
				<tr>
					<td><a href="${ctx}/admin/user/update/${user.id}">${user.loginName}</a></td>
					<td>${user.name}</td>
					<td><tags:dictView className="ROLE" value="${user.roles}"></tags:dictView>
					</td>
					<td><fmt:formatDate value="${user.registerDate}" pattern="yyyy年MM月dd日  HH时mm分ss秒" /></td>
					<td class="buttons">
						<a href="${ctx}/admin/user/lock/${user.id}"><span class="glyphicon glyphicon-off"></span>锁定</a>
						<a href="${ctx}/admin/user/delete/${user.id}"><span class="glyphicon glyphicon-trash"></span>删除</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	<div class="form-actions">
		<input id="submit_btn" class="btn btn-primary" type="submit" value="新增用户" />
	</div>
	<script type="text/javascript">
	$(document).ready(function() {
		$("#nav_sys").addClass("active");
	});
	</script>
</body>
</html>
