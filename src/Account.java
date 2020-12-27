import java.io.Serializable;

public class Account{

    private double balance = 0.0;

    //creating a constructor
    public Account(double balance){
        this.balance = balance;
    }

    //getters
    public double getBalance(){
        return this.balance;
    }

    //setter
    public void setBalance(double balance){
        this.balance = balance;
    }

    public synchronized void deposit(double amount){
        this.balance += amount;
    }

    public synchronized void withdraw(double amount){
        if(this.balance >= amount) {
            this.balance -= amount;
        }else{
            System.out.println("Insufficient Funds available");
        }

    }

    //toString method
    public String toString(){
        return String.format("Account Balance: %f", this.balance);
    }
}