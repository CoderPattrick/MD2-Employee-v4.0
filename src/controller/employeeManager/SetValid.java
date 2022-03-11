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

    public SetValid() {
    }

    public SetValid(int empType) {
        super(empType);
    }

    @Override
    public void setValidTypeOfEmp() {
        Scanner input = new Scanner(System.in);
        int choice;
        try {
            choice = input.nextInt();
        }
        catch (InputMismatchException e){
            System.err.print("Invalid! Try again: ");
            setValidTypeOfEmp();
            return;
        }
        if(choice!=1&&choice!=2&&choice!=3){
            System.err.print("Invalid! Try again: ");
            setValidTypeOfEmp();
        }
        empType = choice;
    }

    @Override
    public void setValidId() {
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
    public void setValidName() {
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        if (!regexTool.isValidName(name)){
            System.err.print("Name is invalid! Try again: ");
            setValidName();
            return;
        }
        target.setName(name);
    }

    @Override
    public void setValidAge() {
        Scanner input = new Scanner(System.in);
        int age =0;
        try{
            age = input.nextInt();
        }
        catch (InputMismatchException e){
            System.err.print("Invalid! Try again: ");
            setValidAge();
            return;
        }
        if (!regexTool.isValidAge(""+age)){
            System.err.print("Age is invalid! Try again: ");
            setValidAge();
            return;
        }
        target.setAge(age);
    }

    @Override
    public void setValidMail() {
        Scanner input = new Scanner(System.in);
        String mail = input.nextLine();
        if (!regexTool.isValidMail(mail)){
            System.err.print("Mail is invalid! Try again: ");
            setValidMail();
            return;
        }
        target.setMail(mail);
    }

    @Override
    public void setValidBase() {
        Scanner input = new Scanner(System.in);
        long base=0;
        try{
            base = input.nextLong();
        }
        catch (InputMismatchException e){
            System.err.print("Base-Salary is invalid! Try again: ");
            setValidBase();
            return;
        }
        if (!regexTool.isValidBase(""+base)){
            System.err.print("Base-Salary is invalid! Try again: ");
            setValidBase();
            return;
        }
        if(target instanceof FullTimeEmp){
            ((FullTimeEmp)target).setBaseSalary(base);
        }
        else {
            ((Leader)target).setBaseSalary(base);
        }
    }

    @Override
    public void setValidBonus() {
        Scanner input = new Scanner(System.in);
        int bonus;
        try{
            bonus = input.nextInt();
        }
        catch (InputMismatchException e){
            System.err.print("Invalid! Try again: ");
            setValidBonus();
            return;
        }
        if (!regexTool.isValidBonus(""+bonus)){
            System.err.print("Bonus is in valid! Try again: ");
            setValidBonus();
            return;
        }
        ((FullTimeEmp)target).setBonus(bonus);
    }

    @Override
    public  void setValidMinus() {
        Scanner input = new Scanner(System.in);
        int minus;
        try{
            minus = input.nextInt();
        }
        catch (InputMismatchException e){
            System.err.print("Minus is invalid! Try again: ");
            setValidMinus();
            return;
        }
        if (!regexTool.isValidMinus(""+minus)){
            System.err.print("Minus is invalid! Try again: ");
            setValidMinus();
            return;
        }
        ((FullTimeEmp)target).setMinus(minus);
    }

    @Override
    public void setValidWorkHour() {
        Scanner input = new Scanner(System.in);
        int workHour;
        try{
            workHour = input.nextInt();
        }
        catch (InputMismatchException e){
            System.err.print("Work-hour is invalid! Try again: ");
            setValidWorkHour();
            return;
        }
        if (!regexTool.isValidWorkHour(""+workHour)){
            System.err.print("Work-hour is invalid! Try again: ");
            setValidWorkHour();
            return;
        }
        ((PartTimeEmp)target).setWorkHour(workHour);
    }
}
