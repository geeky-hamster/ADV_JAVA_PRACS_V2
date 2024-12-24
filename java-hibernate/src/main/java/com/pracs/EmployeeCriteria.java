package com.pracs;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import java.util.List;

public class EmployeeCriteria {
    public static void main(String[] args) {
        try {
            Configuration cfg = new Configuration().configure();
            SessionFactory sessionFactory = cfg.buildSessionFactory();
            Session session = sessionFactory.openSession();

            Criteria criteria = session.createCriteria(Employee.class);
            criteria.add(Restrictions.gt("dateOfJoin", java.sql.Date.valueOf("2021-01-01"))).add(Restrictions.eq("dept", "HR"));

            List<Employee> employeeList = criteria.list();

            for (Employee e: employeeList) {
                System.out.println(e);
            }


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
