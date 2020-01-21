package com.example.codeclan.businessdb.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "employee_number")
    private long employeeNumber;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "second_name")
    private String SecondName;

    @ManyToOne
    @JoinColumn(name = "department_id", nullable = false)
    private Department department;

    @JsonIgnoreProperties(value = "employees")
    @ManyToMany
    @JoinTable(
            name = "employee_projects",
            joinColumns = {
                    @JoinColumn(
                            name = "project_id", //hibernate automatically
                            nullable = false,
                            updatable = false
                    )
            },
            inverseJoinColumns = {
                    @JoinColumn(
                            name = "employee_id",
                            nullable = false,
                            updatable = false
                    )
            }
    )

    private List<Project> projects;


    public Employee(String firstName, String secondName, Department department) {
        this.employeeNumber = employeeNumber;
        this.firstName = firstName;
        SecondName = secondName;
        this.projects = new ArrayList<Project>();
        this.department = department;
    }
    public Employee () {

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

    public List<Project> getProjects() {
        return projects;
    }

    public void setProjects(List<Project> projects) {
        this.projects = projects;
    }

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }
}
