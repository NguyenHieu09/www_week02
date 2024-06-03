<%@ page import="vn.edu.iuh.fit.backEnd.models.Customer" %>
<%@ page import="vn.edu.iuh.fit.backEnd.Services.CustomerServices" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 09/30/2023
  Time: 12:06 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

</head>
<body>
<%
    CustomerServices services =new CustomerServices();
    List<Customer> lst = services.getAll();

//        List<Customer> lst1 = session.getAttribute("customers");
%>
<table width="80%" align="center">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Address</th>
        <th>Phone</th>
        <th>Email</th>
        <th><a href="insertCustomer.jsp">Insert</a> </th>
    </tr>
    <% for(Customer customer:lst){%>
    <tr>
        <td><%=customer.getId()%></td>
        <td><%=customer.getName()%></td>
        <td><%=customer.getAddress()%></td>
        <td><%=customer.getPhone()%></td>
        <td><%=customer.getEmail()%></td>
        <td>
            <a href="">Update</a>
            <a href="">Delete</a>
        </td>
    </tr>
    <%}%>
</table>
</body>
</html>
