import management.Manager;
import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {
    //instance variable of the abstract class(Employee):
    private Developer developer1;

    @Before
    public void before() {
        //setting manager1 to subclass Manager:
        //input data because of how we set up our constructors:
        developer1 = new Developer("Severus Snape", 2, 700);
    }

    //Tests:

    //can raise salary:
    @Test
    public void canRaiseSalary() {
        //calling raiseSalary function and passing in 100, which should set 100 to the salary.
        developer1.raiseSalary(100);
        //getSalary should return the salary with the 100 added to it
        assertEquals(800, developer1.getSalary(), 0.0);
    }
    //can we pay bonus:
    @Test
    public void canPayBonus() {
        //returning pay Bonus amount:
        assertEquals(7, developer1.payBonus(), 0.0);
    }
}
