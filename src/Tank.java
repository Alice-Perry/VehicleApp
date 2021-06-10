public class Tank {
    public int tankSize;
    public int fuelInTank;

    // dit is de constructor. Deze verwacht een tankSize.
    public Tank(int tanksizey){
        tankSize = tanksizey;
    };

    // dit is een gewone methode/functie
    public void setFuelInTank(int fuel){
        if(fuel > tankSize){
            System.out.println("Too much fuel. " + tankSize + " is maximum.");
            fuel = tankSize;
        }
        fuelInTank = fuel;
    }
}
