package ua.patlan.task1;

import java.util.Objects;

public abstract class Employee {
    //unique identifier
    private final long id;

    private String name;

    private String surname;

    private double defaultSalary;

    private double workedHours;

    protected static final int STANDARD_WORKED_HOURS_PER_MONTH = 160;

    public Employee(long id) {
        this.id = id;
    }

    public Employee(long id, String name, String surname, double defaultSalary, double workedHours) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.defaultSalary = defaultSalary;
        this.workedHours = workedHours;
    }

    public double percentageWorkedTime() {
        int hundredPercent = 100;
        return getWorkedHours() / STANDARD_WORKED_HOURS_PER_MONTH * hundredPercent;
    }

    public double calculateSalary() {
        int hundredPercent = 100;
        return getDefaultSalary() * percentageWorkedTime() / hundredPercent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public double getDefaultSalary() {
        return defaultSalary;
    }

    public void setDefaultSalary(double defaultSalary) {
        this.defaultSalary = defaultSalary;
    }

    public double getWorkedHours() {
        return workedHours;
    }

    public void setWorkedHours(double workedHours) {
        this.workedHours = workedHours;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        //id is unique, so other fields can be skipped
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
