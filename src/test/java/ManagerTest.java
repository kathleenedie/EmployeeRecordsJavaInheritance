import management.Manager;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ManagerTest {

    Manager manager;

    @Before
    public void before(){
        manager = new Manager("Young Tom Kelly", "GE123456H", 42000, "Smokehouse");
    }

    @Test
    public void hasDeptName(){
        assertEquals("Smokehouse", manager.getDeptName());
    }

    @Test
    public void canRaiseSalary(){
        assertEquals(43000, manager.raiseSalary(1000.00), 0.00);
    }

    @Test
    public void canGivePayBonus(){
        assertEquals(420, manager.payBonus(), 0.0);
    }
}
