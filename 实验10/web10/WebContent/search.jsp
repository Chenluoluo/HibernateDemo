<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="search">
		<p>最低价：<input name="min" type="text"> 最高价：<input name="max" type="text"><input type="submit" value="查询"></p>
	</form>
	<table border="1">
		<tr>
			<th>产品编号</th>
			<th>产品名称</th>
			<th>单价</th>
			<th>库存数量</th>
		</tr>
		<c:forEach var="pm" items="${ list }">
			<tr>
				<th>${pm.productid}</th>
				<th>${pm.productname}</th>
				<th>${pm.unitprice}</th>
				<th>${pm.unitsinstock}</th>
			</tr>
		</c:forEach>
	</table>
	<p>个数${ count }
	页数${ page }/${ pageCount }
	上页
	<a href="search?min=${ min }&max=${ max }&page=${ page+1 }">下页</a></p>

</body>
</html>