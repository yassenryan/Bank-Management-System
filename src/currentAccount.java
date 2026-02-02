public class CurrentAccount extends Account{
    private double overdraft=500;

    public CurrentAccount(int accNum,String name){
                super(accNum,name);
    }

    @Override
    public boolean withdraw(double amount) {
        if(balance+overdraft<amount){
            return false;
        }
        else{
            balance-=amount;
            transactions.add(new Transaction("Withdraw: ",amount));
            return true;
        }
    }
}
