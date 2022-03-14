package controller.infoDisplayer;

import model.employee.*;
import storage.IOManager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class DisplaySupporter {
    public static ArrayList<Employee> savedList = IOManager.savedList;
    public void sortEmpListByAge() {
        Comparator<Employee> sorter = new EmployeeSorterByAge();
        Collections.sort(savedList,sorter);
    }
}
class EmployeeSorterByAge implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        double age1 = o1.getAge();
        double age2 = o2.getAge();
        if(age1>age2)return 1;
        else if(age1<age2)return -1;
        return 0;
    }
}
