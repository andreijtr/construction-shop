package com.sda.construction.repository;

import com.sda.construction.config.HibernateUtil;
import com.sda.construction.entities.Caramida;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CaramidaDAO {

    public void insertCaramida(Caramida caramida) {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();
        session.persist(caramida);
        transaction.commit();
        session.close();
    }

    public Caramida findByTip(String tip) {
        Session session = HibernateUtil.getSession();
        Transaction transaction = session.beginTransaction();

        Query query = session.createNamedQuery("findCaramidaByTip", Caramida.class);
        query.setParameter("tip", tip);
        Caramida caramida = (Caramida) query.getSingleResult();

        transaction.commit();
        session.close();
        return caramida;
    }

    public List<Caramida> findAll() {
        List<Caramida> caramidaList = new ArrayList<>();
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();
        Query query = session.createNamedQuery("findAllCaramizi", Caramida.class);
        caramidaList = query.getResultList();
        transaction.commit();
        session.close();
        return caramidaList;
    }

    public int deleteByCantitate(int cantitate) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Query query = session.createNamedQuery("deleteByCantitate");
        query.setParameter("cantitate", cantitate);
        int rowsEffected = query.executeUpdate();

        transaction.commit();
        session.close();

        return rowsEffected;
    }
}
