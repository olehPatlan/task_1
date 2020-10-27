import org.junit.Before;
import org.junit.Test;
import ua.patlan.task1.Employee;
import ua.patlan.task1.Manager;

import static org.junit.Assert.*;

public class TestTask1 {
    private Employee manager;

    @Before
    public void setUp() {
        manager = new Manager(1, "Tom", "surname", 2000, 16);
    }

    @Test
    public void testManagerCalculateSalary() {
        assertEquals(200, manager.calculateSalary(), 0);
        manager.setWorkedHours(200);
        assertEquals(2000, manager.calculateSalary(), 0);
    }
}
