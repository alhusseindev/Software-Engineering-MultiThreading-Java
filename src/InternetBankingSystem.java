public class InternetBankingSystem{
    public static void main(String[] args){
        Account accountObject = new Account(100); //initializing my account with 100 dollars

        //creating new deposit instance (new deposit thread)
        DepositThread myThread = new DepositThread(accountObject, 30);
        myThread.run();
        
        System.out.println(myThread);
        System.out.println("Account Balance: " + accountObject.getBalance());

        //creating new deposit thread 2
        DepositThread  myThread2 = new DepositThread(accountObject, 20);
        myThread2.run();

        System.out.println(myThread2);
        System.out.println("Account Balance: " + accountObject.getBalance());

        //creating new deposit thread 3
        DepositThread myThread3 = new DepositThread(accountObject, 20);
        myThread3.run();

        System.out.println(myThread3);
        System.out.println("Account Balance: " + accountObject.getBalance());

        //creating new withdraw thread 1
        WithdrawThread myWThread1 = new WithdrawThread(accountObject, 30);
        myWThread1.run();

        System.out.println(myWThread1);
        System.out.println("Account Balance: " + accountObject.getBalance());

        //creating new withdraw thread 2
        WithdrawThread myWThread2 = new WithdrawThread(accountObject, 50);
        myWThread2.run();

        System.out.println(myWThread2);
        System.out.println("Account Balance: " + accountObject.getBalance());

        //creating new withdraw thread 3
        WithdrawThread myWThread3 = new WithdrawThread(accountObject, 20);
        myWThread3.run();

        System.out.println(myWThread3);
        System.out.println("Account Balance: " + accountObject.getBalance());

    }
}