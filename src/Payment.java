import java.util.UUID;

public class Payment implements Comparable<Payment> {
    String id ;
    String type ;
    int amount ;
    int month ;
    int year ;

    public Payment(String type, int amount, int month, int year) {
        this.id = UUID.randomUUID().toString();
        this.type = type;
        this.amount = amount;
        this.month = month;
        this.year = year;
    }

    @Override
    public int compareTo(Payment payment) {
        return Integer.compare(this.amount, payment.amount);
    }

    @Override
    public String toString() {
        return "Payment{" +
                "id='" + id + '\'' +
                ", type='" + type + '\'' +
                ", amount=" + amount +
                ", month=" + month +
                ", year=" + year +
                '}';
    }
}
