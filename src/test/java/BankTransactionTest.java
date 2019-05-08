import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BankTransactionTest {

    @Test
    public void returnAccountStatementAfterDeposit() {
        String deposit = "Deposit";
        String date = "5/7/19";
        int depositAmount = 500;
        int accountBalance = 500;

        BankTransaction bankStatement = new BankTransaction(deposit, date, depositAmount, accountBalance);

        String actualStatement = "Operation: " + deposit + " " + "Date: " +
                date + " " + "Amount: " + depositAmount + " " + "Balance: " + accountBalance;

        assertEquals(bankStatement.toString(),actualStatement);
    }

    @Test
    public void returnAccountStatementAfterWithdraw() {
        String withdraw = "Withdraw";
        String date = "5/8/19";
        int withdrawAmount = -150;
        int accountBalance = 350;
        BankTransaction bankStatement = new BankTransaction(withdraw, date, withdrawAmount, accountBalance);

        String actualStatement =  "Operation: " + withdraw + " " + "Date: " +
                date + " " + "Amount: " + withdrawAmount + " " + "Balance: " + accountBalance;

        assertEquals(bankStatement.toString(), actualStatement);
    }
}
