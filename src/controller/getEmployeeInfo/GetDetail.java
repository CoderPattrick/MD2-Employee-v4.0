package controller.getEmployeeInfo;

import model.employee.Employee;

import java.util.ArrayList;

public class GetDetail implements GetEmployeeDetail{
    //All method 100% produce NullPointerException!!! must check size() before execute!
    @Override
    public int indexOfEmployeeById(String id) {
        for (int i = 0; i < savedList.size(); i++) {
            Employee e = savedList.get(i);
            if(e.getId().equals(id)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public int indexOfEmployeeByName(String name) {
        for (int i = 0; i < savedList.size(); i++) {
            Employee e = savedList.get(i);
            if(e.getName().equals(name)){
                return i;
            }
        }
        return -1;
    }

    @Override
    public ArrayList<Employee> getEmployeeByAge(double from, double to) {
        ArrayList<Employee> tempList = new ArrayList<>();
        for (Employee e:savedList
             ) {
            double age = e.getAge();
            if(age>=from && age<=to){
                tempList.add(e);
            }
        }
        return tempList;
    }

    @Override
    public ArrayList<Employee> getEmployeeByAge(double age) {
        ArrayList<Employee> tempList = new ArrayList<>();
        for (Employee e:savedList
        ) {
            double ageEmp = e.getAge();
            if(age==ageEmp){
                tempList.add(e);
            }
        }
        return tempList;
    }
}
