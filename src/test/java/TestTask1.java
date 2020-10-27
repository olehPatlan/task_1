import org.junit.Before;
import org.junit.Test;
import ua.patlan.task1.Accountant;
import ua.patlan.task1.Employee;
import ua.patlan.task1.Manager;
import ua.patlan.task1.Programmer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class TestTask1 {
    private Employee manager;
    private Employee programmer;

    @Before
    public void setUp() {
        manager = new Manager(1, "Tom", "surname", 2000, 16);
        programmer = new Programmer(2, "Bob", "surname", 2000, 16);
    }

    @Test
    public void testPercentageWorkedTime() {
        assertEquals(10, manager.percentageWorkedTime(), 0.0);
    }

    @Test
    public void testCalculateSalary() {
        assertEquals(200, manager.calculateSalary(), 0);
        manager.setWorkedHours(200);
        assertEquals(2000, manager.calculateSalary(), 0);
        programmer.setWorkedHours(320);
        assertEquals(4000, programmer.calculateSalary(), 0);
    }

    @Test
    public void testEquals() {
        assertEquals(manager, new Manager(1));
        assertNotEquals(manager, new Programmer(1));
        assertNotEquals(programmer, new Programmer(3));
    }

    @Test
    public void testCalculateEmployeesSalary() {
        List<Employee> employees = new ArrayList<>();
        employees.add(programmer);
        employees.add(manager);

        Accountant accountant = new Accountant();
        Map<Employee, Double> actual = accountant.calculateEmployeesSalary(employees);

        Map<Employee, Double> expected = new HashMap<>();
        expected.put(programmer, 200.);
        expected.put(manager, 200.);
        assertEquals(actual, expected);
    }

}
