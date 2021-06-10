public class App {
    public static void main(String[] args) throws Exception {
        int myTankSize=50;
        int efficiency = 8; //20 km per liter
        int fuel=68;

        // maak nieuwe tank met nieuwe tankSize
        Tank myTank = new Tank(myTankSize);

        // maak nieuwe motor met nieuwe efficiency
        Motor myMotor = new Motor(efficiency);

        // maak nieuwe auto met nieuwe tank (met nieuwe tankSize) en nieuwe motor (met nieuwe efficiency) 
        Vehicle myCar = new Vehicle(myTank , myMotor);

        // geef hoeveelheid fuel aan die in de tank zit
        myCar.setFuelInTank(fuel);

        System.out.println("You can still drive " + myCar.calculateDistance() + " km with your current amount of fuel.");
    }
}
