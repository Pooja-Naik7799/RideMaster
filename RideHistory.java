import java.util.ArrayList;
import java.util.List;

public class RideHistory {
    private static List<Ride> rides = new ArrayList<>();

    public static void addRide(Ride ride) {
        rides.add(ride);
    }

    public static void showHistory() {
        System.out.println("----- Ride History -----");
        for(Ride ride : rides) {
            System.out.println("Passenger: " + ride.getPassenger().getName() +
                               ", Vehicle: " + ride.getVehicle().getType() +
                               ", Status: " + ride.getStatus());
        }
    }
}

