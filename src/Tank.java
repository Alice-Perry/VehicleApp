public class Tank {
    private int tankSize;
    private int fuelInTank;

    // dit is de constructor. Deze verwacht een tankSize.
    public Tank(int tanksize) {
        this.tankSize = tanksize;
    };

    // dit is een gewone methode/functie
    public void setFuelInTank(int fuel){
        if (fuel > tankSize) {
            System.out.println("Too much fuel. " + tankSize + " is maximum.");
            fuel = tankSize;
        }
        fuelInTank = fuel;
    }

    public int getFuelInTank() {
        return fuelInTank;
    }

    public int getTankSize() {
        return tankSize;
    }
}
