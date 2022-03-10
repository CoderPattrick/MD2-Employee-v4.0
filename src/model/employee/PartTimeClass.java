package model.employee;

public class PartTimeClass extends PartTimeEmp{
    public PartTimeClass(String id, String name, String age, String mail, double workHour) {
        super(id, name, age, mail, workHour);
    }
    public PartTimeClass() {
    }
    @Override
    public double getSalary() {
        return getWorkHour()*getSALARY_PER_HOUR();
    }
    @Override
    public String toString() {
        return "PartTimeEmp{" +
                "id='" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                ", age='" + getAge() + '\'' +
                ", mail='" + getMail() + '\'' +
                ", SALARY_PER_HOUR=" + getSALARY_PER_HOUR() +
                ", workHour=" + getWorkHour() +
                '}';
    }

}
