package exercise4;

public class AdapterTest {

    public static void main(String[] args) {

        PaymentProcessor payPalPayment =
                new PayPalAdapter(
                        new PayPalGateway());

        PaymentProcessor stripePayment =
                new StripeAdapter(
                        new StripeGateway());

        payPalPayment.processPayment(1000);

        stripePayment.processPayment(2000);
    }
}