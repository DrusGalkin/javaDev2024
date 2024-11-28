package ru.galkin.people;
import java.util.ArrayList;
import java.util.List;

public class Employee {
    public String name;
    Department department;
    List<String> list = new ArrayList<>();

    public Employee(String name, Department department) {
        this.name = name;
        this.department = department;
    }

    public void setDepartment(Department dep){
        if(dep != null){
            department.addEmployee(this);
            return;
        }
        if(this.department == null) return;
        this.department.removeEmployee(this);
        this.department = null;
    }



    public String toString() {
        if (department.chief != null && name == department.chief.name)
            return name + " начальник отдела " + department.name;

        return name + " работает в отделе " + department.name + ", начальник которого " + department.chief.name;
    }
}