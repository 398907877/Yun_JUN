<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>
<c:set var="ctx" value="${pageContext.request.contextPath}" />

<html>
<head>
<title>知识点管理</title>

<script type="text/javascript">  


$(function(){
	

	
})


// function trunmsg(){
	
// 	alert("已经删除");
	
// }



</script>


</head>

<body>
	<div class="page-header">
		<h1>
			知识点管理<small>知识点管理</small>
		</h1>
	</div>
	<ol class="breadcrumb">
		<li><i class="fa fa-dashboard"></i>系统管理</li>
		<li>知识点管理</li>
	</ol>







<div class="panel-group" id="accordion">

  <div class="panel panel-default">
    <div class="panel-heading">
      <h4 class="panel-title">
        <a data-toggle="collapse" data-parent="#accordion" href="#collapseTwo">
         <span  class="glyphicon glyphicon-thumbs-up"> </span> <span  style="color: red;" > 使用需知</span>
        </a>
      </h4>
    </div>
    <div id="collapseTwo" class="panel-collapse collapse">
      <div class="panel-body">
        <div class="alert alert-warning">此页面用于知识点管理以及知识点的维护应用！  CRUD  增加，删除，修改.</div>
      </div>
    </div>
  </div>

</div>









	    <ul class="list-group">
  <li class="list-group-item list-group-item-success">${msg}</li>

</ul>

	    
	    
	    
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
				<th>大纲名称</th>
				<th>学科</th>
				<th>年级</th>
				<th>知识点</th>
				<th>&nbsp;</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${outlinelist}" var="outline">
				<tr>
					 <td><img alt="" src="../pic/book.png">   ${outline.outlinename}</td>
					<td>${outline.subject}</td>
			
					<td>${outline.grade }</td>
					    <td>   <a    href="#更具大纲id   select所有的知识点"    >查看所有知识点</a></td>
					<td class="buttons">
								<a    style="font-size: x-small;"  href="#" ><span class="glyphicon glyphicon-ok-sign"></span>查看详情</a>
						<a   style="font-size: x-small;"    href="${ctx}/mgr/outlines/update/${outline.id}" ><span class="glyphicon glyphicon-wrench"></span>修改</a>
						<a style="font-size: x-small;"   href="${ctx}/mgr/outlines/delete/${outline.id}"    ><span class="glyphicon glyphicon-trash"></span>删除</a>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
	


	<div class="form-actions">

		<a href="${ctx}/mgr/outlines/add"><input id="submit_btn" class="btn btn-primary" type="submit" value="新增大纲" /></a>
		<input id="submit_btn" class="btn btn-primary" type="submit" value="大纲关系维护" />
	</div>
	
	
	<div align="center">
<ul    class="pagination">
  <li><a href="#">&laquo;</a></li>
  <li><a href="#">1</a></li>
  <li><a href="#">2</a></li>
  <li><a href="#">3</a></li>
  <li><a href="#">4</a></li>
  <li><a href="#">5</a></li>
  <li><a href="#">&raquo;</a></li>
</ul>
</div>
	<script type="text/javascript">
	$(document).ready(function() {
		$("#nav_sys").addClass("active");
	});
	</script>
</body>
</html>
