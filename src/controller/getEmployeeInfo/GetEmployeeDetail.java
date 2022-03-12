package controller.getEmployeeInfo;
import model.employee.Employee;
import storage.IOManager;

import java.util.ArrayList;

public interface GetEmployeeDetail {
    static final ArrayList<Employee> savedList= IOManager.savedList;
    int indexOfEmployeeById(String id);
    int indexOfEmployeeByName(String name);
    ArrayList<Employee> getEmployeeByAge(double from,double to);
    ArrayList<Employee> getEmployeeByAge(double age);
    Employee getEmployeeById(String id);
    String getIdByInput();
    Employee getEmployeeByName(String name);
}
