package view;

public class Client {
    public static Cmd employeeManager = new EmployeeManager();
    public static void main(String[] args) {
        employeeManager.exe();
    }
}
