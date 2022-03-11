package model.employee;

public class Leader extends Employee {
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

    public Leader(String id, String name, double age, String mail, double baseSalary) {
        super(id, name, age, mail);
        this.baseSalary = baseSalary;
    }
    @Override
    public double getSalary() {
        return getBaseSalary()+getBONUS_LEADER();
    }
    @Override
    public String toString() {
        return "Leader{" +
                "id='" + getId() + '\'' +
                ", name='" + getName() + '\'' +
                ", age='" + getAge() + '\'' +
                ", mail='" + getMail() + '\'' +
                ", baseSalary=" + getBaseSalary() +
                ", bonus4lead=" + getBONUS_LEADER() +
                '}';
    }
    public Leader() {
    }
}
