package controller;

import model.employee.Employee;

public abstract class SetValidDetail {
    Employee target;

    public SetValidDetail(Employee target) {
        this.target = target;
    }

    public SetValidDetail() {
    }

    abstract void setValidId();
    abstract void setValidName();
    abstract void setValidAge();
    abstract void setValidMail();
    abstract void setValidBase();
    abstract void setValidBonus();
    abstract void setValidMinus();
    abstract void setValidWorkHour();
}
