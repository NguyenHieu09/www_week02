package vn.edu.iuh.fit.backEnd.repositories;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Connection {
    private final EntityManager em;
    private static Connection connection;

    public Connection() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("week02_lab_NguyenThiTrungHieu_20020381");
        em = emf.createEntityManager();
    }

    public EntityManager getEntityManager() {
        return em;
    }

    public static Connection getInstance() {
        if (connection == null)
            connection = new Connection();
        return connection;
    }


}
