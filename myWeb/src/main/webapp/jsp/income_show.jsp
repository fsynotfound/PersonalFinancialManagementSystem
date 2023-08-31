
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <script type="text/javascript"  src="/myWeb/jquery/jquery-3.4.1.min.js"></script>
    <script type="text/javascript"  src="/myWeb/jquery/common.js"></script>
    <script type="text/javascript" >

        $(function (){

            $(":checkbox:first").click(fun1);
            $(":checkbox:gt(0)").click(fun2);
            $("tr:gt(0)").mouseover(fun3); //来匹配所有大于给定索引值0的元素
            $("tr:gt(0)").mouseout(fun4);

        })
    </script>
</head>
<body>
       <center>

           <table border="2">
               <tr align="center">
                   <td><input type="checkbox">全选与全不选</td>
                   <td>收入类型编号</td>
                   <td>收入类型名称</td>
                   <td colspan="2">操作</td>
               </tr>
               <c:forEach items="${requestScope.list}" var="income">
                   <tr>
                       <td><input type="checkbox"/></td>
                       <td>${income.id}</td> //第37行的var
                       <td>${income.name}</td>
                       <td><a href="/myWeb/income/delete.do?id=${income.id}">删除收入类型</a></td>
                       <td><a href="/myWeb/income/findById.do?id=${income.id}">收入类型详细信息</a></td>
                   </tr>
               </c:forEach>
           </table>
       </center>

</body>
</html>
