package controller.infoDisplayer;

import model.employee.Employee;
import storage.IOManager;

import java.util.ArrayList;
import java.util.Scanner;

public class ToScreen {
    public static ArrayList<Employee> savedList = IOManager.savedList;
    public void displayAllList(){
        for (Employee e:savedList
             ) {
            System.out.println(e);
        }
    }
    //done!
    public void displaySpecifiedList(ArrayList<Employee> list){
        for (Employee e: list
        ) {
            System.out.println(e);
        }
    }
    //done!
    public void displayCompletion(){
        System.out.println("Complete!");
    }
    //done!
    public void displayEmp(Employee emp){
        System.out.println(emp);
    }
    //done!
    public void displayBackToMenu(){
        System.out.println("\nPress Enter to move back to menu.");
        Scanner input = new Scanner(System.in);
        String i=input.nextLine();
    }
    //done!
    public void displayKindaEmpToAdd(){
        System.out.println("1.Full-Time  2.Part-Time 3.Leader");
        System.out.print("Type of employee to add: ");
    }
    //done!
    public void displayKindOfSearch(){
        System.out.println("1.Search by Id  2.Search by Name  3.Search by age");
        System.out.print("Your choice: ");
    }
    public void displayKindOfAgeSearch(){
        System.out.println("1.Search by age  2.Search by range of age");
        System.out.print("Your choice: ");
    }
    public void displayEmpNotFound(){
        System.err.println("Employee not found!");
    }
    //done!
    public void displayInvalid(){
        System.err.println("Invalid! Please try again!");
    }
    //done!
    public void inputId(){
        System.out.print("Enter Id: ");
    }
    //done!
    public void inputName(){
        System.out.print("Enter Name: ");
    }
    //done!
    public void inputAge(){
        System.out.print("Enter Age: ");
    }
    //done!
    public void inputMail(){
        System.out.print("Enter Email: ");
    }
    //done!
    public void inputBase(){
        System.out.print("Enter Base-Salary: ");
    }
    //done!
    public void inputBonus(){
        System.out.print("Enter Bonus: ");
    }
    //done!
    public void inputMinus(){
        System.out.println("Enter Minus: ");
    }
    //done!
    public void inputWorkHour(){
        System.out.println("Enter Work-hour: ");
    }
    //done!
    public void displayConfirm(){
        System.out.println("1.OK  2.Cancel");
        System.out.print("Confirm action: ");
    }
    public void lazyLoad1sec(){
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.err.println("Thread interrupted!");
        }
    }

    public void displayAgeFrom() {
        System.out.print("From: ");
    }
    public void displayAgeTo() {
        System.out.print("To: ");
    }
}

