<%@ page language="java" contentType="text/html; charset=gbk" pageEncoding="gbk"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=gbk">
    <title>生成订单</title>
</head>
<body>
<%--@elvariable id="or" type=""--%>
<form:form method="POST" commandName="or"   enctype="multipart/form-data">
    订单号：<form:input path="orderId"/><br/>
    商品号：<form:password path="productId"/><br/>
    商品名称：<form:input path="productName"/><br/>
    支付状态：<form:input path="status"/><br/>
    <p><form:button value="提交" /></p>
</form:form>
</body>
</html>