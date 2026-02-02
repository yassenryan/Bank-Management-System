import java.time.LocalDateTime;

public class Transaction {
    private String type;
    private double amount;
    private LocalDateTime time;

    public Transaction(String type,double amount){
        this.amount=amount;
        this.type=type;
        this.time=LocalDateTime.now();
    }

    @Override
    public String toString() {
        return time + " | " + type + " | " + amount;
    }




}
