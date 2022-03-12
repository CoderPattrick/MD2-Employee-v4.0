package controller.employeeManager;

import controller.getEmployeeInfo.GetDetail;
import controller.getEmployeeInfo.GetEmployeeDetail;
import model.employee.Employee;

public abstract class EmployeeManager {
    public SetValidDetail setter;
    private static GetEmployeeDetail getter = new GetDetail();
    private Employee target;

    public EmployeeManager() {
    }

    public EmployeeManager(Employee target) {
        this.target = target;
        String type =getter.getEmployeeType(target);
        setter = new SetValid(type);
    }
    abstract void addEmployee(Employee emp);
    abstract void removeEmployeeById(String id);
    abstract void setEmployeeInfo(Employee emp1,Employee emp2);
}
