package com.company;
import java.util.Objects;

public class Employee {
    public String fullName; // в пул реквесте не было очень понятно, указывается ли на то,
    public int department; // что приват надо поменять на паблик, или что то другое
    public int salary;
    int id;
    static int counter = 1;

    public String getFullName() {
        return this.fullName;
    }

    public int getDepartment() {
        return this.department;
    }

    public int getSalary() {
        return this.salary;
    }

    public int getId() {
        return this.id;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Employee(String fullName, int department, int salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        this.id = counter++;
    }



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