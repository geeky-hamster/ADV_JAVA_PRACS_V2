package com.pracs;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Calendar;
import java.util.Date;

public class AddEmployee {
    public static void main(String[] args) {
        try {
            Configuration cfg = new Configuration().configure();
            SessionFactory sessionFactory = cfg.buildSessionFactory();
            Session session = sessionFactory.openSession();

            Transaction tx = session.beginTransaction();

            Employee employee = new Employee();
            employee.setName("Hardik");
            employee.setDept("Sales");
            employee.setSalary(45000.0);
            employee.setDesignation("Sales Manager");
            employee.setDateOfJoin(new Date(122, Calendar.DECEMBER, 20));

            Employee employee2 = new Employee();
            employee2.setName("Anjali");
            employee2.setDept("IT");
            employee2.setSalary(55000.0);
            employee2.setDesignation("Software Engineer");
            employee2.setDateOfJoin(new Date(120, Calendar.JANUARY, 15));

            Employee employee3 = new Employee();
            employee3.setName("Rohan");
            employee3.setDept("HR");
            employee3.setSalary(40000.0);
            employee3.setDesignation("HR Executive");
            employee3.setDateOfJoin(new Date(121, Calendar.SEPTEMBER, 10));


            session.save(employee);
            session.save(employee2);
            session.save(employee3);
            tx.commit();
            System.out.println("Employees Added Successfully");
            session.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
