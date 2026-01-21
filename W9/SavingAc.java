package W9;


/**
 * Write a description of class SavingAc here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SavingAc extends BankAc
{
    private  double interestRate;
    
    public SavingAc(int AN, String AHN, double bal, double IR)
    {
        super(AN,AHN,bal);
        this.interestRate= IR;
    }
    
    public double calculateInterest()
    {
        return super.getBalance() * interestRate / 100;
    }
}