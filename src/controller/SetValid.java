package controller;

import model.employee.employeeRegex.Regex;

import java.util.Scanner;

public class SetValid extends SetValidDetail {
    private static final Regex regexTool = new Regex();
    private static final GetEmployeeDetail getter = new GetDetail();
    @Override
    void setValidId() {
        Scanner inputID = new Scanner(System.in);
        String id = inputID.nextLine();
        if (getter.indexOfEmployeeById(id)!=-1){
            System.err.print("Id exists, please try again: ");
            setValidId();
            return;
        }
        if (!regexTool.isValidId(id)){
            System.err.print("Id is invalid! Try again: ");
            setValidId();
            return;
        }
    }

    @Override
    void setValidName() {

    }

    @Override
    void setValidAge() {

    }

    @Override
    void setValidMail() {

    }

    @Override
    void setValidBase() {

    }

    @Override
    void setValidBonus() {

    }

    @Override
    void setValidMinus() {

    }

    @Override
    void setValidWorkHour() {

    }
}
