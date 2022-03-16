import org.junit.Test;
import staff.Employee;
import staff.management.Manager;

import static org.junit.Assert.assertEquals;


public class EmployeeTest {

    Employee employee;

    @Test
    public void canRaiseSalary(){
        employee = new Manager("Bob", 12345, 415.80, "Finance");
        employee.raiseSalary(4.20);
        assertEquals(420.0, this.employee.getSalary(), 0);
    }

    @Test
    public void canPayBonus(){
        employee = new Manager("Bob", 12345, 420.0, "Finance");
        assertEquals(4.20, employee.payBonus(), 0);
    }

    @Test
    public void cantRaiseNegative(){
        employee = new Manager("Bob", 12345, 420.0, "Finance");
        employee.raiseSalary(-4.20);
        assertEquals(420.0, employee.getSalary(), 0);
    }
}
