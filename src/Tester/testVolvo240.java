import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class testVolvo240 {

    private Volvo240 volvo240;


    @Before
    public void init() {
        volvo240 = new Volvo240();
    }

    @Test
    public void testGas() {
        volvo240.stopEngine();
        assertTrue(volvo240.getCurrentSpeed() == 0);
        volvo240.startEngine();
        assertTrue(volvo240.getCurrentSpeed() == 0.1);
        volvo240.gas(0.5);
        assertTrue(volvo240.getCurrentSpeed() == 0.725);
        volvo240.gas(5);
        assertTrue(volvo240.getCurrentSpeed() == 0.725);
    }
}
