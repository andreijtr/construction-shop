package com.sda.construction.repository;

import com.sda.construction.config.HibernateUtil;
import com.sda.construction.entities.Ciment;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import java.util.List;

@Repository
public class CimentDAO {

    public void saveOrUpdate(Ciment ciment) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        session.save(ciment);

        transaction.commit();
        session.close();
    }

    public List<Ciment> findByProducator(String producator) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Query query = session.createNamedQuery("findByProducator");
        query.setParameter("producator", producator);
        List<Ciment> cimentList = query.getResultList();

        transaction.commit();
        session.close();

        return cimentList;
    }
}
