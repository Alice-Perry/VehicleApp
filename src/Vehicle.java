
public class Vehicle {
   
    private Tank tank;
    private Motor motor;

    // constructor
    public Vehicle(Tank tanky, Motor motory){
        tank = tanky;
        motor = motory;
    }

    // gewone functie
    public void setFuelInTank(int fuel){
        tank.setFuelInTank(fuel); 
    }

    public int calculateDistance(){
        int distance = tank.fuelInTank * motor.efficiency;
        return distance;
    }
}
