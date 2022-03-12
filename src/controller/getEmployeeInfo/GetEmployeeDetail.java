package controller.getEmployeeInfo;

import model.employee.Employee;
import java.util.ArrayList;

public interface GetEmployeeDetail {
    int indexOfEmployeeById(String id);
    int indexOfEmployeeByName(String name);
    ArrayList<Employee> getEmployeeByAge(double from,double to);
    ArrayList<Employee> getEmployeeByAge(double age);
    Employee getEmployeeById(String id);
    Employee getEmployeeByName(String name);
    String getEmployeeType(Employee emp);
}
