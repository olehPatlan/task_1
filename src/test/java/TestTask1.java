import org.junit.Before;
import org.junit.Test;
import ua.patlan.task1.Employee;
import ua.patlan.task1.Manager;
import ua.patlan.task1.Programmer;

import static org.junit.Assert.*;

public class TestTask1 {
    private Employee manager;
    private Employee programmer;

    @Before
    public void setUp() {
        manager = new Manager(1, "Tom", "surname", 2000, 16);
        programmer = new Programmer(1, "Bob", "surname", 2000, 16);
    }

    @Test
    public void testPercentageWorkedTime() {
        assertEquals(10, manager.percentageWorkedTime(), 0.0);
    }

    @Test
    public void testManagerCalculateSalary() {
        assertEquals(200, manager.calculateSalary(), 0);
        manager.setWorkedHours(200);
        assertEquals(2000, manager.calculateSalary(), 0);
    }

    @Test
    public void testProgrammerCalculateSalary() {
        assertEquals(200, programmer.calculateSalary(), 0);
        programmer.setWorkedHours(320);
        assertEquals(4000, programmer.calculateSalary(), 0);
    }
}
