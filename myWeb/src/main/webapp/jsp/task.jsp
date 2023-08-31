
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
            $("tr:gt(0)").mouseover(fun3);
            $("tr:gt(0)").mouseout(fun4);

        })
    </script>
</head>
<body>
       <center>
           <form action="">

               <table border="2">
                   <tr>
                       <td><input type="checkbox"/>全选与全不选</td>
                       <td>计划书编号</td>
                       <td>计划书目标</td>
                       <td>月分</td>
                       <td>金额</td>
                       <td>删除计划书</td>
                       <td>详细信息</td>
                   </tr>
                   <c:forEach items="${taskList}" var="task">
                       <tr>
                           <td><input type="checkbox" name="ck" value="${task.id}"/></td>
                           <td>${task.id}</td>
                           <td>${task.title}</td>
                           <td>${task.month}</td>
                           <td>${task.money}</td>
                           <td><a href="/myWeb/task/delete.do?id=${task.id}">删除计划书</a></td>
                           <td><a href="/myWeb/task/findById.do?id=${task.id}">详细信息</a></td>
                       </tr>
                   </c:forEach>
               </table>
           </form>
       </center>
</body>
</html>
