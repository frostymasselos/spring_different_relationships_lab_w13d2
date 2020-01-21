package com.example.codeclan.businessdb.models;

import java.util.ArrayList;

public class Department {

    private long id;
    private String name;
    private ArrayList<Employee> employees;

    public Department(String name) {
        this.id = id;
        this.name = name;
        this.employees = new ArrayList<>();
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }
}
