package Week8;


/**
 * Write a description of class BankAc here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAc
{
    private long accountNumber;
    private double balance;
    private String name;
    
    // Constructors
    
    BankAc (long acNo, double bal, String name)
    {
        this.accountNumber= acNo;
        this.balance= bal;
        this.name= name;
    }
    
    public double getBalance()
    {
        return balance;
    }
    
    public void deposit(double amount)
    {
        this.balance = this.balance+amount;
    }
    
    public boolean withdraw(double amount)
    {
        if(amount<=this.balance){
            System.out.print("Withdrawal Successful");
            this.balance-=amount;
            return true;
        }else
        {
            System.out.println("ERROR");
            return false;
        }
    }
}