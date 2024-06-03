<%@ page import="vn.edu.iuh.fit.backEnd.models.Order" %>
<%@ page import="vn.edu.iuh.fit.backEnd.Services.OrderServices" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 10/06/2023
  Time: 10:57 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
    OrderServices orderServices = new OrderServices();
    List<Order> listOrd= orderServices.getAll();
%>
<table width="80%" align="center" border="1">

    <tr>
        <th>id</th>
        <th>date</th>
        <th>cust id</th>
        <th>emp id</th>
        <th colspan="2"><a href="insertProduct.jsp">Insert</a> </th>
    </tr>

    <%
        for(Order o: listOrd){
            long id = o.getId();

    %>
    <tr>
        <td><%=id%></td>
        <td><%=o.getOrderDate()%></td>
        <td><%=o.getCustomer().getId()%></td>
        <td><%=o.getEmployee().getId()%></td>
        <td><a href="">Update</a> </td>
        <td><a href="">Delete</a></td>

    </tr>
    <%}%>
</table>
</body>
</html>
