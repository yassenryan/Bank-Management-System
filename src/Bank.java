import java.util.ArrayList;
import java.util.List;

public class Bank {
    private List<Account>accounts=new ArrayList<>();

    public void addAccount(Account a){
        accounts.add(a);
    }

    public Account findAccount(int accNum){
        for(Account t:accounts){
            if(t.accountNum==accNum)
                return t;
        }
        return null;
    }

}
