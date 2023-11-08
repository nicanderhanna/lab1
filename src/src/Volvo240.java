import java.awt.*;

public class Volvo240 extends Cars{

    public final static double trimFactor = 1.25;

    
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

    public void startEngine(){

        currentSpeed = 0.1;
    }
    
    public double speedFactor(){

        return enginePower * 0.01 * trimFactor;

    }

/*    public void incrementSpeed(double amount){


            currentSpeed = Math.min(getCurrentSpeed() + speedFactor() * amount,enginePower);
            if (currentSpeed > enginePower) {

                currentSpeed = enginePower;

            }
    }

    public void decrementSpeed(double amount){

        currentSpeed = Math.max(getCurrentSpeed() - speedFactor() * amount,0);
        if (currentSpeed < 0) {

            currentSpeed = 0;

        }
    }*/

    // TODO göra tester för uppgift 4 men det ska nog funka.

    // TODO fix this method according to lab pm
/*    public void gas(double amount){

        if (amount > 1 || amount < 0) {
            System.out.println("Please choose a value between 0 and 1");
        }
        else {
            incrementSpeed(amount);
        }
    }*/

    // TODO fix this method according to lab pm
/*    public void brake(double amount){

        if (amount > 1 || amount < 0) {
            System.out.println("Please choose a value between 0 and 1");
        }
        else {
            decrementSpeed(amount);
        }
    }*/

}
