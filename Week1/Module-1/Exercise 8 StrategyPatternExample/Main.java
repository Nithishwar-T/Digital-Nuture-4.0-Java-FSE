public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        context.setStrategy(new CreditCardPayment("1234-5678-9876-5432"));
        context.makePayment(1000);

        
        context.setStrategy(new PayPalPayment("nithu@gmail.com"));
        context.makePayment(750);
    }
}
