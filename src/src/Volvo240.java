import java.awt.*;

public class Volvo240 extends Cars {

    private final static double trimFactor = 1.25;


    public Volvo240() {
        setNrDoors(4);
        setColor(Color.black);
        setEnginePower(100);
        setModelName("Volvo240");
        stopEngine();
        setposY(0);
        setposX(0);
        direction = "North";
    }

    protected void startEngine() {

        SetcurrentSpeed(0.1);
    }

    public double speedFactor() {

        return geteningePower() * 0.01 * trimFactor;

    }
}
