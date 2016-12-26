<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd"><html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
	<title>Login Success!</title>
	<link rel="stylesheet" href="http://apps.bdimg.com/libs/bootstrap/3.3.4/css/bootstrap.min.css">
	<script type="text/javascript"
	src="http://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js"></script>
	<script type="text/javascript">
	
	setInterval("Push(1)", 1000 * 3);
	setInterval("Push(2)", 1000 * 3);
	setInterval("Push(3)", 1000 * 3);
	function Push(id) {
			var temp = document.getElementById(id).innerText;
			var n = "#" + id;
			$.post("/moana/p2/refreshAction2.action", {
				mname : temp
			}, function(data, status) {
				$(n).prev().text(data.key);
			});
	};
</script>
	<script src="http://apps.bdimg.com/libs/bootstrap/3.3.4/js/bootstrap.min.js"></script>
	<style>
li {
	display: block;
	width: 100px;
	height: 100px;
	list-style: none;
	float: left;
}
</style>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-4">
				<div class="thumbnail">
					<img src="/moana/image/h1.png" alt="哈利波特" style="width:100%">
					<div class="caption">
						剩
						<span id="myDiv1">&nbsp;</span>
						张
						<div id="1" style="display: none;">哈利波特</div>
						<button class="btn btn-primary" style="color:white;margin-left: 221px;" onclick="location='/moana/p1/grabTickets.action?mid=1001&mname=哈利波特'">抢票</button>
					</div>
			</div>
		</div>
		<div class="col-md-4">
			<div class="thumbnail">
				<img src="/moana/image/b1.png" alt="变形金刚" style="width:100%">
					<div class="caption">
						剩
						<span id="myDiv2">&nbsp;</span>
						张
						<div id="2" style="display: none;">变形金刚</div>
						<button class="btn btn-primary" style="color:white;margin-left: 221px;" onclick="location='/moana/p1/grabTickets.action?mid=1001&mname=变形金刚'">抢票</button>
					</div>
			</div>
		</div>
		<div class="col-md-4">
			<div class="thumbnail">
				<img src="/moana/image/s1.png" alt="superman" style="width:100%">
					<div class="caption">
						剩
						<span id="myDiv3">&nbsp;</span>
						张
						<div id="3" style="display: none;">superman</div>
						<button class="btn btn-primary" style="color:white;margin-left: 221px;" onclick="location='/moana/p1/grabTickets.action?mid=1001&mname=superman'">抢票</button>
					</div>
			</div>
		</div>
	</div>
</div>
	</body>
	</html>