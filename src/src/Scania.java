import java.awt.*;

public class Scania extends Cars {

    public double trailerAngle;
    public Scania(){
        setNrDoors(2);
        setColor(Color.blue);
        setEnginePower(125);
        setModelName("Scania");
        stopEngine();
        setposX(0);
        setposY(0);
        direction = "North";
        trailerAngle = 0;
    }

    public double speedFactor() {
        return 0;
    }
    public void trailerUp(double amount){
        boolean b = this.getCurrentSpeed() != 0;
        if (b){
            System.out.println("Can't move trailer when Truck is in moving");
        }
        trailerAngle = trailerAngle + amount;
        if (trailerAngle > 70) {
            trailerAngle = 70;
        }

    }

    public void trailerDown(double amount){
        trailerAngle = trailerAngle - amount;
        if (trailerAngle < 0){
            trailerAngle = 0;
        }
    }


}
