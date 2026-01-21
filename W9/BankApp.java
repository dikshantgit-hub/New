package W9;


/**
 * Write a description of class BankApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankApp
{
    public static void main(String[] args){
        SavingAc SA= new SavingAc(123, "Manish", 10000);
        CurrentAc CA= new CurrentAc(234, "Kaley", 20000);
        
        SA.getBalance();
        SA.calculateInterest();
        
        CA.getBalance();
        CA.balance();
    }
}