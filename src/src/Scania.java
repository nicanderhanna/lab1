import java.awt.*;

public class Scania extends Cars {

    public double trailerAngle;
    public double  trailerUp;


    public Scania(){
        setNrDoors(2);
        setColor(Color.blue);
        setEnginePower(400);
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

    protected void startEngine(){
        SetcurrentSpeed(0.1);
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

    @Override
    public void move(){
        boolean b = this.trailerAngle != 0;
        if (b) {
            System.out.println("Truck can't move while trailer is up");
        }
        else {
            switch (direction) {
            case "North":
                posY = posY + currentSpeed;
                break;
            case "South":
                posY = posY - currentSpeed;
                break;
            case "West":
                posX = posX - currentSpeed;
                break;
            case "East":
                posX = posX + currentSpeed;
                break;
        }}
    }

}
