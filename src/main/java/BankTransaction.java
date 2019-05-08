
public class BankTransaction {

    private String operation;
    private String date;
    private int amount;
    private int balance;

    public BankTransaction(String operation, String date, int amount, int balance) {
        this.operation = operation;
        this.date = date;
        this.amount = amount;
        this.balance = balance;
    }

    public int getAmount() {
        return amount;
    }

    public String getOperation() {
        return operation;
    }

    public String toString(){
        return  "Operation: " + operation + " " + "Date: " +
                date + " " + "Amount: " + amount + " " + "Balance: " + balance;
    }

}
