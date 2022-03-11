package controller.userInput;

import java.util.Scanner;

public class Input {
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
}
