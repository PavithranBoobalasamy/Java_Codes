abstract class PaymentMethod {
    String payee;

    PaymentMethod(String payee) {
        this.payee = payee;
    }

    void paymentSummary() {
        System.out.println("Paying to: " + this.payee);
    }

    abstract void processPayment();

    void pay(double amount) {
        System.out.println("Paid ₹" + amount);
    }

    void pay(double amount, String note) {
        System.out.println("Paid ₹" + amount + " for " + note);
    }
}

class CreditCard extends PaymentMethod {
    String cardNumber;

    CreditCard(String payee, String cardNumber) {
        super(payee);
        this.cardNumber = cardNumber;
    }

    @Override
    void processPayment() {
        super.paymentSummary();
        System.out.println("Processed via Credit Card: " + cardNumber);
    }
}

class UPI extends PaymentMethod {
    String upiId;

    UPI(String payee, String upiId) {
        super(payee);
        this.upiId = upiId;
    }

    @Override
    void processPayment() {
        super.paymentSummary();
        System.out.println("Processed via UPI: " + upiId);
    }
}
public class MainPoly {
    public static void main(String[] args) {
        System.out.println("=== Compile-Time Polymorphism ===");
        PaymentMethod method = new CreditCard("Amazon", "1234-5678-9876-5432");
        method.pay(2500);
        method.pay(4500, "Order #ID123");

        System.out.println("\n=== Run-Time Polymorphism ===");
        PaymentMethod p1 = new CreditCard("Flipkart", "9999-8888-7777-6666");
        PaymentMethod p2 = new UPI("Zomato", "pavi@upi");

        p1.processPayment();
        p2.processPayment();

        System.out.println("\n=== Polymorphic Array Demo ===");
        PaymentMethod[] payments = {
            new CreditCard("Myntra", "1111-2222-3333-4444"),
            new UPI("Swiggy", "pavithran@upi"),
        };

        for (PaymentMethod payment : payments) {
            payment.processPayment();
        }
    }
}
