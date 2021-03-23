
import org.junit.Before;
import org.junit.Test;
import techStaff.Developer;

import static org.junit.Assert.assertEquals;

public class DeveloperTest {

    Developer developer;

    @Before
    public void before(){
        developer = new Developer("Brendan Kelly", "JE23249271D", 24000);
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(25000, developer.raiseSalary(1000.00), 0.00);
    }

    @Test
    public void cannotDecreaseSalary(){
        assertEquals(0.00, developer.raiseSalary(-100.00), 0.0);
    }

    @Test
    public void canGivePayBonus(){
        assertEquals(240, developer.payBonus(), 0.0);
    }

    @Test
    public void canChangeEmployeeName(){
        developer.setName("Philomena Kelly");
        assertEquals("Philomena Kelly", developer.getName());
    }

    @Test
    public void cannotChangeNameIfNull(){
        developer.setName(null);
        assertEquals("Brendan Kelly", developer.getName());
    }

}
