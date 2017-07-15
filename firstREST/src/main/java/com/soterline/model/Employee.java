package com.soterline.model;

import java.util.*;
/**
 * Created by tozogabee on 7/14/17.
 */
public class Employee {

    private String name;
    private int age;
    private List<Salary> salaries;
    private List<Phone> phoneList;

    public Employee(String name, int age, List<Salary> salaries, List<Phone> phoneList) {
        this.name = name;
        this.age = age;
        this.salaries = salaries;
        this.phoneList = phoneList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Salary> getSalaries() {
        return salaries;
    }

    public void setSalaries(List<Salary> salaries) {
        this.salaries = salaries;
    }

    public List<Phone> getPhoneList() {
        return phoneList;
    }

    public void setPhoneList(List<Phone> phoneList) {
        this.phoneList = phoneList;
    }
}
