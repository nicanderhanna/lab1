import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class testSaab95 {

    private Saab95 saab95;

    @Before
    public void init() {
        saab95 = new Saab95();
    }


/*    @Test
    public void testGas() {
            saab95.stopEngine();
            assertTrue(saab95.getCurrentSpeed() == 0);
            saab95.startEngine();
            assertTrue(saab95.getCurrentSpeed() == 0.1);
            saab95.gas(0.5);
            assertTrue(saab95.getCurrentSpeed() == 0.725);
            saab95.gas(5);
            assertTrue(saab95.getCurrentSpeed() == 0.725);
        }*/

    @Test
    public void testTurbo(){
        saab95.setTurboOn();
        assertTrue(saab95.turboOn == true);
        saab95.setTurboOff();
        assertTrue(saab95.turboOn == false);
    }
}
