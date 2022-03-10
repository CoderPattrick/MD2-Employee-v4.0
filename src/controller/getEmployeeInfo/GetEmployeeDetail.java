package controller.getEmployeeInfo;

import model.employee.Employee;

import java.util.ArrayList;

public interface GetEmployeeDetail {
    static final ArrayList<Employee> savedList=null;
    int indexOfEmployeeById(String id);
    int indexOfEmployeeByName(String name);
    ArrayList<Employee> getEmployeeByAge(double from,double to);
    ArrayList<Employee> getEmployeeByAge(double age);
}
