public class CarfareStrategy implements FareStrategy {
    public double calculateFare(double distance) {
        return distance * 20;
    }
}
