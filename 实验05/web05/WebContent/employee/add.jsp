<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="add.do">
		<p>员工序号：<input name="eno" type="text"> </p>
		<p>员工姓名：<input name="ename" type="text"></p>
		<p>性别：<input name="sex" type="text"></p>
		<p>出生日期：<input name="birthday" type="text"></p>
		<p>加入公司日期：<input name="joindate" type="text"></p>
		<p>身份证号：<input name="cardid" type="text"></p>
		<input type="submit" value="增加按钮">
	</form>
</body>
</html>