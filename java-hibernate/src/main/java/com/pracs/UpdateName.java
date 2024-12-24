package com.pracs;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateName {
    public static void main(String[] args) {
        try {
            Configuration cfg = new Configuration().configure();
            SessionFactory sessionFactory = cfg.buildSessionFactory();
            Session session = sessionFactory.openSession();

            Transaction tx = session.beginTransaction();

            Employee employee = session.get(Employee.class, 1);
            if(employee != null) {
                System.out.println(employee);
                employee.setName("Harry");
                session.update(employee);
                tx.commit();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
