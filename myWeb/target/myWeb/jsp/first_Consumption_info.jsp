<%--
  Created by IntelliJ IDEA.
  User: yz33233339
  Date: 2021/10/6
  Time: 12:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>
    <font style="color:black;font-size:20px">一级消费类型注册页</font>
    <form action="/myWeb/consumption/update.do">
        <table border="2">
            <tr>
                <td>消费类型编号</td>
                <td><input type="text" name="id" value="${requestScope.result.id}"></td>
            </tr>
            <tr>
                <td>消费类型名称</td>
                <td><input type="text" name="typeName" value="${requestScope.result.typeName}"></td>
            </tr>
            <tr>
                <td><input type="submit" value="一级消费类型更新"></td>
                <td><input type="reset" ></td>
            </tr>
        </table>
    </form>
</center>
</body>
</html>
