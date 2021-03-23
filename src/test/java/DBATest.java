import org.junit.Before;
import org.junit.Test;
import techStaff.DatabaseAdmin;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DBATest {

    DatabaseAdmin databaseAdmin;

    @Before
    public void before(){
        databaseAdmin = new DatabaseAdmin("Paul Kelly", "JE23249271D", 35000);
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(36000, databaseAdmin.raiseSalary(1000.00), 0.00);
    }

    @Test
    public void canGivePayBonus(){
        assertEquals(350, databaseAdmin.payBonus(), 0.0);
    }
}
