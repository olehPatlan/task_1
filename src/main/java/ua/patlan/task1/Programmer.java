package ua.patlan.task1;

public class Programmer extends Employee {

    public Programmer(long id) {
        super(id);
    }

    public Programmer(long id, String name, String surname, double defaultSalary, double workedHours) {
        super(id, name, surname, defaultSalary, workedHours);
    }
}
