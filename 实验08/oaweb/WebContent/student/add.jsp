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
	<form action="add">
		<p>学号：<input name="studentModel.ssid" type="text"> </p>
		<p>姓名：<input name="studentModel.sname" type="text"></p>
		<p>年龄：<input name="studentModel.age" type="text"></p>
		<p>性别：<input name="studentModel.sex" type="text"></p>
		课程：
		<c:forEach var="cm" items="${courseModels}">
			<input type="checkbox" name="courses" value="${cm.cno}"/>${cm.cname}
		</c:forEach>
		<br/>
		<input type="submit" value="增加按钮">
	</form>
</body>
</html>