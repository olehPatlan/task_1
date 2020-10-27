package ua.patlan.task1;

public abstract class Employee {
    //unique identifier
    private final long id;

    private String name;

    private String surname;

    private double defaultSalary;

    private double workedHours;

    private static final int STANDARD_WORKED_HOURS_PER_MONTH = 160;

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

    public abstract double percentageWorkedTime();

    public abstract double calculateSalary();

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
}
