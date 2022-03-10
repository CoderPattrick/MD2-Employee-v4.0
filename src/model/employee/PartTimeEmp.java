package model.employee;

public abstract class PartTimeEmp extends Employee{
    private final double SALARY_PER_HOUR = 50;
    private double workHour;

    public PartTimeEmp() {
    }
    public PartTimeEmp(String id, String name, String age, String mail, double workHour) {
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
}
