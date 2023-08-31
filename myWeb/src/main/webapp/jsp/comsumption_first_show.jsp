
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
    <table border="2">
        <tr>
            <td>消费类型编号</td>
            <td>消费类型名称</td>
            <td colspan="2">操作</td>
        </tr>
        <c:forEach items="${requestScope.list}" var="consumption">
            <tr>
                <td>${consumption.id}</td>
                <td>${consumption.typeName}</td>
                <td><a href="/myWeb/consumption/delete/first.do?id=${consumption.id}">类型删除</a></td>
                <td><a href="/myWeb/consumption/findById.do?id=${consumption.id}">详细信息</a></td>
            </tr>
        </c:forEach>
    </table>

</center>
</body>
</html>
