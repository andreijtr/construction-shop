package com.sda.construction.repository;

import com.sda.construction.config.HibernateUtil;
import com.sda.construction.entities.Grinda;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import javax.persistence.Query;
import java.util.List;

@Repository
public class GrindaDAO {

    public void saveOrUpdate(Grinda grinda) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        session.save(grinda);

        transaction.commit();
        session.close();
    }

    public List<Grinda> findByParameters(Grinda grinda) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaction = session.beginTransaction();

        Query query = session.createNamedQuery("findByParameters", Grinda.class);
        query.setParameter("lemn", grinda.getLemn());
        query.setParameter("lungime", grinda.getLungime());
        query.setParameter("grosime", grinda.getGrosime());

        List<Grinda> grindaList = query.getResultList();

        transaction.commit();
        session.close();
        return grindaList;
    }

    public List<Grinda> findAll() {
        //conexiunea cu baza de date
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        //creez query-ul
        Query query = session.createNamedQuery("findAll", Grinda.class);
        List<Grinda> grinzi = query.getResultList();

        //inchid sesiunea
        transaction.commit();
        session.close();

        return grinzi;
    }

    public List<Grinda> findByLemn(String lemn) {
        SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
        Session session = sessionFactory.openSession();
        Transaction transaction = session.beginTransaction();

        Query query = session.createNamedQuery("findByLemn", Grinda.class);
        query.setParameter("lemn", lemn);
        List<Grinda> grinzi = query.getResultList();

        transaction.commit();
        session.close();
        return grinzi;
    }
}
