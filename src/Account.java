import java.awt.*;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
public abstract class Account {
    protected int accountNum;
    protected String ownerName;
    protected double balance;
    protected List<Transaction> transactions;
    public Account(int accountNum,String ownerName){
        this.ownerName=ownerName;
        this.accountNum=accountNum;
        this.balance=0.0d;
        this.transactions=new ArrayList<>();
    }

    public void deposit(double amount){
        balance+=amount;
        transactions.add(new Transaction("Deposit:", amount));
    }

    public abstract boolean withdraw(double amount);
    public double getBalance() {
        return balance;
    }

    public void printAllTransactions(){
        for (Transaction s:transactions) {
            System.out.println(s);
        }
    }

}
