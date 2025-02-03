package com.bruceycode.department_service.model;

import java.util.ArrayList;
import java.util.List;

public class Department {

    private Long id;

    private String name;

    private List<Employee> employees = new ArrayList<>();

    public Department() {
    }

    public Department(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setI(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }

    @Override
    public String toString() {
        return "Department{" +
                "i=" + id +
                ", name='" + name + '\'' +
                ", employees=" + employees +
                '}';
    }

}
