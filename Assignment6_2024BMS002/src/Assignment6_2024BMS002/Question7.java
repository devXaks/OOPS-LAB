package Assignment6_2024BMS002;

import java.util.ArrayList;
import java.util.List;

interface Account{
    //deposit,wthdraw,intrest,balance
    void deposit(double amount);
    void withdraw(double amount);
    double getBalance();
    double getInterest();
    }

class SavingsAccount implements Account{
    public String accountNo;
    private double balance;
    private double interestRate;

    public SavingsAccount(String accountNo, double balance, double interestRate) {
        this.accountNo = accountNo;
        this.balance = balance;
        this.interestRate = interestRate;
    }
    public void deposit(double amount){
        balance += amount;
        System.out.println("The current balance is now " + balance);

    }
    public void withdraw(double amount){
        if(amount > 0 && balance >= amount){
            balance -= amount;
            System.out.println("The current balance is now " + balance);
        }
        else{
            System.out.println("Insufficient balance");
        }
    }
    public double getBalance(){
        return balance;
    }
    public double getInterest(){
        return interestRate*balance/100;
    }

}
class CurrentAccount implements Account{
    private double balance;
    public String accountNo;
    private double intrestRate;

    public CurrentAccount(String accountNo, double balance, double intrestRate) {
        this.accountNo = accountNo;
        this.balance = balance;
        this.intrestRate = intrestRate;
    }
    public void deposit(double amount){
        balance += amount;
    }
    public void withdraw(double amount){
        if(amount > 0 && balance >= amount){
            balance -= amount;
            System.out.println("The current balance is now " + balance);
        }
        else{
            System.out.println("Insufficient balance");
        }
    }
    public double getBalance(){
        return balance;
    }
    public double getInterest(){
        return intrestRate*balance/100;
    }


}
class Bank{
    private List<Account> accountslist;
    Bank(){
        accountslist = new ArrayList<>();
    }    public void addAccount(Account account){
        accountslist.add(account);
        System.out.println("Account successfully added to the list");
    }


}

public class Question7 {
    public static void main(String[] args) {
        Bank bank1 = new Bank();
        SavingsAccount sav1 = new SavingsAccount("100000001", 1000.00, 4.33);
        CurrentAccount cur1 = new CurrentAccount("100000002", 1000.00, 0);
        bank1.addAccount(sav1);
        bank1.addAccount(cur1);
        sav1.deposit(500);
        double int1 = sav1.getInterest();
        System.out.println("The interest in savings account is " + int1);
        sav1.withdraw(500);
        cur1.withdraw(500);
        cur1.getBalance();
        double int2 = cur1.getInterest();
        System.out.println("The interest in current is " + int2);

    }
}
