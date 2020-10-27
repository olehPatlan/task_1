package ua.patlan.task1;

public class Manager extends Employee {

    public Manager(long id) {
        super(id);
    }

    public Manager(long id, String name, String surname, double defaultSalary, double workedHours) {
        super(id, name, surname, defaultSalary, workedHours);
    }

    public double percentageWorkedTime() {
        int hundredPercent = 100;
        return getWorkedHours() / STANDARD_WORKED_HOURS_PER_MONTH * hundredPercent;
    }

    public double calculateSalary() {
        int hundredPercent = 100;
        double pwt = percentageWorkedTime();
        if (pwt >= hundredPercent)
            return getDefaultSalary();
        return getDefaultSalary() * pwt / hundredPercent;
    }
}
