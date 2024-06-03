package vn.edu.iuh.fit.backEnd.repositories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.TypedQuery;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import vn.edu.iuh.fit.backEnd.converters.ProductStatusConverter;
import vn.edu.iuh.fit.backEnd.enums.ProductStatus;
import vn.edu.iuh.fit.backEnd.models.Product;

import java.util.List;


public class ProductRepository {
    private EntityManager em;
    private EntityTransaction trans;
    private Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    public ProductRepository() {
        em = Connection.getInstance().getEntityManager();
        trans = em.getTransaction();
    }

    public List<Product> getActiveProduct(){

//        return em.createQuery("select p from Product p where p.status = ?1", Product.class)
//                .setParameter(1, ProductStatus.ACTIVE)
//                .getResultList();
        return em.createNamedQuery("Product.getProductActive",Product.class)
                .setParameter(1, ProductStatus.ACTIVE)
                .getResultList();
    }



    public boolean insertProduct(Product p) {
        try {
            trans.begin();
            em.persist(p);
            trans.commit();
            return true;
        } catch (Exception e) {
            trans.rollback();
            logger.error(e.getMessage());
        }
        return false;
    }

    public List<Product> getAll(){
        return em.createQuery("select p from Product p", Product.class).getResultList();
    }

    public boolean updateStatus(long id, ProductStatus productStatus) {
        TypedQuery<Product> q = em.createNamedQuery("Product.findById", Product.class)
                .setParameter(1, id);
        Product product = q.getSingleResult();
        product.setStatus(productStatus);
        try {
            trans.begin();
            em.merge(product);
            trans.commit();
            return true;
        } catch (Exception e) {
            trans.rollback();
            logger.error(e.getMessage());
        }
        return false;
    }
}
