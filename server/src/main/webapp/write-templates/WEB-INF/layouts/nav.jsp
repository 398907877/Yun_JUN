<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>

<div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
     <div class="container">
       <div class="navbar-header">
         <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
           <span class="sr-only">Toggle navigation</span>
           <span class="icon-bar"></span>
           <span class="icon-bar"></span>
           <span class="icon-bar"></span>
         </button>
         <a class="navbar-brand" href="#">云脉管理系统</a>
       </div>
       <div class="navbar-collapse collapse">
         <ul class="nav navbar-nav">
         
         	<li class="dropdown" id="nav_index">
             <a href="${ctx}/mgr/index">首页</a>
           </li>
           
			<li class="dropdown" id="nav_sys">
             <a href="#" class="dropdown-toggle" data-toggle="dropdown">系统管理 <b class="caret"></b></a>
             <ul class="dropdown-menu">
             	<li><a href="${ctx}/mgr/users">用户管理</a></li>
              	<li><a href="${ctx}/mgr/authorities">权限管理</a></li>
              	<li><a href="${ctx}/mgr/notifications">通知管理</a></li>
               <li class="divider"></li>
               <li><a href="#">会员管理</a></li>
               <li><a href="#">学校管理</a></li>
               <li><a href="${ctx}/mgr/outlines">大纲管理</a></li>
             </ul>
           </li>
           
           <li class="dropdown">
             <a href="#" class="dropdown-toggle" data-toggle="dropdown">名师课堂管理 <b class="caret"></b></a>
             <ul class="dropdown-menu">
             	<li><a href="${ctx}/mgr/courseCategories">课程分类管理</a></li>
             	<li><a href="${ctx}/mgr/teachers">教师管理</a></li>
              	<li><a href="${ctx}/mgr/brands">课程管理</a></li>
             </ul>
           </li>
           
           <li class="dropdown">
             <a href="#" class="dropdown-toggle" data-toggle="dropdown">题库管理<b class="caret"></b></a>
             <ul class="dropdown-menu">
             	<li><a href="${ctx}/mgr/exercises">试卷题库管理</a></li>
             </ul>
           </li>
           
           <li class="dropdown">
             <a href="#" class="dropdown-toggle" data-toggle="dropdown">错题库管理<b class="caret"></b></a>
             <ul class="dropdown-menu">
             	<li><a href="${ctx}/mgr/members">提问库</a></li>
             </ul>
           </li>
           
           <li class="dropdown">
             <a href="#" class="dropdown-toggle" data-toggle="dropdown">统计分析 <b class="caret"></b></a>
             <ul class="dropdown-menu">
             	<li><a href="${ctx}/mgr/orders">接口访问统计</a></li>
              	<li><a href="${ctx}/mgr/">会员统计</a></li>
              	<li><a href="${ctx}/mgr/">题库统计</a></li>
              	<li><a href="${ctx}/mgr/">错题统计</a></li>
              	<li><a href="${ctx}/mgr/">知识点统计</a></li>
             </ul>
           </li>
         </ul>
         <shiro:user>
      <ul class="nav navbar-nav navbar-right">
        <li class="dropdown">
        <a href="#" class="dropdown-toggle" data-toggle="dropdown"><i class="icon-user icon-white"></i>&nbsp;<shiro:principal property="name"/><b class="caret"></b></a>
        	<ul class="dropdown-menu nav-list">
				<li><a href="${ctx}/mgr/todos">待办事宜</a></li>
				<li class="divider"></li>
               	<li><a href="${ctx}/mgr/profile">编辑个人资料</a></li>
				<li><a href="${ctx}/logout">安全退出</a></li>
             </ul>
        	</li>
      </ul>
      </shiro:user>
       </div><!--/.nav-collapse -->
       
     </div>
   </div>