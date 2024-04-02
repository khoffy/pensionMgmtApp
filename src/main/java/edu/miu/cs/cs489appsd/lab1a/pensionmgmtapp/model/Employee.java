package edu.miu.cs.cs489appsd.lab1a.pensionmgmtapp.model;

import java.time.LocalDate;

public class Employee {
    private Long employeeId;
    private String firstname;
    private String lastname;
    private LocalDate employmentDate;
    private double yearlySalary;

    private PensionPlan pensionPlan;

    public Employee() {}

    public Employee(Long employeeId, String firstname, String lastname, LocalDate employmentDate, double yearlySalary) {
        this.employeeId = employeeId;
        this.firstname = firstname;
        this.lastname = lastname;
        this.employmentDate = employmentDate;
        this.yearlySalary = yearlySalary;
        this.pensionPlan = new PensionPlan();
    }

    public Long getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(Long employeeId) {
        this.employeeId = employeeId;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public LocalDate getEmploymentDate() {
        return employmentDate;
    }

    public void setEmploymentDate(LocalDate employmentDate) {
        this.employmentDate = employmentDate;
    }

    public double getYearlySalary() {
        return yearlySalary;
    }

    public void setYearlySalary(double yearlySalary) {
        this.yearlySalary = yearlySalary;
    }

    public PensionPlan getPensionPlan() {
        return pensionPlan;
    }

    public void setPensionPlan(PensionPlan pensionPlan) {
        this.pensionPlan = pensionPlan;
    }
}
