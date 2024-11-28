package ru.galkin.people;

import java.util.ArrayList;
import java.util.List;

public class Department {
    String name;
    Employee chief;
    List<Employee> listEmployee = new ArrayList<>();

    public Department(String name){
        this.name = name;
    }

    public void setChief(Employee chief) {
        this.chief = chief;
        chief.department = this;
    }

    public void addEmployee(Employee name){
        if(this == name.department) return;
        if(name == null) return;
        else listEmployee.add(name);
    }


    public void removeEmployee(Employee employee){
        if(employee != null) return;
        if(!listEmployee.contains(employee)) return;
        if(chief == employee) return;
        listEmployee.remove(employee);
    }
}