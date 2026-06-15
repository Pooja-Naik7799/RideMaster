public class CardPayment implements PaymentMethod{
    public void pay(double amount) {
        System.out.println("Paid Rs" + amount + " using Card");
    }
}
