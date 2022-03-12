package view;

import controller.employeeManager.EmployeeManager;
import controller.employeeManager.*;
import controller.getEmployeeInfo.*;
import controller.infoDisplayer.ToScreen;
import controller.userInput.Input;
import model.employee.*;
import storage.IOManager;

import java.util.ArrayList;

public class Proxy implements IProxy {
    EmployeeManager empManager;
    GetEmployeeDetail getter = new GetDetail();
    SetValidDetail empTypeSetter = new SetValid();
    ToScreen toScreen = new ToScreen();
    IOManager IOTool = new IOManager();
    ArrayList<Employee> savedList = IOManager.savedList;
    Input input = new Input();

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
        String type = empTypeSetter.empType;
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
            case "1":
                toScreen.inputBase();
                setter.setValidBase();
                toScreen.inputBonus();
                setter.setValidBonus();
                toScreen.inputMinus();
                setter.setValidMinus();
                break;
            case "2":
                toScreen.inputWorkHour();
                setter.setValidWorkHour();
                break;
            case "3":
                toScreen.inputBase();
                setter.setValidBase();
        }
        Employee empToAdd = setter.tempEmp;
        savedList.add(empToAdd);
        IOTool.writeFile(savedList);
        toScreen.displayCompletion();
        toScreen.displayEmp(empToAdd);
        toScreen.lazyLoad1sec();
        toScreen.displayBackToMenu();
    }
    //done!
    @Override
    public void removeEmp(){
        toScreen.inputId();
        String id=input.inputId();
        Employee removeTarget = getter.getEmployeeById(id);
        if(removeTarget==null){
            toScreen.displayEmpNotFound();
            toScreen.lazyLoad1sec();
            toScreen.displayBackToMenu();
        }else {
            toScreen.displayEmp(removeTarget);
            toScreen.displayConfirm();
            boolean choice = input.confirmAction();
            if (choice) {
                savedList.remove(removeTarget);
                IOTool.writeFile(savedList);
                toScreen.displayCompletion();
                toScreen.lazyLoad1sec();
                toScreen.displayBackToMenu();
            }
        }
    }
    //done!
    @Override
    public void searchEmployee() {
        toScreen.displayKindOfSearch();
        String choice = input.inputKindOfSearch();
        Employee emp;
        boolean found = true;
        switch (choice){
            case "1":
                toScreen.inputId();
                String id = input.inputId();
                emp = getter.getEmployeeById(id);
                if(emp==null){
                    toScreen.displayEmpNotFound();
                    found = false;
                }
                else {
                    toScreen.displayEmp(emp);
                }
                break;
            case "2":
                toScreen.inputName();
                String name = input.inputName();
                emp = getter.getEmployeeByName(name);
                if(emp==null){
                    toScreen.displayEmpNotFound();
                    found = false;
                }
                else {
                    toScreen.displayEmp(emp);
                }
                break;
            case "3":
                ArrayList<Employee> tempList=null;
                toScreen.displayKindOfAgeSearch();
                String choice1 = input.inputKindOfAgeSearch();
                switch (choice1) {
                    case "1":
                        toScreen.inputAge();
                        int age = input.inputAge();
                        tempList = getter.getEmployeeByAge(age);
                        break;
                    case "2":
                        toScreen.displayAgeFrom();
                        int from = input.inputAge();
                        toScreen.displayAgeTo();
                        int to = input.inputAge();
                        tempList = getter.getEmployeeByAge(from,to);
                }
                if(tempList==null){
                    toScreen.displayEmpNotFound();
                    found = false;
                }
                else {
                    toScreen.displaySpecifiedList(tempList);
                }
        }
        if(found){
            toScreen.displayCompletion();
        }
        toScreen.lazyLoad1sec();
        toScreen.displayBackToMenu();
    }
    //done!
    @Override
    public void setEmp(){
        toScreen.inputIdToSetup();
        String id = input.inputId();
        Employee target = getter.getEmployeeById(id);
        if(target==null){
            toScreen.displayEmpNotFound();
        }
        else {
            String type = getter.getEmployeeType(target);
            empManager = new Manager(target);
            toScreen.displayEmpInfoToSet(type);
            boolean continueSetup = true;
            empManager.setter.tempEmp = target;
            while (continueSetup) {
                String choice = input.inputChoiceOfSetting(type);
                switch (choice) {
                    case "1":
                        target.setId("");
                        empManager.setter.setValidId();
                        break;
                    case "2":
                        empManager.setter.setValidName();
                        break;
                    case "3":
                        empManager.setter.setValidAge();
                        break;
                    case "4":
                        empManager.setter.setValidMail();
                        break;
                    default:
                        switch (type){
                            case "1":
                                switch (choice){
                                    case "5":
                                        empManager.setter.setValidBase();
                                        break;
                                    case "6":
                                        empManager.setter.setValidBonus();
                                        break;
                                    case "7":
                                        empManager.setter.setValidMinus();
                                }
                                break;
                            case "2":
                                empManager.setter.setValidWorkHour();
                                break;
                            case "3":
                                empManager.setter.setValidBase();
                        }
                }
                toScreen.displayCompletion();
                toScreen.displayEmp(target);
                toScreen.displayConfirmContinueSetting();
                continueSetup = input.confirmAction();
            }
            IOTool.writeFile(savedList);
            toScreen.lazyLoad1sec();
            toScreen.displayBackToMenu();
        }
    }

    @Override
    public void displayAllList() {
        toScreen.displayAllList();
    }
    //done!
}
