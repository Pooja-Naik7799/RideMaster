public class BikeFareStrategy implements FareStrategy {
    public double calculateFare(double distance) {
        return distance * 10;
    }
    
}
