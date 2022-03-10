package model.employee;

public class LeaderClass extends Leader{
    public LeaderClass(String id, String name, String age, String mail, double baseSalary) {
        super(id, name, age, mail, baseSalary);
    }
    public LeaderClass() {
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

}
