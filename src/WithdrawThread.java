public class WithdrawThread implements Runnable{
    //making an instance (object) of the Account class
    private Account account;
    private double amount;

    //constructor
    public WithdrawThread(Account account, double amount){
        this.account = account;
        this.amount = amount;
    }

    //method run of the runnable interface
    public void run(){
        //make a withdrawl
        account.withdraw(amount);
    }
}