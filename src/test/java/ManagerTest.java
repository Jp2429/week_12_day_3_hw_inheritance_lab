import management.Manager;
import org.junit.Before;
import org.junit.Test;
import staff.Employee;

import static org.junit.Assert.assertEquals;

public class ManagerTest {
    //instance variable of the abstract class(Employee):
    private Manager manager1;

    @Before
    public void before() {
        //setting manager1 to subclass Manager:
        //input data because of how we set up our constructors:
        manager1 = new Manager("Albus Dumbledore", 1, 1000, "Dept of Magic");
    }

    //Tests:

    //can get dept name:
    @Test
    public void canGetDeptName() {
        assertEquals("Dept of Magic", manager1.getDeptName());
    }
    //can raise salary:
    @Test
    public void canRaiseSalary() {
        //calling raiseSalary function and passing in 100, which should set 100 to the salary.
        manager1.raiseSalary(100);
        //getSalary should return the salary with the 100 added to it
        assertEquals(1100, manager1.getSalary(), 0.0);
    }
    //can we pay bonus:
    @Test
    public void canPayBonus() {
        //returning pay Bonus amount:
        assertEquals(10, manager1.payBonus(), 0.0);
    }
}
