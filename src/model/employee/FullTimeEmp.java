package model.employee;

public abstract class FullTimeEmp extends Employee{
    public static final int DEFAULT_BONUS = 1000;
    public static final int DEFAULT_MINUS = 0;
    private double baseSalary;
    private double bonus;
    private double minus;

    public double getBaseSalary() {
        return baseSalary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getMinus() {
        return minus;
    }

    public void setMinus(double minus) {
        this.minus = minus;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public FullTimeEmp(String id, String name, String age, String mail, double baseSalary, double bonus, double minus) {
        super(id, name, age, mail);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
        this.minus = minus;
    }

    public FullTimeEmp() {
    }
}
