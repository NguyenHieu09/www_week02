package vn.edu.iuh.fit.frontEnd.model;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vn.edu.iuh.fit.backEnd.Services.ProductServices;
import vn.edu.iuh.fit.backEnd.enums.ProductStatus;
import vn.edu.iuh.fit.backEnd.models.Product;

import java.io.IOException;

public class ProductModel {
    private final ProductServices services = new ProductServices();
    public void insertProduct(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String name = req.getParameter("name");
        String desc = req.getParameter("desc");
        String unit = req.getParameter("unit");
        String manu = req.getParameter("manu");
        String status = req.getParameter("status");
        Product product = new Product(name,desc,unit,manu, ProductStatus.valueOf(status));
        services.insertProduct(product);
        resp.sendRedirect("product.jsp");
    }


    public void deleteProduct(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        long id =Long.parseLong(req.getParameter("id"));
        services.updateStatus(id, ProductStatus.IN_ACTIVE);
        resp.sendRedirect("product.jsp");
    }
}
