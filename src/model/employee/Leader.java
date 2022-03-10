package model.employee;

public abstract class Leader extends Employee {
    private double baseSalary;
    private final double BONUS_LEADER = 50000;

    public double getBONUS_LEADER() {
        return BONUS_LEADER;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Leader(String id, String name, String age, String mail, double baseSalary) {
        super(id, name, age, mail);
        this.baseSalary = baseSalary;
    }

    public Leader() {
    }
}
