/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package malcolm.repository;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import javax.persistence.Query;
import org.springframework.beans.factory.annotation.Autowired;

public class HibernateUtil<E> {

    @Autowired
    private SessionFactory sessionFactory;
    private Session session;

    protected Session getSession() {
        session = sessionFactory.getCurrentSession();
        return session;
    }

    protected List<E> findAll(String query) {
        getSession();
        Query myQuery = session.createNamedQuery(query);
        List<E> list = myQuery.getResultList();

        return list;
    }

    protected E save(E entity) {
        session = getSession();
        session.saveOrUpdate(entity);
        return entity;
    }

    protected E find(Class<E> type, int id) {
        session = getSession();
        E e = session.find(type, id);
        return e;
    }

    public void delete(Class<E> type, int id) {
        
        session = getSession();
        E e = session.find(type, id);
        session.remove(e);
        
    }

}
