package view;

import controller.infoDisplayer.ToScreen;

public class DevController {
    public static void main(String[] args) {
        ToScreen toScreen = new ToScreen();
        toScreen.displaySortedListByAge();
        System.out.println();
        toScreen.displayEmpListByType();
    }
}
