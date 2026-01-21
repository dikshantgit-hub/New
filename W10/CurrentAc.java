package W10;


/**
 * Write a description of class CurrentAc here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CurrentAc extends BankAc
{
    CurrentAc(int accountNo, String holderName, double balance) {
        super(accountNo, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return super.calculateInterest() + (getBalance() * 0.01);
    }

    public double calculateInterest(double rate) {
        return getBalance() * rate;
    }
}