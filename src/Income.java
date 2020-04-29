import java.util.UUID;

public class Income {
    String id ;
    String description;
    int amount ;
    int month ;
    int year ;

    public Income( String description, int amount, int month, int year) {
        this.id = UUID.randomUUID().toString();
        this.description = description;
        this.amount = amount;
        this.month = month;
        this.year = year;
    }

}
