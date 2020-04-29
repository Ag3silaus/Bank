import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class Account {
    int id = 0;
    HashSet<Payment> payments = new HashSet<>();
    HashSet<Income> incomes = new HashSet<>();


    public Account(int id) {
        this.id = id;
        this.payments = payments;
        this.incomes = incomes;
    }
    public void addIncome(Income income) {
        incomes.add(income);
    }



    public void addPayment(Payment payment) {
        payments.add(payment);
    }

    public Payment biggestPayment() {
        return Collections.max(payments);
    }
    public Income totalIncome() {
        for( int i=0; i<incomes.size();i++){
            
        }

    }
}

