<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<title>Test Login</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/bootstrap-theme.min.css">
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/js/jquery-1.11.0.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	
});
</script>
</head>
<body>
	<div class="container" style="width: 20%">
		<form class="form-signin" role="form" action="${pageContext.request.contextPath}/loginProc" method="post">
			<img src="${pageContext.request.contextPath}/resources/images/IMG_1543.JPG" class="img-rounded" style="width: 100%; height: 100%">
			<h2 class="form-signin-heading">로그인좀해 주세요</h2>
			<input type="email" class="form-control" placeholder="Email address" required="" autofocus="" name="user_id">
			<input type="password" class="form-control" placeholder="Password" required="" name="user_password">
			<label class="checkbox"> <input type="checkbox" value="remember-me">계정 기억하기</label>
			<button class="btn btn-lg btn-primary btn-block" type="submit">로그인</button>
		</form>
	</div>
</body>
</html>