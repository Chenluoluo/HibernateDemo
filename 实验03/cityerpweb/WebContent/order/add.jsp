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
		<p>订单序号：<input name="orderno" type="text"> </p>
		<p>订单编码：<input name="orderid" type="text"></p>
		<p>客户名称：<input name="customername" type="text"></p>
		<p>订单日期：<input name="orderdate" type="text"></p>
		<p>发送日期：<input name="deliverydate" type="text"></p>
		<p>付款日期：<input name="paydate" type="text"></p>
		<p>订单金额：<input name="orderamount" type="text"></p>
		<p>快递金额：<input name="deliveryfee" type="text"></p>
		<input type="submit" name="do" value="增加按钮">
		<input type="submit" name="do" value="删除按钮">
	</form>
</body>
</html>