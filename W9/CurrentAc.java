package W9;


/**
 * Write a description of class CurrentAc here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CurrentAc extends BankAc
{
    private double overdraftLimit;
    
    public CurrentAc(int AN, String AHN, double bal, double overdraftLimit)
    {
        super(AN,AHN,bal);
        this.overdraftLimit = overdraftLimit;
    }
    
    public boolean withdraw(double amount)
    {
        if(amount <= this.balance + overdraftLimit)
        {
            return true;
        }else
        {
            return false;
        }
    }
    
    public double balance()
    {
        return this.overdraftLimit = balance + overdraftLimit;
    }
}