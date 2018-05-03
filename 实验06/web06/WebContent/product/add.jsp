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
		<p>产品编码：<input name="pcode" type="text"> </p>
		<p>产品名称：<input name="pname" type="text"></p>
		<p>生产日期：<input name="pdate" type="text"></p>
		<p>成本单价：<input name="unitprice" type="text"></p>
		<p>库存数量：<input name="qtyinstock" type="text"></p>
		<input type="submit" value="增加按钮">
	</form>
</body>
</html>