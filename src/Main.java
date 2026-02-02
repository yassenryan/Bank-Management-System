import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Account account=null;
        Scanner scanner=new Scanner(System.in);
        while(true){
            System.out.println("*********BANKING SYSTEM*********");
            System.out.println("1: CREATE SAVING ACCOUNT ");
            System.out.println("2: CREATE CURRENT ACCOUNT ");
            System.out.println("3: DEPOSIT ");
            System.out.println("4: WITHDRAW ");
            System.out.println("5: BALANCE INQUIRY ");
            System.out.println("6: TRANSACTION HISTORY ");
            System.out.println("7: EXIT ");
            System.out.print("CHOOSE: ")    ;
            int choice=scanner.nextByte();
            scanner.nextLine();
            switch (choice){
                case 1:{
                    System.out.print("Enter Account Number: ");
                    int accnum=scanner.nextByte();
                    scanner.nextLine();
                    System.out.print("Enter your name: ");
                    String name=scanner.nextLine();
                    account=new SavingAccount(accnum,name);
                    break;
                }
                case 2:{
                    System.out.print("Enter Account Number: ");
                    int accnum=scanner.nextByte();
                    scanner.nextLine();
                    System.out.print("Enter your name: ");
                    String name=scanner.nextLine();
                    account=new CurrentAccount(accnum,name);
                    break;
                }
                case 3:{
                    if(account==null){
                        System.out.println("Create an account first");
                    }
                    else{
                        System.out.print("Enter amount");
                        double amount= scanner.nextDouble();
                        scanner.nextLine();
                        account.deposit(amount);
                        System.out.println("Added successfully");
                    }
                    break;
                }
                case 4:{
                    if(account==null){
                        System.out.println("Create an account first");
                    }
                    else{
                        System.out.print("Enter amount");
                        double amount= scanner.nextDouble();
                        scanner.nextLine();
                        account.withdraw(amount);
                        if(account.withdraw(amount))
                            System.out.println("Withdrawed successfully");
                        else
                            System.out.println("Not enough balance");
                    }
                    break;
                }
                case 5:{
                    if(account==null)
                        System.out.println("Create an account first");
                    else
                        System.out.println("Balance: "+account.getBalance());
                break;
                }
                case 6:{
                    if(account==null)
                        System.out.println("Create an account first");
                    else
                        account.printAllTransactions();
                break;
                }
                case 7:{
                    System.out.println("GOOD BYE");
                    return;
                }

            }


        }

    }
}