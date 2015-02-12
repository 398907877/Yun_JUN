<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="tags" tagdir="/WEB-INF/tags" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<html>
<head>
	<title>主页导航</title>
</head>

<body>
	<div class="alert alert-success alert-dismissable">
		<button type="button" class="close" data-dismiss="alert" aria-hidden="true">×</button>
        欢迎使用云脉客户端管理平台。
    </div>
	<div class="row">
  		<div class="col-md-3">
	  		<div class="panel panel-info">
	  			<div class="panel-heading">
	    			<div class="row">
	                  <div class="col-xs-6">
	                    <i class="fa fa-comments fa-5x"></i>
	                  </div>
	                  <div class="col-xs-6 text-right">
	                    <p class="announcement-heading">456</p>
	                    <p class="announcement-text">新会员!</p>
	                  </div>
	                </div>
	  			</div>
	  			<div class="panel-body">
	    			查看详细.
	  			</div>
			</div>
  		</div>
  		<div class="col-md-3">
  			<div class="panel panel-info">
	  			<div class="panel-heading">
	    			<div class="row">
	                  <div class="col-xs-6">
	                    <i class="fa fa-comments fa-5x"></i>
	                  </div>
	                  <div class="col-xs-6 text-right">
	                    <p class="announcement-heading">20</p>
	                    <p class="announcement-text">待回答问题!</p>
	                  </div>
	                </div>
	  			</div>
	  			<div class="panel-body">
	    			查看详细.
	  			</div>
			</div>
  		</div>
  		<div class="col-md-3">
  			<div class="panel panel-info">
	  			<div class="panel-heading">
	    			<div class="row">
	                  <div class="col-xs-6">
	                    <i class="fa fa-comments fa-5x"></i>
	                  </div>
	                  <div class="col-xs-6 text-right">
	                    <p class="announcement-heading">2</p>
	                    <p class="announcement-text">New Order!</p>
	                  </div>
	                </div>
	  			</div>
	  			<div class="panel-body">
	    			.
	  			</div>
			</div>
  		</div>
  		<div class="col-md-3">
  			<div class="panel panel-info">
	  			<div class="panel-heading">
	    			<div class="row">
	                  <div class="col-xs-6">
	                    <i class="fa fa-comments fa-5x"></i>
	                  </div>
	                  <div class="col-xs-6 text-right">
	                    <p class="announcement-heading">2</p>
	                    <p class="announcement-text">Feedback!</p>
	                  </div>
	                </div>
	  			</div>
	  			<div class="panel-body">
	    			.
	  			</div>
			</div>
  		</div>
	</div>
	<div class="row">
		<div class="col-md-12">
			<div class="panel panel-primary">
	  			<div class="panel-heading">
	    			<h3 class="panel-title">Traffic Statistics: October 1, 2013 - October 31, 2013</h3>
	  			</div>
	  			<div class="panel-body">
	    			Statistics Charts.
	  			</div>
			</div>
		</div>
	</div>
	<div class="row">
		<div class="col-md-4">
			<div class="panel panel-primary">
	  			<div class="panel-heading">
	    			<h3 class="panel-title">Recent Transactions</h3>
	  			</div>
	  			<div class="panel-body">
	    			Transactions List.
	  			</div>
			</div>
		</div>
	</div>
</body>

</html>