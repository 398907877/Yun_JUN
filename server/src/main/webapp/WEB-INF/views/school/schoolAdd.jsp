<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>


<html>
<head>
	<title>学校增加页面</title>
	
	<script>
		$(document).ready(function() {
			//聚焦第四个输入框
			$("#name").focus();
			//为inputForm注册validate函数
			$("#inputForm").validate({
				rules: {
					name: {
						remote: "${ctx}/mgr/schools/checkName"
					}
				},
				messages: {
					name: {
						remote: "学校名已存在"
					}
				}
			});
		});
	</script>
</head>

<body>
	<form id="inputForm" action="${ctx}/mgr/schools/add" method="post" class="form-horizontal">
		<fieldset>
			<legend><small>增加学校</small></legend>
			<div class="control-group">
			<tags:state/>
			</div>
			<div class="control-group">
				<label for="name" class="control-label">学校:</label>
				<div class="controls">
					<input type="text" id="name" name="name" class="input-large required"/>
				</div>
			</div>
			<div class="control-group">
				<label for="abbr" class="control-label">简称:</label>
				<div class="controls">
					<input type="text" id="abbr" name="abbr" class="input-large required"/>
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
