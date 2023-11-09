import java.awt.*;

public class Volvo240 extends Cars {

    private final static double trimFactor = 1.25;


    public Volvo240() {
        nrDoors = 4;
        color = Color.black;
        enginePower = 100;
        modelName = "Volvo240";
        stopEngine();
        posY = 0;
        posX = 0;
        direction = "North";
    }

    protected void startEngine() {

        currentSpeed = 0.1;
    }

    public double speedFactor() {

        return enginePower * 0.01 * trimFactor;

    }
}
