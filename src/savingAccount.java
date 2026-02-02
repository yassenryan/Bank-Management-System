public class SavingAccount extends Account{
    public SavingAccount(int accNum,String name){
        super(accNum,name);
    }

    @Override
    public boolean withdraw(double amount) {
        if(amount>balance)
            return false;
        else {
            balance -= amount;
            transactions.add(new Transaction("Withdraw:",amount));
            return true;
        }
    }

}
