public class Auto extends Vehicle{
    public Auto(String vehicleNumber) {
        super(vehicleNumber);
    }

    @Override
    public String getType() {
        return "Auto";
    }
}
