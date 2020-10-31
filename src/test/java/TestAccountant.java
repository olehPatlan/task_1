import org.junit.Test;
import ua.patlan.task1.Accountant;
import ua.patlan.task1.Employee;
import ua.patlan.task1.Manager;
import ua.patlan.task1.Programmer;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class TestAccountant {
    @Test
    public void testCalculateEmployeesSalary() {
        List<Employee> employees = new ArrayList<>();
        Manager manager = new Manager(1, "Tom", "surname", 2000, 16);
        Programmer programmer = new Programmer(2, "Bob", "surname", 2000, 16);
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
