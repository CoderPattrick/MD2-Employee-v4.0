package controller.employeeManager;

import model.employee.Employee;
import model.employee.FullTimeEmp;
import model.employee.Leader;
import model.employee.PartTimeEmp;

public abstract class SetValidDetail {
    public Employee tempEmp;
    public String empType;

    public SetValidDetail() {
    }

    public SetValidDetail(String empType) {
        this.empType=empType;
        switch (empType){
            case "1":
                tempEmp =new FullTimeEmp();
                break;
            case "2":
                tempEmp =new PartTimeEmp();
                break;
            case "3":
                tempEmp =new Leader();
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
