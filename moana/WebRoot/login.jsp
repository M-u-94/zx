<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
	<!-- <meta charset="UTF-8"> -->
	<title>登录</title>
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta name="description" content="">
	<meta name="author" content="">

	<link href="/moana/css/bootstrap.min.css" rel="stylesheet">

	<script src="/moana/js/jquery-3.1.0.js"></script>
	<script src="/moana/js/bootstrap.min.js"></script>
	<style type="text/css">
		body{
			padding-top: 20px;
    		padding-bottom: 60px;
			font-family: "Microsoft Yahei";
			background-image: url("/moana/image/background.jpg");
			background-repeat: no-repeat;
			background-size: cover; 
			
		}
		.container{
			position: relative;
			top: 33px;
		}
		.container .row .form-title{
			text-align: center;
		}
		.container .row .form-horizontal{
			margin: 33px;
			padding: 16px 33px;
		}
		.container .row .form-group .remember{
			position: relative;
			top: 2px;
		}
		.btn-block{
			display: block;
			width: 100%;
			text-align: center;
		}
	</style>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-lg-4 col-lg-offset-4">
				<div class="form-title">
					<h3><font size="6" color="gray">欢迎来到中信电影院</font></h3>
				</div>
				<form action="/moana/p1/login" method="post" class="form-horizontal thumbnail">
					<div class="form-group">
						<label for="">用户名</label>
						<input type="text" id="" name="userName" class="form-control" placeholder="用户名"></div>
					<div class="form-group">
						<label for="">密码</label>
						<input type="password" id="" name="passWord" class="form-control" placeholder="密码"></div>
					<div class="form-group">
						<label for="">
							<input type="checkbox" class="remember">记住我</label>
					</div>
					<div class="form-group">
						<button type="submit" class="btn btn-success btn-block" >登录</button>
				
					</div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>