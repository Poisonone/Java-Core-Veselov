package homework19;

import java.io.Serializable;

public class Employee implements Serializable {

    private int salary;
    private int id;
    private String name;
    transient String surname;

    public Employee(int salary, int id, String name, String surname) {
        this.salary = salary;
        this.id = id;
        this.name = name;
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "salary=" + salary +
                ", id=" + id +
                ", name='" + name + '\'' +
                '}';
    }
}
