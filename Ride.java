public class Ride {
    private Passenger passenger;
    private Driver driver;
    private Vehicle vehicle;
    private RideStatus status;
    private FareStrategy fareStrategy;
private PaymentMethod paymentMethod;


    public Ride(Passenger passenger, Driver driver, Vehicle vehicle, FareStrategy fareStrategy,PaymentMethod paymentMethod
) {
        this.passenger = passenger;
        this.driver = driver;
        this.vehicle = vehicle;
        this.fareStrategy=fareStrategy;
        this.status = RideStatus.REQUESTED;
          this.paymentMethod = paymentMethod;
    }

    public void startRide() throws RideException{
         if (!driver.isAvaliable()) {
        throw new RideException("Driver not available for this ride");
    }
            status = RideStatus.ONGOING;
            driver.setAvaliable(false);
            System.out.println("Ride started for " + passenger.getName());
        
        }
    

    public void endRide() {
        status = RideStatus.COMPLETED;
        driver.setAvaliable(true);
        System.out.println("Ride completed for " + passenger.getName());
          RideHistory.addRide(this); //saves ride to history
    }

    public RideStatus getStatus() {
        return status;
    }
    public double calculateFare(double distance) {
    return fareStrategy.calculateFare(distance);
}
public void makePayment(double distance)throws RideException {
    if(distance<=0){
        throw new RideException("Distance must be positive");
    }
    double amount = fareStrategy.calculateFare(distance);
    paymentMethod.pay(amount);
}
public Passenger getPassenger() {
    return passenger;
}

public Vehicle getVehicle() {
    return vehicle;
}

}
