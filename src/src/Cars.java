import java.awt.*;

public class Cars implements Movable {



    public int nrDoors; // Number of doors on the car
    public double enginePower; // Engine power of the car
    public double currentSpeed; // The current speed of the car
    public Color color; // Color of the car
    public String modelName; // The car model name
    public double posX;   // Positiion X of the car
    public double posY;   // Position Y of the car
                           ; //
    public String direction; // Direction of the car



    public void setColor(Color clr){
        color = clr;
    }

    public int getNrDoors(){
        return nrDoors;
    }
    public double getEnginePower(){
        return enginePower;
    }

    public double getCurrentSpeed(){
        return currentSpeed;
    }

    public Color getColor(){
        return color;
    }

    public void stopEngine(){
        currentSpeed = 0;
    }

    @Override
    public void move() {
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
        }
    }

    @Override
    public void turnLeft() {
         switch(direction){
             case "North":
                 direction = "West";
                 break;
             case "West":
                 direction = "South";
                 break;
             case "South":
                 direction = "East";
                 break;
             case "East":
                 direction =  "North";
                 break;

         }
    }

    @Override
    public void turnRight() {
        switch(direction) {
            case "North":
                direction = "East";
                break;
            case "East":
                direction = "South";
                break;
            case "South":
                direction = "West";
                break;
            case "West":
                direction = "North";
                break;
        }
    }
}

