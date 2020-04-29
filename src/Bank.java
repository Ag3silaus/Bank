import java.util.AbstractCollection;
import java.util.ArrayList;
import java.util.List;

public class Bank {
    List<Account> accounts;

    public Bank() {
        this.accounts = new ArrayList<>();

        Account account1 = new Account(1);
        Account account2 = new Account(2);

        accounts.add(account1);
        accounts.add(account2);

        Payment houseRent = new Payment( "House Rent", 460,4,2020);
        Payment carRent = new Payment( "Car Rent", 560,4,2020);
        Payment groceries = new Payment("Groceries ", 160,4,2020);
        Income salary = new Income("Salary", 2000,4,2020);
        Income salaryOfLastMonth = new Income("Salary", 2000,3,2020);

        account1.addPayment(houseRent);
        account2.addPayment(groceries);
        account1.addPayment(carRent);
        account1.addIncome(salary);
        account1.addIncome(salaryOfLastMonth);

        System.out.println(account1.payments.size());
        System.out.println(account1.biggestPayment().toString());
        System.out.println(account1.totalIncome.amount);
    }
}
