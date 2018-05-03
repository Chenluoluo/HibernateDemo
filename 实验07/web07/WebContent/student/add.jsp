<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="add.do">
		<p>学号：<input name="ssid" type="text"> </p>
		<p>姓名：<input name="sname" type="text"></p>
		<p>生日：<input name="birthday" type="text"></p>
		<p>性别：<input name="sex" type="text"></p>
		<p>年龄：<input name="age" type="text"></p>
		<p>
		<select name="cno">
				<c:forEach var="dm" items="${ requestScope.list }">
          			<option value="${dm.cno}">${dm.cname}</option>
          		</c:forEach>
		</select>
		</p>
		
		<input type="submit" value="增加按钮">
	</form>
</body>
</html>