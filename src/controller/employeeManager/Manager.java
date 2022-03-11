package controller.employeeManager;

import model.employee.Employee;
import storage.IOManager;
import controller.getEmployeeInfo.*;
import java.util.ArrayList;

public class Manager extends EmployeeManager{
    private static ArrayList<Employee> savedList = IOManager.savedList;
    private static GetEmployeeDetail getter = new GetDetail();
    @Override
    void addEmployee(Employee e) {
        savedList.add(e);
    }

    @Override
    void removeEmployeeById(String id) throws NullPointerException {
        Employee emp = getter.getEmployeeById(id);
        savedList.remove(emp);
    }

    @Override
    void setEmployeeInfo(Employee target,Employee tempEmpWithCheckedInfo) {
        target=tempEmpWithCheckedInfo;
    }//notChecked!
}
