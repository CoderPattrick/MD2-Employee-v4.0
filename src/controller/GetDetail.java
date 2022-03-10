package controller;

import model.employee.Employee;

import java.util.ArrayList;

public class GetDetail implements GetEmployeeDetail{
    @Override
    public int indexOfEmployeeById() {
        return 0;
    }

    @Override
    public int indexOfEmployeeByName() {
        return 0;
    }

    @Override
    public Employee getEmployeeByIndex() {
        return null;
    }

    @Override
    public ArrayList<Employee> getEmployeeByAge(int from, int to) {
        return null;
    }

    @Override
    public ArrayList<Employee> getEmployeeByAge(int age) {
        return null;
    }
}
