package com.tw.apistackbase;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Transient;
import java.util.ArrayList;
import java.util.List;




@Entity
public class Company {






     @Id
     @GeneratedValue
     private String companyId;


//   @Transien
     private String employeesNumber;
     private String companyName;


    @Transient
     private List<Employee> employees=new ArrayList<Employee>();



    public Company(String companyName) {
        this.companyName = companyName;
    }

     public Company()
     {

     }

    public Company(String companyId, String employeesNumber, String companyName) {
        this.companyId = companyId;
        this.employeesNumber = employeesNumber;
        this.companyName = companyName;
    }


    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getEmployeesNumber() {
        return employeesNumber;
    }

    public void setEmployeesNumber(String employeesNumber) {
        this.employeesNumber = employeesNumber;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }


}
