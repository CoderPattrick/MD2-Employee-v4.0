package controller.employeeManager;

import model.employee.Employee;
import model.employee.FullTimeEmp;
import model.employee.Leader;
import model.employee.PartTimeEmp;

public abstract class SetValidDetail {
    public Employee target;
    public int empType;

    public SetValidDetail() {
    }

    public SetValidDetail(Employee target) {
        this.target = target;
    }

    public SetValidDetail(int empType) {
        this.empType=empType;
        switch (empType){
            case 1:
                target=new FullTimeEmp();
                break;
            case 2:
                target=new PartTimeEmp();
                break;
            case 3:
                target=new Leader();
        }
    }
    public abstract void setValidTypeOfEmp();
    public abstract void setValidId();
    public abstract void setValidName();
    public abstract void setValidAge();
    public abstract void setValidMail();
    public abstract void setValidBase();
    public abstract void setValidBonus();
    public abstract void setValidMinus();
    public abstract void setValidWorkHour();
}
