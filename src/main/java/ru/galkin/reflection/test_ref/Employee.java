package ru.galkin.reflection.test_ref;

public class Employee{
    public
    int id;

    protected
    String name;

    public
    String department;

    private final
    double salary = 1000;

    public Employee(){}

    public Employee(int id, String name, String department) {
        this.id = id;
        this.name = name;
        this.department = department;
    }

//    public Employee(int id, String name, String department, double salary) {
//        this.id = id;
//        this.name = name;
//        this.department = department;
//        this.salary = salary;
//    }
//
//    public double getSalary() {
//        return salary;
//    }
//
//    public void setSalary(double salary) {
//        this.salary = salary;
//    }
//
//    private void changeDepartment(String newDep){
//        this.department = newDep;
//        System.out.println("New dep is: " + newDep);
//    }
//
//    public void increaseSalary(){
//        this.salary *= 2;
//    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                '}';
    }
}