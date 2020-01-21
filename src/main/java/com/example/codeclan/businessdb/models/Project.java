package com.example.codeclan.businessdb.models;

import java.util.ArrayList;

public class Project {

    private long id;
    private String name;
    private int duration;
    private ArrayList<Employee> employees;

    public Project () {

    }

    public Project(String name, int duration) {
        this.id = id;
        this.name = name;
        this.duration = duration;
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

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(ArrayList<Employee> employees) {
        this.employees = employees;
    }
}
