package vn.edu.iuh.fit.backEnd.Services;

import vn.edu.iuh.fit.backEnd.enums.ProductStatus;
import vn.edu.iuh.fit.backEnd.models.Product;
import vn.edu.iuh.fit.backEnd.repositories.ProductRepository;

import java.util.List;

public class ProductServices {
    private final ProductRepository productRepository;

    public ProductServices() {
        productRepository = new ProductRepository();
    }

    public List<Product> getActiveProduct(){
        return productRepository.getActiveProduct();
    }

    public boolean insertProduct(Product p){
        return productRepository.insertProduct(p);

    }

    public List<Product> getAll(){
        return productRepository.getAll();
    }

    public boolean updateStatus(long id, ProductStatus productStatus) {
        return productRepository.updateStatus(id, productStatus);
    }
}
