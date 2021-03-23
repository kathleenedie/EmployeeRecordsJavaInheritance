import management.Director;
import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class DirectorTest {

    Director director;

    @Before
    public void before(){
        director = new Director("Tom Kelly Snr", "FE123456H", 122000, "Gleneagles", 262545.77);
    }

    @Test
    public void hasDeptName(){
        assertEquals("Gleneagles", director.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(123000, director.raiseSalary(1000.00), 0.00);
    }

    @Test
    public void canGivePayBonus2Percent(){
        assertEquals(2440, director.payBonus(), 0.0);
    }

    @Test
    public void canGetBudget(){
        assertEquals(262545.77, director.getBudget(), 0.0);
    }
}
