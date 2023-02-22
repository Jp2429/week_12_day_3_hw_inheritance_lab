import management.Director;
import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DirectorTest {
    //instance variable of the abstract class(Employee):
    private Director director1;


    @Before
    public void before() {
        //setting manager1 to subclass Manager:
        //input data because of how we set up our constructors:
        director1 = new Director("JK Rowling", 4, 1500, "A Dept Name",10000);
    }

    //Tests:

    //can get budget:
    @Test
    public void canGetBudget() {
        assertEquals(10000, director1.getBudget(), 0.0);
    }

    //can raise salary:
    @Test
    public void canRaiseSalary() {
        //calling raiseSalary function and passing in 100, which should set 100 to the salary.
        director1.raiseSalary(100);
        //getSalary should return the salary with the 100 added to it
        assertEquals(1600, director1.getSalary(), 0.0);
    }
    //can we pay bonus:
    @Test
    public void canPayBonus() {
        //returning pay Bonus amount:
        assertEquals(15, director1.payBonus(), 0.0);
    }
}
