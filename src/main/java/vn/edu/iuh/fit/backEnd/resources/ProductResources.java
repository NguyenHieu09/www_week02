//package vn.edu.iuh.fit.backEnd.resources;
//
//import jakarta.ws.rs.*;
//import jakarta.ws.rs.core.Response;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import vn.edu.iuh.fit.backEnd.Services.ProductServices;
//import vn.edu.iuh.fit.backEnd.models.Product;
//
//import java.util.List;
//import java.util.Optional;
//
//@Path("/products")
//public class ProductResources {
//    private final ProductServices productServices = new ProductServices();
////    private Logger logger = LoggerFactory.getLogger(this.getClass().getName());
//
//    public ProductResources() {
//
//    }
//
//    @GET
//    @Produces("application/json")
//    public Response getActiveProduct(){
//        List<Product> listProduct = productServices.getActiveProduct();
//        return  Response.ok(listProduct).build();
//    }
//
//    @Produces("application/json")
//    public Response getAll(){
//        List<Product> listProduct = productServices.getAll();
//        return  Response.ok(listProduct).build();
//    }
//
//    @POST
//    @Consumes("application/json")
//    public Response insertProduct(Product p) {
//        boolean b = productServices.insertProduct(p);
//
//        if (b)
//            return Response.status(Response.Status.CREATED).build();
//
//        return Response.status(Response.Status.BAD_REQUEST).build();
//    }
//
//
//}
