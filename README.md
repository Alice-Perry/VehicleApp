# Gebaseerd op de Vehicle opdracht

Als je je te schrijven code zo veel mogelijk probeert te vergelijken met de tastbare wereld, dan maakt het het begrijpen van de logica in die code een stuk makkelijker.

Een `Auto` heeft een `Tank`.
Een `Auto` heeft een `Motor`.

De `Auto`, de `Tank` en de `Motor` zijn alle 3 een klasse.

Een `Tank` heeft een formaat.
Een `Tank` heeft een inhoud.

Een `Motor` heeft een efficiency.

Het formaat, de inhoud en de efficiency zijn values.

De eerste regels code zijn het aanmaken van 3 klasses en hun bijbehorende values.

    public class Vehicle {

    }

    public class Tank {
        private int tankSize;
        private int fuelInTank;
    }

    public class Motor {
        int efficiency;
    }

Vervolgens maak je de constructors voor de klasses `Tank` en `Motor`. Deze moeten straks in je `Auto` dus deze maak je eerst.

    public class Tank {
        public int tankSize;
        public int fuelInTank;

        // Dit is de constructor. Deze verwacht een tankSize.
        public Tank(int tanksize){
            this.tankSize = tanksize;
        };
    }

    public class Motor {
        int efficiency;

        public Motor(int efficiency){
            this.efficiency = efficiency;
        };
    }

De `Auto` klasse kan nu verder gemaakt worden. De `Tank` en de `Motor` kunnen nu in de `Auto` want je kan ze ook aanroepen.
Eerst geef je de variabelen mee. In dit geval zijn die variabelen een `Tank` en een `Motor`.
Maak dus een klasse variabele aan.

    public class Vehicle {
        private Tank tank;
        private Motor motor;
    }

Vervolgens een contructor voor de `Auto`.

    public class Vehicle {
        private Tank tank;
        private Motor motor;

        // Constructor
        public Vehicle(Tank tank, Motor motor) {
            this.tank = tank;
            this.motor = motor;
        }
    }

Nu is het basisrecept voor de Auto klaar.
Een `Auto` met een `Tank` waar een hoeveelheid brandstof in kan en met een `Motor` die een x hoeveelheid brandstof per km verbruikt.

Tijd om er een echte auto van te maken. Dit was tenslotte nog maar het recept.
Om er een Object van te maken, een echte auto met zijn eigen gegevens, maak je een `Main` klasse aan. Deze kan je `Main` noemen, maar `App` of `Program` is ook een goede standaard.
Hierin staat je static void main(String[] args).

Dit is het startpunt van je programma en je werkbank om in dit geval de `Auto` in elkaar te zetten.

Daar je van alles alleen maar een receptje hebt, en nog geen daadwerkelijk object ga je die eerst aanmaken. Dit doe je van zowel de `Auto` als de onderdelen in die `Auto` (de `Tank` en de `Motor`).
En omdat de `Auto` straks om die onderdelen vraagt, maar je eerst de `Tank` en de `Motor`.
Je kan ook alvast die nieuwe tankSize en nieuwe efficiency ingeven als je dat wilt.

    public class App {
        public static void main(String[] args) throws Exception {
            int myTankSize;
            int efficiency ; // Km per liter

            // Maak nieuwe tank met nieuwe tankSize
            Tank myTank = new Tank(myTankSize);

            // Maak nieuwe motor met nieuwe efficiency
            Motor myMotor = new Motor(efficiency);
        }
    }

Nu kan je een echte `Auto` maken, met een echte `Tank`, en een echte `Motor` die allemaal hun eigen naam hebben gekregen.

    public class App {
        public static void main(String[] args) throws Exception {
            int myTankSize;
            int efficiency ; //km per liter

            // Maak nieuwe tank met nieuwe tankSize
            Tank myTank = new Tank(myTankSize);

            // Maak nieuwe motor met nieuwe efficiency
            Motor myMotor = new Motor(efficiency);

            // Maak nieuwe auto met nieuwe tank (met nieuwe tankSize) en nieuwe
            // motor (met nieuwe efficiency) 
            Vehicle myCar = new Vehicle(myTank , myMotor);
        }
    }

En de `Auto` is geboren!

Nu heeft de `Tank` ook nog een x hoeveelheid brandstof in zich, en die willen we graag aan kunnen passen. We gaan ‘m voltanken.
Dit doe je met een gewone methode waar je de hoeveelheid brandstof in de `Tank` ‘zet’.
Hier heb je de hoeveelheid brandstof die je er in wilt gooien voor nodig.

In dit geval geef ik er ook aan mee dat het formaat van de `Tank` eindig is, als je er meer liters in wil doen dat er in past, dan geeft hij dat aan d.m.v. het if statement.

    public class Tank {
        public int tankSize;
        public int fuelInTank;
    
        // Dit is de constructor. Deze verwacht een tankSize.
        public Tank(int tanksize){
            this.tankSize = tanksize;
        };
    
        // dit is een gewone methode/functie
        public void setFuelInTank(int fuel) {
            if (fuel > tankSize) {
                System.out.println("Too much fuel. " + tankSize + " is maximum.");
                fuel = tankSize;
            }
            fuelInTank = fuel;
        }
    }

Nu heb ik alle info (voor nu) die de `Tank` nodig heeft, meegegeven aan de `Tank`.
Maar de `Tank` zit in de `Auto`. Hij bestaat niet op zichzelf.
Dus moeten we in de `Auto` ook een functie maken voor het brandstof toevoegen.
Als je fysiek met je auto gaat tanken gooi je brandstof in je auto en niet in je tank.
Je haalt niet je tank er uit, vult deze met brandstof en zet 'm daarna weer in de auto.
Je laat je auto heel, stopt de slang in je auto en je auto zorgt er zelf voor dat deze brandstof naar de tank gaat. Het is niet belangrijk voor jou waar die tank nou precies zit om hem vol te kunnen gooien met brandstof. Je tankt dus in je auto en niet in je tank.

    public class Vehicle {
        private Tank tank;
        private Motor motor;

        // Constructor
        public Vehicle(Tank tank, Motor motor) {
            this.tank = tank;
            this.motor = motor;
        }

        // Gewone functie
        public void setFuelInTank(int fuel) {
            tank.setFuelInTank(fuel); 
        }
    }

De setFuelInTank() wil een hoeveelheid brandstof (int fuel) en deze geeft dit door aan de setFuelInTank() functie van de nieuwe aangemaakte `Tank` die diezelfde hoeveelheid brandstof wil weten.
Met deze 2 methods kan je nu een hoeveelheid brandstof in je nieuwe __myCar__ `Auto` stoppen. Dit doe je in `Main`, op je werkbank waar je alle onderdelen in elkaar schroeft.

    public class App {
        public static void main(String[] args) throws Exception {
            int myTankSize;
            int efficiency ; // km per liter
            int fuel=;
    
            // Maak nieuwe tank met nieuwe tankSize
            Tank myTank = new Tank(myTankSize);

            // Maak nieuwe motor met nieuwe efficiency
            Motor myMotor = new Motor(efficiency);
    
            // Maak nieuwe auto met nieuwe tank (met nieuwe tankSize) en nieuwe
            // motor (met nieuwe efficiency) 
            Vehicle myCar = new Vehicle(myTank, myMotor);
    
            // Geef hoeveelheid fuel aan die in de tank zit
            myCar.setFuelInTank(fuel);
        }
    }

Om uit te rekenen hoe ver ik kan rijden met deze hoeveelheid brandstof in mijn `Tank`, en de efficiency van mijn `Motor`, maak je een functie zoals calculateDistance().
Dit doe je in de `Auto`. Het is de gehele auto die een bepaalde afstand af legt en niet alleen de `Motor` of de `Tank`.

    public class Vehicle {
        private Tank tank;
        private Motor motor;
    
        // Constructor
        public Vehicle(Tank tank, Motor motor) {
            this.tank = tank;
            this.motor = motor;
        }
    
        // Gewone functie
        public void setFuelInTank(int fuel) {
            tank.setFuelInTank(fuel); 
        }
    
        public int calculateDistance(){
            int distance = tank.fuelInTank * motor.efficiency;
            return distance;
        }
    }

Met een enkele printout in je programma (in je __main__) kan je nu de afstand die je af kan leggen met deze hoeveelheid brandstof op je scherm laten zien.
Je kan uiteraard ook een printCalculatedDistance() in je `Auto` maken om te printen en deze aanroepen in je __main__.

    public class App {
        public static void main(String[] args) throws Exception {
            int myTankSize;
            int efficiency ; // Km per liter
            int fuel;
    
            Tank myTank = new Tank(myTankSize);
    
            Motor myMotor = new Motor(efficiency);
    
            Vehicle myCar = new Vehicle(myTank , myMotor);
    
            myCar.setFuelInTank(fuel);
    
            System.out.println(
                "You can still drive " + myCar.calculateDistance() + 
                " km with your current amount of fuel.");
        }
    }

Klaar!
