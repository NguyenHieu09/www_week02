package vn.edu.iuh.fit.backEnd.models;

import jakarta.persistence.*;
import vn.edu.iuh.fit.backEnd.converters.ProductStatusConverter;
import vn.edu.iuh.fit.backEnd.enums.ProductStatus;

import java.util.List;

@Entity
@Table(name = "product")
@NamedQueries(value =  {
        @NamedQuery(name = "Product.findAll", query = "select p from Product p"),
        @NamedQuery(name = "Product.findById", query = "select p from Product p where p.id = ?1"),
        @NamedQuery(name = "Product.getProductActive", query = "select p from Product p where p.status = ?1")
})
public class Product {
    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "product_id")
    private long id;
    @Column(name = "name", length = 150, nullable = false)
    private String name;
    @Column(name = "description", length = 250, nullable = false)
    private String description;
    @Column(name = "unit", length = 25, nullable = false)
    private String unit;
    @Column(name = "manufacturer_name", length = 100, nullable = false)
    private String manufacturerName;

    @Column(name = "status", nullable = false)
    @Convert(converter = ProductStatusConverter.class)
    private ProductStatus status;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private List<ProductImage> productImages;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private List<OrderDetail> orderDetails;

    @OneToMany(mappedBy = "product", cascade = CascadeType.ALL)
    private List<ProductPrice> productPrices;


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public String getManufacturerName() {
        return manufacturerName;
    }

    public void setManufacturerName(String manufacturerName) {
        this.manufacturerName = manufacturerName;
    }

    public ProductStatus getStatus() {
        return status;
    }

    public void setStatus(ProductStatus status) {
        this.status = status;
    }

    public Product(long id, String name, String description, String unit, String manufacturerName, ProductStatus status) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.unit = unit;
        this.manufacturerName = manufacturerName;
        this.status = status;
    }

    public Product() {
    }

    public Product(String name, String description, String unit, String manufacturerName, ProductStatus status) {
        this.name = name;
        this.description = description;
        this.unit = unit;
        this.manufacturerName = manufacturerName;
        this.status = status;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", unit='" + unit + '\'' +
                ", manufacturerName='" + manufacturerName + '\'' +
                ", status=" + status +
                '}';
    }
}
