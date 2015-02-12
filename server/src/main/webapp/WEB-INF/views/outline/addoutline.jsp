<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>
<%@ taglib prefix="springtag"
	uri="http://www.springframework.org/tags/form"%>



<c:set var="ctx" value="${pageContext.request.contextPath}" />


<html>

<head>
<title>Insert title here</title>

<script type="text/javascript" charset="utf-8"   	src="${ctx}/static/afteradd/jquery.leanModal.min.js"></script>
<link rel="stylesheet" type="text/css" media="all"	href="${ctx}/static/afteradd/style.css">


<script type="text/javascript">
	$(function() {
		// 			$('#loginform').submit(function(e) {
		// 				return false;
		// 			});

		$('#modaltrigger').leanModal({
			top : 100,
			overlay : 0.4,
			closeButton : ".hidemodal"
		});
	});
</script>





</head>

<body>


	<div class="jumbotron" style="height: 150px; background: #333333;">
		<h2 style="color: white; font-size: 30px">新增大纲界面</h2>
		<h6 style="color: windowframe;">用于大纲的新增</h6>
	</div>

	<br></br>

	<form role="form" style="margin-top: -50px"
		action="${ctx}/mgr/outlines/addoutline">
		<fieldset>
			<div class="form-group">
				<label for="disabledTextInput">大纲标题</label> <input type="text"
					id="disabledTextInput" name="outlinename" class="form-control"
					placeholder="Disabled input" style="width: 300px">
			</div>
			<div style="float: left;" class="form-group">
				<label for="disabledTextInput"> 出版社</label> <input type="text"
					id="disabledTextInput" name="edition" class="form-control"
					placeholder="Disabled input" style="width: 300px">
			</div>
			<div style="margin-left: 300px; padding-left: 30px"
				class="form-group">
				<label for="disabledTextInput">公布年限</label> <input type="text"
					id="disabledTextInput" name="year" class="form-control"
					placeholder="Disabled input" style="width: 300px">
			</div>
			<div style="float: left;" class="form-group">
				<label for="disabledTextInput">学科</label> <input type="text"
					id="disabledTextInput" name="subject" class="form-control"
					placeholder=" 来源字典" style="width: 300px">
			</div>

			<div style="margin-left: 300px; padding-left: 30px"
				class="form-group">
				<label for="disabledTextInput">年级</label> <input type="text"
					id="disabledTextInput" class="form-control" placeholder=" 来源字典"
					name="grade" style="width: 300px">
			</div>

			<div class="form-group">
				<label for="disabled">知识点</label> <span style="margin-left: 300px"
					class="glyphicon glyphicon-plus"></span> <a href="#loginmodal"
					class="flatbtn" id="modaltrigger"
					style="margin-left: 10px; font-size: medium;">新增知识点</a> <select
					id="disabledSelect" class="form-control" style="width: 300px">
					<option value="知识点的id，后续传人后台">显示知识点名称1</option>
					<option value="知识点的id，后续传人后台">显示知识点名称2</option>
				</select>
			</div>
			<div class="checkbox">
				<label> <input type="checkbox"> 是否同意增加
				</label>
			</div>
			<div class="alert alert-success">恭喜填写正确</div>
			<br />
			<!--     完成度 -->
			<div class="progress">
				<div class="progress-bar" role="progressbar" aria-valuenow=""
					aria-valuemin="0" aria-valuemax="100" style="width: 30%;">
					30%</div>
			</div>

			<button id="jun" type="button" class="btn btn-success"
				onclick="this.form.submit()">新增大纲</button>

		</fieldset>
	</form>






	<!-- 增加知识点的弹出框 -->


	<div id="loginmodal" style="display: none;">
		<h1>增加知识点</h1>
		<form id="loginform" name="loginform" method="post"
			action=" ${ctx}/mgr/knowledges/addknowledge">

			<div>
				<label for="username">JUN</label> <input type="text" name="title"
					id="username" class="txtfield" tabindex="1">
			</div>

			<div>
				<label for="username">JUN</label> <input type="text" name="b"
					id="username" class="txtfield" tabindex="1">
			</div>
			<div>
				<label for="username">JUN</label> <select class="txtfield">
					<option>哎呀</option>
					<option>恩恩</option>
					<option>嘻哈</option>
				</select>
			</div>

			<label for="username">知识点名称</label> <input type="text" name="c"
				id="username" class="txtfield" tabindex="1">

			<div class="center">
				<input type="submit" name="loginbtn" id="loginbtn"	class="flatbtn-blu hidemodal" value="确认增加" tabindex="3">
				 <input	type="button" name="loginbtn" id="loginbtn"	class="flatbtn-blu hidemodal" value="取消" tabindex="3">
			</div>
		</form>
	</div>


</body>
</html>