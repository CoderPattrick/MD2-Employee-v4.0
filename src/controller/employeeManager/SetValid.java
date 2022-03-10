package controller.employeeManager;

import controller.getEmployeeInfo.GetDetail;
import controller.getEmployeeInfo.GetEmployeeDetail;
import model.employee.*;
import model.employee.employeeRegex.Regex;

import java.util.InputMismatchException;
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
        target.setId(id);
    }

    @Override
    void setValidName() {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        if (!regexTool.isValidName(name)){
            System.err.print("Name is invalid! Try again: ");
            setValidName();
        }
        target.setName(name);
    }

    @Override
    void setValidAge() {
        Scanner input = new Scanner(System.in);
        double age =0;
        try{
            age = input.nextDouble();
        }
        catch (InputMismatchException e){
            System.err.print("Invalid! Try again: ");
            setValidAge();
        }
        if (!regexTool.isValidAge(age+"")){
            System.err.print("Age is invalid! Try again: ");
            setValidAge();
        }
        target.setAge(age);
    }

    @Override
    void setValidMail() {
        Scanner input = new Scanner(System.in);
        String mail = input.nextLine();
        if (!regexTool.isValidMail(mail)){
            System.err.print("Mail is invalid! Try again: ");
            setValidMail();
        }
        target.setMail(mail);
    }

    @Override
    void setValidBase() {
        Scanner input = new Scanner(System.in);
        double base=0;
        try{
            base = input.nextDouble();
        }
        catch (InputMismatchException e){
            System.err.print("Base-Salary is invalid! Try again: ");
            setValidBase();
        }
        if (!regexTool.isValidBase(base+"")){
            System.err.print("Base-Salary is invalid! Try again: ");
            setValidBase();
        }
        if(target instanceof FullTimeClass){
            ((FullTimeClass)target).setBaseSalary(base);
        }
        else {
            ((LeaderClass)target).setBaseSalary(base);
        }
    }

    @Override
    void setValidBonus() {
        Scanner input = new Scanner(System.in);
        double bonus=0;
        try{
            bonus = input.nextDouble();
        }
        catch (InputMismatchException e){
            System.err.print("Invalid! Try again: ");
            setValidBonus();
        }
        if (!regexTool.isValidBonus(""+bonus)){
            System.err.print("Bonus is in valid! Try again: ");
            setValidBonus();
        }
        ((FullTimeClass)target).setBonus(bonus);
    }

    @Override
    void setValidMinus() {
        Scanner input = new Scanner(System.in);
        double minus=0;
        try{
            minus = input.nextLong();
        }
        catch (InputMismatchException e){
            System.err.print("Minus is invalid! Try again: ");
            setValidMinus();
        }
        if (!regexTool.isValidMinus(minus+"")){
            System.err.print("Minus is invalid! Try again: ");
            setValidMinus();
        }
        ((FullTimeClass)target).setMinus(minus);
    }

    @Override
    void setValidWorkHour() {
        Scanner input = new Scanner(System.in);
        double workHour=0;
        try{
            workHour = input.nextDouble();
        }
        catch (InputMismatchException e){
            System.err.print("Work-hour is invalid! Try again: ");
            setValidWorkHour();
        }
        if (!regexTool.isValidWorkHour(""+workHour)){
            System.err.print("Work-hour is invalid! Try again: ");
            setValidWorkHour();
        }
        ((PartTimeClass)target).setWorkHour(workHour);
    }
}
