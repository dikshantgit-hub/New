package W9;


/**
 * Write a description of class BankAc here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAc
{
    protected int accountNumber;
    protected String accountholderName;
    protected double balance;
    
    public BankAc(int AN, String AHN, double bal)
    {
        this.accountNumber= AN;
        this.accountholderName= AHN;
        this.balance= bal;
    }
    
    public void deposite(double amount)
    {
        if(amount > 0)
        {
            this.balance = this.balance + amount;
        }
        else
        {
            System.out.print("INVALID");
        }
    }
    
    public double getBalance()
    {
        return this.balance;
    }
}