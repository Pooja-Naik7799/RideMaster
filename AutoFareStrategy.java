public class AutoFareStrategy implements FareStrategy{
    public double calculateFare(double distance) {
        return distance * 15;
    }
}
