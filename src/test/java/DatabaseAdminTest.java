import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;
import techStaff.Developer;

import javax.xml.crypto.Data;

import static org.junit.Assert.assertEquals;

public class DatabaseAdminTest {
    //instance variable of the abstract class(Employee):
    private DatabaseAdmin databaseAdmin1;

    @Before
    public void before() {
        //setting manager1 to subclass Manager:
        //input data because of how we set up our constructors:
        databaseAdmin1 = new DatabaseAdmin("Harry Potter", 3, 600);
    }

    //Tests:

    //can raise salary:
    @Test
    public void canRaiseSalary() {
        //calling raiseSalary function and passing in 100, which should set 100 to the salary.
        databaseAdmin1.raiseSalary(100);
        //getSalary should return the salary with the 100 added to it
        assertEquals(700, databaseAdmin1.getSalary(), 0.0);
    }
    //can we pay bonus:
    @Test
    public void canPayBonus() {
        //returning pay Bonus amount:
        assertEquals(6, databaseAdmin1.payBonus(), 0.0);
    }
}
