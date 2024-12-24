package com.pracs;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name="name")
    private String name;

    @Column(name="dept")
    private String dept;

    @Column(name="designation")
    private String designation;

    @Column(name="salary")
    private Double salary;

    @Column(name="dateofjoin")
    @Temporal(TemporalType.DATE)
    private Date dateOfJoin;


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }
    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }

    public Double getSalary() {
        return salary;
    }
    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Date getDateOfJoin() {
        return dateOfJoin;
    }
    public void setDateOfJoin(Date dateOfJoin) {
        this.dateOfJoin = dateOfJoin;
    }

    @Override
    public String toString() {
        return "Employee { " +
                "id = " + id +
                ", name = " + name +
                ", dept = " + dept +
                ", designation = " + designation +
                ", salary = " + salary +
                ", dateOfJoin = " + dateOfJoin +
                " }";
    }
}
