package controller.getEmployeeInfo;

import model.employee.Employee;

import java.util.ArrayList;
import java.util.Scanner;

public class GetDetail implements GetEmployeeDetail{
    @Override
    public int indexOfEmployeeById(String id) {
        for (int i = 0; i < savedList.size(); i++) {
            try{
                Employee e = savedList.get(i);
                if(e.getId().equals(id)){
                    return i;
                }
            }
            catch (NullPointerException e){
                //Just catch it and continue
            }
        }
        return -1;
    }

    @Override
    public int indexOfEmployeeByName(String name) {
        for (int i = 0; i < savedList.size(); i++) {
            try{
                Employee e = savedList.get(i);
                if(e.getName().equals(name)){
                    return i;
                }
            }
            catch (NullPointerException e){
                //Just catch it and continue
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

    @Override
    public Employee getEmployeeById(String id){
        int index = indexOfEmployeeById(id);
        try{
            Employee emp = savedList.get(index);
            return emp;
        }
        catch (NullPointerException e){
            //Just catch it and continue
        }
        return null;
    }

    @Override
    public String getIdByInput() {
        Scanner input = new Scanner(System.in);
        String id = input.nextLine();
        return id;
    }
}
