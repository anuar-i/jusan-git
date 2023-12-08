import java.util.AbstractList;


public class Employee {
    public String name;
    public String surname;
    public double salary;
    public String position;


    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", position='" + position + '\'' +
                '}';
    }


    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
        this.salary = 30000.0;
        this.position = "engineer";
    }

    public Employee(String name, String surname, double salary, String position) {
        this.name = name;
        this.surname = surname;
        this.salary = salary;
        this.position = position;
    }

    public Employee() {
    }
}
