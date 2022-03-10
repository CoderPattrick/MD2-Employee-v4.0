package controller;

import model.employee.Employee;

import java.util.ArrayList;

public interface GetEmployeeDetail {
    int indexOfEmployeeById(String id);
    int indexOfEmployeeByName(String name);
    Employee getEmployeeByIndex(int index);
    ArrayList<Employee> getEmployeeByAge(int from,int to);
    ArrayList<Employee> getEmployeeByAge(int age);
}
