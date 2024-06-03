<%@ page import="vn.edu.iuh.fit.backEnd.Services.ProductServices" %>
<%@ page import="java.util.List" %>
<%@ page import="vn.edu.iuh.fit.backEnd.models.Product" %><%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 09/29/2023
  Time: 10:21 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product</title>
</head>
<body>
    <%
        ProductServices productServices = new ProductServices();
        List<Product> list = productServices.getAll();
    %>

    <table width="80%" align="center" border="1">
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>description</th>
            <th>unit</th>
            <th>manufacturer</th>
            <th>status</th>
            <th colspan="2"><a href="insertProduct.jsp">Insert</a> </th>

        </tr>
        <%
            for(Product pr : list){
                long id = pr.getId();
                String deleteString = "controls?action=updateStatus&id="+id;
                String editString = "controls?action=editProduct&id="+id;
        %>
        <tr>
            <td><%=id%></td>
            <td><%=pr.getName()%></td>
            <td><%=pr.getDescription()%></td>
            <td><%=pr.getUnit()%></td>
            <td><%=pr.getManufacturerName()%></td>
            <td><%=pr.getStatus().getValue()%></td>
            <td><a href=<%=editString%>>Update</a> </td>
            <td><a href=<%=deleteString%>>Delete</a></td>
        </tr>
        <% }%>

    </table>
</body>
</html>
