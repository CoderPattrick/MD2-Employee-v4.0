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
                toScreen.displayInvalidAndTryAgain();
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
            toScreen.displayInvalidAndTryAgain();
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
                toScreen.displayInvalidAndTryAgain();
                return inputKindOfAgeSearch();
        }
    }
    public String inputChoiceOfSetting(String empType){
        Scanner input = new Scanner(System.in);
        String choice = input.nextLine();
        switch (choice){
            case "1":
            case "2":
            case "3":
            case "4":
                return choice;
            default:
                switch (empType) {
                    case "1":
                        switch (choice) {
                            case "5":
                            case "6":
                            case "7":
                                return choice;
                            default:
                                toScreen.displayInvalidAndTryAgain();
                                return inputChoiceOfSetting(empType);
                        }
                    case "2":
                    case "3":
                        switch (choice) {
                            case "5":
                                return choice;
                            default:
                                toScreen.displayInvalidAndTryAgain();
                                return inputChoiceOfSetting(empType);
                        }
                    default:
                        return "";
                }
        }
    }
}
