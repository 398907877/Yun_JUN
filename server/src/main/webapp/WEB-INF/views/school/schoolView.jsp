<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>


<html>
<head>
	<title>学校更新页面</title>
</head>

<body>
	<form id="inputForm" action="" method="post" class="form-horizontal">
		<fieldset>
			<legend><small>学校信息</small></legend>
			<div class="control-group">
				<label for="name" class="control-label">省份:</label>
				<div class="controls">
					<input type="text" id="province" name="province"  value="${school.province}" class="input-large required" disabled="disabled"/> 
				</div>
			</div>
			<div class="control-group">
				<label for="name" class="control-label">城市:</label>
				<div class="controls">
					<input type="text" id="city" name="city"  value="${school.city}" class="input-large required" disabled="disabled"/> 
				</div>
			</div>
			<div class="control-group">
				<label for="name" class="control-label">区域:</label>
				<div class="controls">
					<input type="text" id="area" name="area"  value="${school.area}" class="input-large required" disabled="disabled"/> 
				</div>
			</div>
			<div class="control-group">
				<label for="name" class="control-label">学校:</label>
				<div class="controls">
					<input type="text" id="name" name="name"  value="${school.name}" class="input-large required" disabled="disabled"/> 
				</div>
			</div>
			<div class="control-group">
				<label for="abbr" class="control-label">简称:</label>
				<div class="controls">
					<input type="text" id="abbr" name="abbr" value="${school.abbr}" class="input-large required" disabled="disabled"/> 
				</div>
			</div>
			<div class="form-actions">
				<input id="cancel_btn" class="btn" type="button" value="返回" onclick="history.back()"/>
			</div>
		</fieldset>
	</form>
</body>
</html>
