package model.employee;

public class PartTimeEmp extends Employee{
    private final double SALARY_PER_HOUR = 50;
    private double workHour;

    public PartTimeEmp() {
    }
    public PartTimeEmp(String id, String name, double age, String mail, double workHour) {
        super(id, name, age, mail);
        this.workHour = workHour;
    }
    public double getSALARY_PER_HOUR() {
        return SALARY_PER_HOUR;
    }
    public double getWorkHour() {
        return workHour;
    }
    public void setWorkHour(double workHour) {
        this.workHour = workHour;
    }
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
