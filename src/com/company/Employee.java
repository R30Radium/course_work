package com.company;
import java.util.Objects;

public class Employee {
    private String fullName;
    private int department;
    private int salary;
    int id;
    static int counter = 1;

    String getFullName() {
        return this.fullName;
    }

    private int getDepartment() {
        return this.department;
    }

    int getSalary() {
        return this.salary;
    }

    private int getId() {
        return this.id;
    }

    private void setDepartment(int department) {
        this.department = department;
    }

    private void setSalary(int salary) {
        this.salary = salary;
    }

     Employee(String fullName, int department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = counter++;
    }


    //Как методы ниже вообще сделать private? Дайте подсказки, если это возможно
    public int hashCode() {
        return Objects.hash(fullName, department, salary, id);
    }

    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return department == employee.department && salary == employee.salary && id == employee.id && Objects.equals(fullName, employee.fullName);
    }
    public String toString() {
        return "Информация о сотруднике: ФИО - " + this.fullName + ", Отдел № " + this.department + ", З/П:" + this.salary;
    }

}