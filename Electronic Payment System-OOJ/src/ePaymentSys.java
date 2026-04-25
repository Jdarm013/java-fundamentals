import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class ePaymentSys {

    interface PaymentMethod {
        void authorize();

        void process();
    }
        abstract class Transaction {
            String id;
            double amount;
            ZonedDateTime dateTime;

            Transaction(String id, double amount) {
                this.id = id;
                this.amount = amount;
                this.dateTime = ZonedDateTime.now();
            }

            void printReceipt() {
                DateTimeFormatter transactionDateFormatter = DateTimeFormatter.ofPattern("MM/dd/yyyy hh:mm a z", Locale.US);
                System.out.println("RECEIPT ID: " + id + " Transaction Amount: $" + String.format("%.2f Transaction Date: %s", amount, transactionDateFormatter.format(dateTime)));
            }
        }

        class CreditCardPayment extends Transaction implements PaymentMethod{
                String cardType;
                CreditCardPayment(String id, double amount, String cardType){
                    super(id, amount);
                    this.cardType = cardType;
                }

                @Override
            public void authorize() {
                    System.out.println("Contacting " + cardType + " network...");
                }
                @Override
                public void process() {
                System.out.println("Payment has been charged.");
                }
        }
        class BankTransfer  extends Transaction implements PaymentMethod{
        String routingNumber;

        BankTransfer(String id, double amount, String routingNumber) {
            super(id, amount);
            this.routingNumber = routingNumber;
        }
        @Override
        public void authorize() {
                System.out.println("Checking Routing Number: " + routingNumber);
        }
        @Override
        public void process() {
            System.out.println("ACH Transfer has been Initiated");
        }
    }

    public void processPayment(PaymentMethod p) {
        switch (p) {
            case BankTransfer bt -> {
                System.out.println(" ---Processing Bank Transfer --- ");
                bt.process();
                bt.authorize();
                bt.printReceipt();
                System.out.println(" ---------------------------------- ");
            }
            case CreditCardPayment cc -> {
                System.out.println(" ---Processing Credit Card--- ");
                cc.process();
                cc.authorize();
                cc.printReceipt();
                System.out.println(" --------------------------------- ");
            }
            case null -> {
                System.out.println("Payment is NULL");
            }
            default -> {
                System.out.println("Unknown Payment Type");
            }
        }
        }
        public void testPaymentSystem(){
        PaymentMethod p1 = new BankTransfer("BT-55", 999.99, "021000021");
        PaymentMethod p2 = new CreditCardPayment("CC-01",250.00,"Visa");
        PaymentMethod p3 = new CreditCardPayment("CC-02",125.00,"Mastercard");

        processPayment(p1);
        processPayment(p2);
        processPayment(p3);
        }
        public static void main(String[] args) {
        ePaymentSys ps = new ePaymentSys();
        ps.testPaymentSystem();
        }
}




