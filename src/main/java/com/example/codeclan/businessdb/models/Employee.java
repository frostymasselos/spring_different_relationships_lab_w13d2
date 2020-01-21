package com.example.codeclan.businessdb.models;

import java.util.ArrayList;

public class Employee {

    private long employeeNumber;
    private String firstName;
    private String SecondName;
    private ArrayList<Project> projects;

    public Employee () {

    }

    public Employee(String firstName, String secondName) {
        this.employeeNumber = employeeNumber;
        this.firstName = firstName;
        SecondName = secondName;
        this.projects = new ArrayList<Project>();
    }

    public long getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(long employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecondName() {
        return SecondName;
    }

    public void setSecondName(String secondName) {
        SecondName = secondName;
    }

    public ArrayList<Project> getProjects() {
        return projects;
    }

    public void setProjects(ArrayList<Project> projects) {
        this.projects = projects;
    }
}
