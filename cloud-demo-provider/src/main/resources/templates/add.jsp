<%@ page language="java" contentType="text/html; charset=gbk" pageEncoding="gbk"%>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=gbk">
    <title>���ɶ���</title>
</head>
<body>
<%--@elvariable id="or" type=""--%>
<form:form method="POST" commandName="or"   enctype="multipart/form-data">
    �����ţ�<form:input path="orderId"/><br/>
    ��Ʒ�ţ�<form:password path="productId"/><br/>
    ��Ʒ���ƣ�<form:input path="productName"/><br/>
    ֧��״̬��<form:input path="status"/><br/>
    <p><form:button value="�ύ" /></p>
</form:form>
</body>
</html>