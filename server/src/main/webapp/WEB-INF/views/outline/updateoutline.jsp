<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page contentType="text/html;charset=UTF-8"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags"%>

<c:set var="ctx" value="${pageContext.request.contextPath}" />

<html>

<head>

<title>Insert title here</title>
<script type="text/javascript">
	$(function() {

		

	})
</script>

</head>
<body>

	<!-- <span class="glyphicon glyphicon-home"  style="font-size: medium;"></span> -->
	<!-- <span  style="margin-left: 20px; font-size: medium;font-style: inherit;">新增大纲界面</span> -->

	<div class="jumbotron" style="height: 150px; background: #333333;">
		<h2 style="color: white;">修改大纲界面</h2>
		<h6 style="color: windowframe;">用于大纲的修改</h6>
	</div>

	<br></br>

	<form role="form" style="margin-top: -50px"
		action="${ctx}/mgr/outlines/addoutline">
		<fieldset>
			<div class="form-group">
				<label for="disabledTextInput">大纲标题</label> 
				<input   placeholder="${outline.outlinename }"    type="text"  id="disabledTextInput" name="outlinename" class="form-control"  style="width: 300px">
			</div>
			<div    style="float: left;"    class="form-group">
				<label for="disabledTextInput"> 出版社</label>
				<input type="text"   id="disabledTextInput"   name="edition"  class="form-control"    placeholder=" ${outline.edition}" style="width: 300px">
			</div>
			<div    style="margin-left:300px; padding-left: 30px " class="form-group">
				<label for="disabledTextInput">公布年限</label> 
                 <input type="text"   id="disabledTextInput"   name="edition"  class="form-control"    placeholder=" ${outline.year}" style="width: 300px">
				
			</div>
			<div    style="float: left;"  class="form-group">
				<label for="disabledTextInput"   >学科</label> 
				<input type="text"   id="disabledTextInput"   name="edition"  class="form-control"    placeholder=" ${outline.subject}" style="width: 300px">
			</div>
			
			   <div    style="margin-left: 300px; padding-left: 30px " class="form-group">
			   <label for="disabledTextInput">年级</label>
				<input type="text" id="disabledTextInput" class="form-control"
					placeholder=" 来源字典"    name="grade" style="width: 300px"></div>
			
			<div    style="float: left;"  class="form-group">
				<label for="disabled">新增知识点</label> 
				 <select id="disabledSelect"   class="form-control"    style="width: 300px">
					<option  value="知识点的id，后续传人后台">   显示知识点名称1</option>
					<option    value="知识点的id，后续传人后台"> 显示知识点名称2 </option>
				</select>
			</div>
			<div    style="margin-left: 300px; padding-left: 30px "  class="form-group">
				<label for="disabled">删除知识点</label> 
				 <select id="disabledSelect"   class="form-control"    style="width: 300px">
					<option   value="知识点的id，后续传人后台">   显示知识点名称1</option>
					<option    value="知识点的id，后续传人后台"> 显示知识点名称2 </option>
				</select>
			</div>
			
			<div class="alert alert-success">恭喜填写正确</div>
			<br />


			<button id="jun" type="button" class="btn btn-success"
				onclick="this.form.submit()">确认修改</button>
		</fieldset>
	</form>


</body>
</html>