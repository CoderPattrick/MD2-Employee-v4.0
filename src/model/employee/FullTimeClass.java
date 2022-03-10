package model.employee;

public class FullTimeClass extends FullTimeEmp{
    public FullTimeClass(String id, String name, String age, String mail, double baseSalary, double bonus, double minus) {
        super(id, name, age, mail, baseSalary, bonus, minus);
    }
    public FullTimeClass() {
    }

    @Override
    public double getSalary() {
        double result = getBaseSalary() + getBonus() - getMinus();
        return result;
    }
    @Override
    public String toString() {
        return "FullTimeEmp{" +
                "id='" + getId()+ '\'' +
                ", name='" + getName() + '\'' +
                ", age='" + getAge() + '\'' +
                ", mail='" + getMail() + '\'' +
                ", baseSalary=" + getBaseSalary() +
                '}';
    }
}
