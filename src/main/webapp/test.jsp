<%@ page import="vn.edu.iuh.fit.backEnd.repositories.CustomerRepository" %>
<%@ page import="vn.edu.iuh.fit.backEnd.models.Customer" %>
<%@ page import="vn.edu.iuh.fit.backEnd.repositories.ProductRepository" %>
<%@ page import="vn.edu.iuh.fit.backEnd.enums.ProductStatus" %>
<%@ page import="vn.edu.iuh.fit.backEnd.models.Product" %>
<%@ page import="vn.edu.iuh.fit.backEnd.repositories.OrderRepository" %><%--
  Created by IntelliJ IDEA.
  User: LENOVO
  Date: 10/05/2023
  Time: 10:14 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    OrderRepository repository = new OrderRepository();

    out.print(repository.getAll());

//  CustomerRepository repository = new CustomerRepository();
//  Customer cus = new Customer("hieu", "hieu", "hieu", "hieu");
//  repository.insertCust(cus);
//
//  out.print(cus);

//  ProductRepository productRepository = new ProductRepository();
//  Product product = new Product("xoai", "xoai ngot", "kg", "ba dua", ProductStatus.ACTIVE);
//
//  ProductImage productImage = new ProductImage();
//  productImage.setAlternative("xxx xxx");
//  productImage.setPath("/images/zzz.jpg");
//  productImage.setProduct(product);
//
//  product.getProductImageList().add(productImage);
//
//  productRepository.insert(product);
//
//  out.print("OK");

//    ProductRepository productRepository = new ProductRepository();
//    out.print("ok");


%>
</body>
</html>
