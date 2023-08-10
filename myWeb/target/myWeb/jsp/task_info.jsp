<%--
  Created by IntelliJ IDEA.
  User: yz33233339
  Date: 2021/10/31
  Time: 23:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>

<html>
<head>

    <title>Title</title>
    <script type="text/javascript" src="/myWeb/jquery/jquery-3.4.1.min.js"></script>
    <script type="text/javascript" >

        $(function (){
            var month=${task.month};
            var $obj = $("option");
            for(var i=0;i<$obj.length;i++){
                var dom =$obj[i]
                if(dom.value == month){
                    dom.selected=true;
                    break;
                }
            }
        })
    </script>
</head>
<body>
<center>
    <form action="/myWeb/task/update.do">
        <table border="2" align="center">
            <tr>
                <td>计划书编号</td>
                <td><input type="text" name="id" readonly value="${task.id}"></td>
            </tr>
            <tr>
                <td>计划名称</td>
                <td><input type="text" name="title" value="${task.title}"></td>
            </tr>
            <tr>
                <td>计划月分</td>
                <td>
                    <select name="month">
                        <option value="1">1月分</option>
                        <option value="2">2月分</option>
                        <option value="3">3月分</option>
                        <option value="4">4月分</option>
                        <option value="5">5月分</option>
                        <option value="6">6月分</option>
                        <option value="7">7月分</option>
                        <option value="8">8月分</option>
                        <option value="9">9月分</option>
                        <option value="10">10月分</option>
                        <option value="11">11月分</option>
                        <option value="12">12月分</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>预存款</td>
                <td><input type="text" name="money" value="${task.money}"></td>
            </tr>
            <tr>
                <td><input type="submit" value="更改计划书"></td>
                <td><input type="reset" ></td>
            </tr>
        </table>
    </form>
</center>
</body>
</html>