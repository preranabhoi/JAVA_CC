/*develop a java based ride management system that simulates the basic functionalities of a ride booking application such as uber/ola
our code must include:
1.parent class
2.hierarchial inheritance
3.create 3 child class-uberGO,uberXL,uberPremium
note-all 3 classes must inherit from the ride class
4.override the calculate fair method in each child class
5.method overloading
6.runtime polymorphism
7.multithreading
*/

/*Note---------
1.first we will declare a parent class ride then we will come to see method overloading,runtime polymorphism
2.derive 3 different child classes
3.here we are calculating fare of a ride in a 3 different ways
4.calculate fare is 1 method but we are implementing this in 3 different version
5.three different version means 3 different parameters which is called as method overloading*/


class Ride {
    protected String rideId;
    protected String customerName;
    protected double distance;
    

    Ride(String rideId, String customerName, double distance) {
    this.rideId = rideId;
    this.customerName = customerName;
    this.distance = distance;
    }   
    
    public double calculateFare(double distance) {    
    return distance * 10;
    }    

    public double calculateFare(double distance, double surgeMultiplier) {    
    return distance * 10 * surgeMultiplier;
    }    
    
    public double calculateFare(
    double distance,
    double surgeMultiplier,
    double discount) {    
    double fare = distance * 10 * surgeMultiplier;    
    return fare - discount;
    }
    
    public void displayRideDetails() {    
    System.out.println("Ride ID : " + rideId);
    System.out.println("Customer : " + customerName);
    System.out.println("Distance : " + distance + " km");
    }
    }
    
    class UberGo extends Ride {
    UberGo(String rideId, String customerName, double distance) {  
    super(rideId, customerName, distance);
    }
    
    @Override
    public double calculateFare(double distance) {
    return distance * 12;
    }
    
    
    public void displayType() {
    System.out.println("Ride Type : UberGo");
    }
    }    
    
    class UberXL extends Ride {
    UberXL(String rideId, String customerName, double distance) {
    super(rideId, customerName, distance);
    }
    
    
    @Override
    public double calculateFare(double distance) {
    return distance * 18;
    }
    
    
    public void displayType() {
    System.out.println("Ride Type : UberXL");
    }
    }    
    
    class UberPremium extends Ride {
    UberPremium(
    String rideId,
    String customerName,
    double distance) {
    super(rideId, customerName, distance);
    }
    
    
    @Override
    public double calculateFare(double distance) {    
    return distance * 25;
    }
    
    
    public void displayType() {
    System.out.println("Ride Type : Uber Premium");
    }
    }

    
    public class UberRideDemo {  
    public static void main(String[] args) {
    
    
    
    UberGo go =
    new UberGo("R101", "Ak", 10);
    
    UberXL xl =
    new UberXL("R102", "Rahul", 10);
    
    UberPremium premium =
    new UberPremium("R103", "Priya", 10);
    
    
    
    System.out.println("===== RIDE DETAILS =====");
    
    go.displayRideDetails();
    go.displayType();
    
    System.out.println();
    
    xl.displayRideDetails();
    xl.displayType();
    
    System.out.println();
    
    premium.displayRideDetails();
    premium.displayType();
    
    System.out.println("\n===== METHOD OVERLOADING =====");
    
    Ride ride = new Ride(
    "R104",
    "Customer",
    10
    );    
   
    System.out.println(
    "Normal Fare : ₹" +
    ride.calculateFare(10)
    );    
 
    System.out.println(
    "Surge Fare : ₹" +
    ride.calculateFare(10, 1.5)
    );
    
    System.out.println(
    "Discount Fare: ₹" +
    ride.calculateFare(10, 1.5, 20)
    );
    
    System.out.println("\n===== RUNTIME POLYMORPHISM =====");
    
    Ride r1 = new UberGo(
    "R201",
    "Customer 1",
    10
    );
    
    Ride r2 = new UberXL(
    "R202",
    "Customer 2",
    10
    );
    
    Ride r3 = new UberPremium(
    "R203",
    "Customer 3",
    10
    );    
    
    System.out.println(
    "UberGo Fare : ₹" +
    r1.calculateFare(10)
    );
    
    System.out.println(
    "UberXL Fare : ₹" +
    r2.calculateFare(10)
    );
    
    System.out.println(
    "UberPremium Fare: ₹" +
    r3.calculateFare(10)
    );
    
    System.out.println("\n===== MULTITHREADING =====");
    
    Thread driverThread = new Thread(() -> {
    
    for (int i = 1; i <= 5; i++) {
    
    System.out.println(
    "Driver Search: Checking driver " + i
    );

    try {    
    Thread.sleep(500);    
    } catch (InterruptedException e) {
    
    System.out.println(
    "Driver search interrupted."
    );
    }
    }
    });
    
    
    Thread fareThread = new Thread(() -> {
            for (int i = 1; i <= 5; i++) {
    
    System.out.println(
    "Fare System: Calculating fare..."
    );
    
    try {
    
    Thread.sleep(700);
    
    } catch (InterruptedException e) {
    
    System.out.println(
    "Fare calculation interrupted."
    );
    }
    }
    });
    
    
    Thread notificationThread = new Thread(() -> {
    
    for (int i = 1; i <= 5; i++) {
    
    System.out.println(
    "Notification: Sending update..."
    );

    try {
    
    Thread.sleep(400);
    
    } catch (InterruptedException e) {
    
    System.out.println(
    "Notification interrupted."
    );
    }
    }
    });
    
    driverThread.start();
    fareThread.start();
    notificationThread.start();
    
    try {
    driverThread.join();
    fareThread.join();
    notificationThread.join();
    }
    catch (InterruptedException e) {
    
    System.out.println(
    "Main thread interrupted."
    );
    }
    
    System.out.println(
    "\nRide processing completed."
    );
    }
    }


    /*write the diff between method overloading and overriding
    diffe bet runtime polymorphism and compile time polymorphism
    write what is multithreading */
    