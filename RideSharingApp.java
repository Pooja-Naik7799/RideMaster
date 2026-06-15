import java.util.Scanner;

public class RideSharingApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Passenger and Driver (can reuse same)
        Passenger p = new Passenger("Pooja", "7671938209", 1);
        Driver d = new Driver("Jothy", "9442071713", 101);

        System.out.println("Enter distance in km:");
        double distance = sc.nextDouble();

        System.out.println("Choose vehicle: 1. Bike 2. Car 3. Auto");
        int vehicleChoice = sc.nextInt();
        sc.nextLine(); // consume newline

        System.out.println("Enter vehicle number:");
        String vehicleNumber = sc.nextLine();

        System.out.println("Choose payment method: 1. UPI 2. Card 3. Cash");
        int paymentChoice = sc.nextInt();

        // Create vehicle and fare strategy based on choice
        Vehicle vehicle = null;
        FareStrategy fare = null;
        switch(vehicleChoice){
            case 1:
                vehicle = new Bike(vehicleNumber);
                fare = new BikeFareStrategy();
                break;
            case 2:
                vehicle = new Car(vehicleNumber);
                fare = new CarfareStrategy();
                break;
            case 3:
                vehicle = new Auto(vehicleNumber);
                fare = new AutoFareStrategy();
                break;
            default:
                System.out.println("Invalid vehicle choice");
                return;
        }

        // Create payment method
        PaymentMethod payment = null;
        switch(paymentChoice){
            case 1: payment = new UpiPayment(); break;
            case 2: payment = new CardPayment(); break;
            case 3: payment = new CashPayment(); break;
            default:
                System.out.println("Invalid payment choice");
                return;
        }

        // Create ride
        Ride ride = new Ride(p, d, vehicle, fare, payment);

        // Start ride, calculate fare & make payment, end ride
        try {
            ride.startRide();
            System.out.println("Ride Status: " + ride.getStatus());

            // Fare calculation
            double totalFare = ride.calculateFare(distance); // stays the same
            System.out.println("Fare for " + distance + " km: Rs" + totalFare);

            // Make payment
            ride.makePayment(distance);

            ride.endRide();
            System.out.println("Ride Status: " + ride.getStatus());

        } catch(RideException e){
            System.out.println("Error: " + e.getMessage());
        }

        // Show ride history
        RideHistory.showHistory();
    }
}
