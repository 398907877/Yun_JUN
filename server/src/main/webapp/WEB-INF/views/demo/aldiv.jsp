<!doctype html>
<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="sitemesh" uri="http://www.opensymphony.com/sitemesh/decorator" %>  
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />




<html lang="en-US">

<head>


  <meta http-equiv="Content-Type" content="text/html;charset=utf-8">
  <title>Modal Login Window Demo</title>

  <!-- jQuery plugin leanModal under MIT License http://leanmodal.finelysliced.com.au/ -->
  
    <script type="text/javascript" charset="utf-8" src="${ctx}/static/afteradd/jquery.leanModal.min.js"></script>
  
    <link rel="stylesheet" type="text/css" media="all" href="${ctx}/static/afteradd/style.css">
  
  
  
</head>

<body>
  <div id="w">
    <div id="content">
      <h1>Welcome to the Site!</h1>
      <p>Just click the login link below to expand the modal window. This is only a demo so the input form will not load anything, but it is easy to connect into a backend system.</p>
      <center><a href="#loginmodal" class="flatbtn" id="modaltrigger">Modal Login</a></center>
    </div>
  </div>
  <div id="loginmodal" style="display:none;">
    <h1>User Login</h1>
    <form id="loginform" name="loginform" method="post" action="index.html">
      
      <label for="username">Username:</label>
      <input type="text" name="username" id="username" class="txtfield" tabindex="1"><label for="username">Username:</label>
      <input type="text" name="username" id="username" class="txtfield" tabindex="1"><label for="username">Username:</label>
      <input type="text" name="username" id="username" class="txtfield" tabindex="1"><label for="username">Username:</label>
      <input type="text" name="username" id="username" class="txtfield" tabindex="1"><label for="username">Username:</label>
      <input type="text" name="username" id="username" class="txtfield" tabindex="1"><label for="username">Username:</label>
      <input type="text" name="username" id="username" class="txtfield" tabindex="1">
      
      <label for="password">Password:</label>
      <input type="password" name="password" id="password" class="txtfield" tabindex="2">
      
      <div class="center"><input type="submit" name="loginbtn" id="loginbtn" class="flatbtn-blu hidemodal" value="Log In" tabindex="3"></div>
    </form>
  </div>
<script type="text/javascript">
$(function(){
  $('#loginform').submit(function(e){
    return false;
  });
  
  $('#modaltrigger').leanModal({ top: 110, overlay: 0.45, closeButton: ".hidemodal" });
});
</script>
</body>
</html>