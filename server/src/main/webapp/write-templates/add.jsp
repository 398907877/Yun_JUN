<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<html>
<head>
	<title>租户活动管理 - 新增活动</title>
	<link href="${ctx}/static/bootstrap/additions/wysihtml5/bootstrap-wysihtml5.css" type="text/css" rel="stylesheet" />
	<link href="${ctx}/static/bootstrap/additions/jasny/jasny-bootstrap.min.css" type="text/css" rel="stylesheet" />
	
	<script src="${ctx}/static/bootstrap/additions/wysihtml5/wysihtml5-0.3.0.min.js" type="text/javascript"></script>
	<script src="${ctx}/static/bootstrap/additions/wysihtml5/bootstrap3-wysihtml5.js" type="text/javascript"></script>
	<script src="${ctx}/static/bootstrap/additions/wysihtml5/locales/bootstrap-wysihtml5.zh-CN.js" type="text/javascript"></script>
	
	<link href="${ctx}/static/bootstrap/additions/datepicker/bootstrap-datetimepicker.min.css" type="text/css" rel="stylesheet" />
	<script src="${ctx}/static/bootstrap/additions/datepicker/bootstrap-datetimepicker.min.js" type="text/javascript"></script>
	<script src="${ctx}/static/bootstrap/additions/datepicker/locales/bootstrap-datetimepicker.zh-CN.js" type="text/javascript"></script>
	<script src="${ctx}/static/bootstrap/additions/jasny/jasny-bootstrap.min.js" type="text/javascript"></script>
</head>
<body>
   
	<div >
		<div class="page-header">
			<h3>租户活动管理 - 新增活动</h3>
		</div>
		
		<form:form id="eventForm" method="post" modelAttribute="event" cssClass="form-horizontal" role="form" action="${ctx}/mgr/events/save"  enctype="multipart/form-data">
			<div class="form-group">
				<label class="col-sm-2 control-label">活动名称:</label>
			    <div class="col-sm-10">
			    	<form:input path="title" name="title" cssClass="form-control input-large required"/>
			    </div>
			</div>	
			<div class="form-group">
				<label class="col-sm-2 control-label">描述:</label>
			    <div class="col-sm-10">
			    	<form:textarea path="info" placeholder="输入活动描述" class="form-control input-small required" cols="10" rows="5"></form:textarea>
			    </div>
			</div>	
			<div class="form-group">
				<label class="col-sm-2 control-label">起始日期:</label>
			    <div class="col-sm-10">
			    	<form:input path="startDate" name="startDate" class="datepicker form-control input-small required"/>
			    </div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">截止日期:</label>
			    <div class="col-sm-10">
			    	<form:input path="endDate" name="endDate" class="datepicker form-control input-small required"/>
			    </div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label">海报:</label>
			    <div class="col-sm-10">
			    	<div class="fileinput fileinput-new" data-provides="fileinput">
					  <div class="fileinput-new thumbnail" style="width: 200px; height: 150px;">
					     <img data-src="holder.js/100%x100%" alt=""/>
					  </div>
					  <div class="fileinput-preview fileinput-exists thumbnail" style="max-width: 200px; max-height: 150px;"></div>
					  <div>
					    <span class="btn btn-default btn-file">
					    	<span class="fileinput-new">选择原始图片</span>
					    	<span class="fileinput-exists">更改</span>
					    	<input type="file" class="file-input" name="file" id="file" />
					    </span>
					    <a href="#" class="btn btn-default fileinput-exists" data-dismiss="fileinput">移除</a>
					  </div>
					</div>
			    </div>
			</div>
			<div class="form-group">
				<label class="col-sm-2 control-label"></label>
			    <div class="col-sm-10">
			      <button type="submit" class="btn btn-default">发布</button>&nbsp;<a class="btn btn-primary">返回</a>
			    </div>
			</div>
		</form:form>
	</div>

</body>