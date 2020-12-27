public class DepositThread{
    private Account account;
    private double amount;

    //creating constructor
    public DepositThread(Account account, double amount){
        this.account = account;
        this.amount = amount;
    }

    public void run(){
        //make a deposit
        account.deposit(amount);
    }
}