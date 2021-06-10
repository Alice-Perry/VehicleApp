public class Vehicle {
    private Tank tank;
    private Motor motor;

    // constructor
    public Vehicle(Tank tank, Motor motor){
        this.tank = tank;
        this.motor = motor;
    }

    // gewone functie
    public void setFuelInTank(int fuel){
        tank.setFuelInTank(fuel); 
    }

    public int calculateDistance(){
        int distance = tank.getFuelInTank() * motor.getEfficiency();
        return distance;
    }
}
