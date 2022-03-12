package controller.userInput;

import controller.infoDisplayer.ToScreen;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    public static ToScreen toScreen = new ToScreen();
    public boolean confirmAction(){
        Scanner input = new Scanner(System.in);
        String choice = input.nextLine();
        switch (choice){
            case "1":
                return true;
            case "2":
            default:
                return false;
        }
    }
    public String inputKindOfSearch(){
        Scanner input = new Scanner(System.in);
        String choice = input.nextLine();
        switch (choice){
            case "1":
            case "2":
            case "3":
                return choice;
            default:
                toScreen.displayInvalid();
                return inputKindOfSearch();
        }
    }
    public String inputId(){
        Scanner input = new Scanner(System.in);
        String id = input.nextLine();
        return id;
    }
    public String inputName(){
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
        return name;
    }
    public int inputAge(){
        Scanner input = new Scanner(System.in);
        int age;
        try{
            age=input.nextInt();
            return age;
        }
        catch (InputMismatchException e){
            toScreen.displayInvalid();
            return inputAge();
        }
    }
    public String inputKindOfAgeSearch(){
        Scanner input = new Scanner(System.in);
        String choice = input.nextLine();
        switch (choice){
            case "1":
            case "2":
                return choice;
            default:
                toScreen.displayInvalid();
                return inputKindOfAgeSearch();
        }
    }
}
