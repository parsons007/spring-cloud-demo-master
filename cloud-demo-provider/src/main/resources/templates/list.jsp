<%@ page language="java" import="java.util.*" pageEncoding="GBK"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
    <title>�����б�</title>

    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="this is my page">
    <meta http-equiv="content-type" content="text/html; charset=gbk">

    <!--<link rel="stylesheet" type="text/css" href="./styles.css">-->

</head>

<body>

<table border="1">

    <tr>
        <td>
            ������
        </td>
        <td>
            ��Ʒ��
        </td>
        <td>
            ��Ʒ����
        </td>
        <td>
            ֧��״̬
        </td>
        <td>
            ����
        </td>
    </tr>
    <c:forEach items="${orderList}" var="order" varStatus="status">

        <tr>
            <td><c:out value="${order.orderId}"/></td>
            <td><c:out value="${order.productId}"/></td>
            <td><c:out value="${order.productName}"/></td>
            <td><c:out value="${order.status}"/></td>
            <td>
                <a href="<c:url value="/order/${order.productName}/update" />">�޸�</a>&nbsp;&nbsp;<a href="<c:url value="/order/${order.productId}/delete" />">ɾ��</a>
            </td>
        </tr>

    </c:forEach>

</table>

</body>
</html>
