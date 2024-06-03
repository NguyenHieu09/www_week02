package vn.edu.iuh.fit.frontEnd.controllers;


import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import vn.edu.iuh.fit.frontEnd.model.CustomerModel;
import vn.edu.iuh.fit.frontEnd.model.ProductModel;

import java.io.IOException;

@WebServlet("/controls")
public class ServletController extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            Object actionObj = req.getParameter("action");
            if (actionObj != null) {
                String action = actionObj.toString();
                if (action.equals("product_list")) {
                    resp.sendRedirect("product.jsp");
                }
                else if (action.equals("updateStatus")) {
                    ProductModel pm = new ProductModel();
                    pm.deleteProduct(req, resp);
                }
                else if (action.equals("cust_list")) {
                    resp.sendRedirect("customerListing.jsp");}
                else if(action.equals("orderList")){
                    resp.sendRedirect("OrderList.jsp");
                }
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            Object actionObj = req.getParameter("action");
            if (actionObj != null) {
                String action = actionObj.toString();
                if (action.equals("insertProduct")) {
                    ProductModel prm = new ProductModel();
                    prm.insertProduct(req, resp);
                }

                else if (action.equals("insertCust")) {
                    CustomerModel customerModel = new CustomerModel();
                    customerModel.insertCust(req, resp);
                }
            }

        }catch (Exception e){
            throw new RuntimeException(e);
        }
    }
}
