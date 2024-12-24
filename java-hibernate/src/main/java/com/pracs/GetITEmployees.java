package com.pracs;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import java.util.List;

public class GetITEmployees {
    public static void main(String[] args) {
        try {
            Configuration cfg = new Configuration().configure();
            SessionFactory sessionFactory = cfg.buildSessionFactory();
            Session session = sessionFactory.openSession();

            String hql = "from Employee where dept='IT'";
            Query<Employee> query = session.createQuery(hql, Employee.class);
            List<Employee> employeeList = query.list();

            for(Employee e: employeeList) {
                System.out.println(e);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
