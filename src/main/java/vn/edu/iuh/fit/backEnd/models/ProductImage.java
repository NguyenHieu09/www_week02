package vn.edu.iuh.fit.backEnd.models;

import jakarta.persistence.*;

@Entity
@Table(name = "product_image")
public class ProductImage {
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Product product;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "image_id")
    private long id;
    @Column(name = "path", length = 250, nullable = false)
    private String path;
    @Column(name = "alternative", length = 250)
    private String alternative;

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getAlternative() {
        return alternative;
    }

    public void setAlternative(String alternative) {
        this.alternative = alternative;
    }

    public ProductImage() {
    }

    public ProductImage(Product product, long id, String path, String alternative) {
        this.product = product;
        this.id = id;
        this.path = path;
        this.alternative = alternative;
    }

    @Override
    public String toString() {
        return "ProductImage{" +
                "product=" + product +
                ", id=" + id +
                ", path='" + path + '\'' +
                ", alternative='" + alternative + '\'' +
                '}';
    }
}
