package view;
import controller.employeeManager.*;
import controller.getEmployeeInfo.*;
import controller.infoDisplayer.ToScreen;
import model.employee.*;
import storage.IOManager;

import java.util.ArrayList;

public interface IProxy {
    EmployeeManager empManager = new Manager();
    GetEmployeeDetail getter = new GetDetail();
    SetValidDetail empTypeSetter = new SetValid();
    ToScreen toScreen = new ToScreen();
    IOManager IOTool = new IOManager();
    ArrayList<Employee> savedList = IOManager.savedList;

     void waitASec();
     void addEmp();
     void removeEmp();
     void setEmp();
     void displayAllList();
}
