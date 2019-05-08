import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BankTest {

    Bank bank;

    @Before
    public void setUp(){
        bank = new Bank();
    }

    @Test
    public void depositAddsMoneyToTheAccount(){
        int depositAmount = 100;

        bank.deposit(depositAmount);

        assertEquals(bank.getAccountBalance(),depositAmount);
    }

    @Test
    public void withdrawSubtractsMoneyFromTheAccount(){
        int withdrawAmount = 50;

        bank.withdraw(withdrawAmount);

        assertEquals(bank.getAccountBalance(),-withdrawAmount);
    }

    @Test
    public void returnAccountBalanceAfterDeposits(){
        bank.deposit(900);

        int accountBalance = 900;

        assertEquals(bank.getAccountBalance(), accountBalance);
    }

    @Test
    public void returnAccountBalance_AfterDepositAndWithdrawal(){
        bank.deposit(500);
        bank.withdraw(100);

        int accountBalance = 400;

        assertEquals(accountBalance,bank.getAccountBalance());
    }
}
