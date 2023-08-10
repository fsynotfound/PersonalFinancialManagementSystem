<%--
  Created by IntelliJ IDEA.
  User: yz33233339
  Date: 2021/10/6
  Time: 18:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"  isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<center>

    <font style="color:red;font-size:30px">收入类型更新页面</font>
    <form action="/myWeb/income/update.do">
        <table border="2">
            <tr>
                <td>收入类型编号</td>
                <td><input type="text" name="id" value="${requestScope.income.id}" readonly></td>
            </tr>
            <tr>
                <td>收入类型</td>
                <td><input type="text" name="name" value="${requestScope.income.name}"></td>
            </tr>
            <tr>
                <td><input type="submit" value="更新"/></td>
                <td><input type="reset" /></td>
            </tr>
        </table>
    </form>
</center>
</body>
</html>
