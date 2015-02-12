<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>


<html>
<head>
	<title>学校更新页面</title>
</head>

<body>
	<form id="inputForm" action="${ctx}/mgr/schools/update" method="post" class="form-horizontal">
		<fieldset>
			<legend><small>更新学校</small></legend>
			<div class="control-group">
			<tags:state/>
			</div>
			<div class="control-group">
				<label for="name" class="control-label">学校:</label>
				<div class="controls">
					<input type="hidden" name="id" value="${school.id}"/>
					<input type="text" id="name" name="name"  value="${school.name}" class="input-large required" disabled="disabled"/> 
				</div>
			</div>
			<div class="control-group">
				<label for="abbr" class="control-label">简称:</label>
				<div class="controls">
					<input type="text" id="abbr" name="abbr" value="${school.abbr}" class="input-large required"/> 
				</div>
			</div>
			<div class="form-actions">
				<input id="submit_btn" class="btn btn-primary" type="submit" value="提交"/>&nbsp;	
				<input id="cancel_btn" class="btn" type="button" value="返回" onclick="history.back()"/>
			</div>
		</fieldset>
	</form>
</body>
</html>
