package view;

import controller.employeeManager.SetValid;
import controller.employeeManager.SetValidDetail;
import model.employee.Employee;

public class Proxy implements IProxy {
    @Override
    public void waitASec(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.err.println("Something interrupted the thread!");
        }
    }
    //done!
    @Override
    public void addEmp(){
        toScreen.displayKindaEmpToAdd();
        empTypeSetter.setValidTypeOfEmp();
        int type = empTypeSetter.empType;
        SetValidDetail setter = new SetValid(type);

        toScreen.inputId();
        setter.setValidId();
        toScreen.inputName();
        setter.setValidName();
        toScreen.inputAge();
        setter.setValidAge();
        toScreen.inputMail();
        setter.setValidMail();
        switch (type){
            case 1:
                toScreen.inputBase();
                setter.setValidBase();
                toScreen.inputBonus();
                setter.setValidBonus();
                toScreen.inputMinus();
                setter.setValidMinus();
                break;
            case 2:
                toScreen.inputWorkHour();
                setter.setValidWorkHour();
                break;
            case 3:
                toScreen.inputBase();
                setter.setValidBase();
        }
        Employee empToAdd = setter.target;
        savedList.add(empToAdd);
        IOTool.writeFile(savedList);
        toScreen.displayCompletion();
        toScreen.displayEmp(empToAdd);
        toScreen.displayBackToMenu();
    }
    @Override
    public void removeEmp(){}
    @Override
    public void setEmp(){}

    @Override
    public void displayAllList() {
        toScreen.displayAllList();
    }
}
