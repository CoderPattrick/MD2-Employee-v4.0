package view;

public class Client {
    public static Proxy proxy = new Proxy();
    public static void main(String[] args) {
        proxy.displayAllList();
        proxy.setEmp();
        proxy.searchEmployee();
    }
}
