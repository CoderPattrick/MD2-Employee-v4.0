package model.employee;

import java.io.Serializable;

public abstract class Employee implements Serializable {
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAge() {
        return age;
    }

    public void setAge(double age) {
        this.age = age;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    private String id;
    private String name;
    private double age;
    private String mail;

    public abstract double getSalary();

    public Employee() {
    }

    public Employee(String id, String name, double age, String mail) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.mail = mail;
    }
}
