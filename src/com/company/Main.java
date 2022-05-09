package com.company;
import java.util.Objects;
public class Main {

    //я очень устал это делать

    private static Employee[] employee = new Employee[10];

    private static void listEmployee() {
        for (int i = 0; i < employee.length; i++) {
            System.out.println(employee[i]);
        }
    }

    private static int sumSalaryEmployee(Employee[] employees) {
        int sum = 0;
        for (int i = 0; i < employee.length; i++) {
            sum = sum + employee[i].getSalary();
        }
        System.out.println("Фонд оплаты труда для всех сотрудников = " + sum);
        return sum;

    }

    private static int maxSalary(Employee[] employees) {
        int maxSalary = employee[0].getSalary();
        String maxName = employee[0].getFullName();
        for (int i = 0; i < employee.length; i++) {
            if (maxSalary < employee[i].getSalary()) {
                maxSalary = employee[i].getSalary();
                maxName = employee[i].getFullName();
            }
        }
        System.out.println("Сотрудник с наибольшей З/П: " + maxName + ", получает " + maxSalary);
        return maxSalary;

    }

    private static int minSalary(Employee[] employees) {
        int minSalary = employee[0].getSalary();
        String minName = employee[0].getFullName();

        for (int i = 0; i < employee.length; i++) {
            if (minSalary > employee[i].getSalary()) {
                minSalary = employee[i].getSalary();
                minName = employee[i].getFullName();

            }
        }


        System.out.println("Сотрудник с наименьшей З/П: " + minName + ", получает " + minSalary);
        return minSalary;

    }


    private static double averageSalary(Employee[] employees) {
        int sum = sumSalaryEmployee(employees);
        double averageSalary = sum / employees.length;
        System.out.println("Средняя зарплата среди сотрудников " + averageSalary);
        return averageSalary;
    }

    private static void allEmployee() {
        for (int i = 0; i < employee.length; i++) {
            System.out.println("Сотрудник ФИО - " + employee[i].getFullName());
        }
    }


    public static void main(String[] args) {

        employee[0] = new Employee("Семёнов Семён Семёнович", 1, 11000);
        employee[1] = new Employee("Иванов Иван Иванович", 1, 22000);
        employee[2] = new Employee("Александров Александр Александрович", 2, 33000);
        employee[3] = new Employee("Фёдоров Фёдор Фёдорович", 2, 44000);
        employee[4] = new Employee("Игнатьев Игнат Игнатович", 3, 55000);
        employee[5] = new Employee("Константинов Константив Конставич", 3, 66000);
        employee[6] = new Employee("Ильин Илья Ильич", 4, 77000);
        employee[7] = new Employee("Козьмов Козьма Козьмич", 4, 88000);
        employee[8] = new Employee("Вельерьев Валерий Валерьевич", 5, 99000);
        employee[9] = new Employee("Никита Радий Евгеньевич", 5, 111000);

        listEmployee();
        sumSalaryEmployee(employee);
        minSalary(employee);
        maxSalary(employee);
        averageSalary(employee);
        allEmployee();

    }




    }