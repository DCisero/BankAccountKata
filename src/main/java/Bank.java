import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<BankTransaction> history = new ArrayList<>();

    public void deposit(int depositAmount) {
        BankTransaction transaction = new BankTransaction("Deposit","5/8/19",depositAmount,getAccountBalance());
        history.add(transaction);
    }

    public void withdraw(int withdrawAmount) {
        BankTransaction transaction = new BankTransaction("Withdraw","5/8/19",withdrawAmount,getAccountBalance());
        history.add(transaction);
    }

    public int getAccountBalance() {
        int accountBalance = 0;

        for (BankTransaction transaction : history) {
            if(transaction.getOperation().equals("Deposit")){
              accountBalance = accountBalance + transaction.getAmount();

            }
            if (transaction.getOperation().equals("Withdraw")){
                accountBalance = accountBalance - transaction.getAmount();
            }
        }
        return accountBalance;
    }

}
