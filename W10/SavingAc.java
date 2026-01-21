package W10;


/**
 * Write a description of class SavingAc here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SavingAc extends BankAc
{
    SavingAc(int accountNo, String holderName, double balance) {
        super(accountNo, holderName, balance);
    }

    @Override
    public double calculateInterest() {
        return super.calculateInterest() + (getBalance() * 0.03);
    }

    public double calculateInterest(double rate) {
        return getBalance() * rate;
    }
}