<%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 10/05/2023
  Time: 8:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Insert Product</title>
</head>
<body>

<form action="controls?action=insertProduct" method="post">
    Name: <input name="name"/><br/>
    Description:<input name="desc"/><br/>
    Unit: <input name="unit"/><br/>
    Manufacturer: <input name="manu"/><br/>
    Status:<select name="status">
    <option selected="true" label="ACTIVE" >ACTIVE</option>
    <option label="IN_ACTIVE">IN_ACTIVE</option>
    <option label="TERMINATED">TERMINATED</option>
            </select>
    <input type="submit" value="Insert"/>
    <input type="reset" value="Clear"/>
</form>
</body>
</html>
