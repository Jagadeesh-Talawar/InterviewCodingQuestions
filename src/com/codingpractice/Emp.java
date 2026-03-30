package com.codingpractice;

import java.util.Objects;

public class Emp {
    private int id;
    private String name;
    private double salary;
    private String gender;
    private String dept;

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

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Emp emp = (Emp) o;
        return id == emp.id && Double.compare(salary, emp.salary) == 0 && Objects.equals(name, emp.name) && Objects.equals(gender, emp.gender) && Objects.equals(dept, emp.dept);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, salary, gender, dept);
    }

    public Emp(String name, double salary, int id, String gender, String dept) {

        this.name = name;
        this.salary = salary;
        this.id = id;
        this.gender = gender;
        this.dept = dept;
    }

    public Emp() {
    }
}
