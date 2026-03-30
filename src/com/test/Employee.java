package com.test;

import java.time.LocalDate;

class Employee {

    private String name;
    private int id;
    private String department;
    private double salary;
    private LocalDate joiningDate;

    // constructor, getters, setters


    public Employee() {

    }

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

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public LocalDate getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(LocalDate joiningDate) {
        this.joiningDate = joiningDate;
    }

    public Employee(String name, int id, double salary, String department, LocalDate joiningDate) {
        this.name = name;
        this.id = id;
        this.salary = salary;
        this.department = department;
        this.joiningDate = joiningDate;
    }
}