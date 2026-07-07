public class StrategyPatternDemo {

    public static void main(String[] args) {

        PaymentContext creditCard =
                new PaymentContext(new CreditCardPayment());

        creditCard.executePayment(5000);

        PaymentContext paypal =
                new PaymentContext(new PayPalPayment());

        paypal.executePayment(2500);
    }
}