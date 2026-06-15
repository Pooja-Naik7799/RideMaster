public class CashPayment implements PaymentMethod {
    public void pay(double amount) {
        System.out.println("Paid Rs" + amount + " using Cash");
    }
}
