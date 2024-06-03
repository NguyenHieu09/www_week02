package vn.edu.iuh.fit.backEnd.repositories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import vn.edu.iuh.fit.backEnd.models.Order;

import java.util.List;

public class OrderRepository {
    private EntityManager em;
    private EntityTransaction trans;
    private Logger logger = LoggerFactory.getLogger(this.getClass().getName());

    public OrderRepository() {
        em = Connection.getInstance().getEntityManager();
        trans = em.getTransaction();
    }

    public List<Order> getAll(){
//        return em.createNamedQuery("Order.findAll", Order.class)
        return em.createQuery("select o from Order o",Order.class)
                .getResultList();
    }

    public boolean insertOrder(Order o){
        try {
            trans.begin();
            em.persist(o);
            trans.commit();
            return true;
        } catch (Exception e) {
            trans.rollback();
            logger.error(e.getMessage());
        }
        return false;
    }
}
