import java.awt.*;

public class Saab95 extends Cars{

    protected boolean turboOn;

    
    public Saab95(){
        SetnrDoors(2);
        setColor(Color.red);
        setenginePower(125);
	    turboOn = false;
        setModelName("Saab95");
        stopEngine();
        setposX(0);
        setposY(0);
        direction = "North";
    }

    protected void startEngine(){SetcurrentSpeed(0.1);
    }

    protected void setTurboOn(){
        turboOn = true;
    }

    protected void setTurboOff(){
	    turboOn = false;
    }
    
    public double speedFactor(){
        double turbo = 1;
        if(turboOn) turbo = 1.3;
        return geteningePower() * 0.01 * turbo;
    }

}
