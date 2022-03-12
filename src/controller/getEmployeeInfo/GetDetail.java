package controller.getEmployeeInfo;

import model.employee.Employee;
import model.employee.FullTimeEmp;
import model.employee.Leader;
import model.employee.PartTimeEmp;
import storage.IOManager;
import java.util.ArrayList;


public class GetDetail implements GetEmployeeDetail{
    ArrayList<Employee> savedList= IOManager.savedList;
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
        boolean found = false;
        for (Employee e:savedList
             ) {
            double age = e.getAge();
            if(age>=from && age<=to){
                tempList.add(e);
                found = true;
            }
        }
        if(found){
            return tempList;
        }
        return null;
    }

    @Override
    public ArrayList<Employee> getEmployeeByAge(double age) {
        ArrayList<Employee> tempList = new ArrayList<>();
        boolean found = false;
        for (Employee e:savedList
        ) {
            double ageEmp = e.getAge();
            if(age==ageEmp){
                tempList.add(e);
                found = true;
            }
        }
       if(found){
           return tempList;
       }
       return null;
    }

    @Override
    public Employee getEmployeeById(String id){
        int index = indexOfEmployeeById(id);
        try{
            Employee emp = savedList.get(index);
            return emp;
        }
        catch (IndexOutOfBoundsException e){
            //Just catch it and continue
        }
        return null;
    }
    @Override
    public Employee getEmployeeByName(String name) {
        int index = indexOfEmployeeByName(name);
        try{
            Employee emp = savedList.get(index);
            return emp;
        }
        catch (IndexOutOfBoundsException e){
            //Just catch it and continue
        }
        return null;
    }

    @Override
    public String getEmployeeType(Employee emp) {
        if(emp instanceof FullTimeEmp){return "1";}
        else if(emp instanceof PartTimeEmp){return "2";}
        else if(emp instanceof Leader){return "3";}
        return "";
    }
}
