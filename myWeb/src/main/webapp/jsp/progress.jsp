
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="2" align="center">
    <tr>
        <td ><font style="color:pink;font-szie:30px">余额</font></td>
        <td >${balance}</td>
        <td ><font style="color:pink;font-szie:30px">计划</font></td>
        <td >${task}</td>
        <td  colspan="3"><font style="color:pink;font-szie:30px">${status}</font></td>
    </tr>
    <tr>
        <td>收支记录编号</td>
        <td>金额</td>
        <td>日期</td>
        <td>来源</td>
        <td>消费类型</td>
        <td>收入类型</td>

    </tr>
    <c:forEach items="${list}" var="obj">
        <tr>
            <td>${obj.id}</td>
            <td>${obj.money}</td>
            <td>${obj.date}</td>
            <td>${obj.shop}</td>
            <td>${obj.consumptionId}</td>
            <td>${obj.incomeId}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
