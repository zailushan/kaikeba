<%--
  Created by IntelliJ IDEA.
  User: lenovo
  Date: 2018/12/22
  Time: 16:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  hello javaweb


  <%
    String s = (String) request.getAttribute("hello");
  %>
  ${request.getAttribute("hello")}
  </body>
</html>
