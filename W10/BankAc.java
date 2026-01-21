package W10;


/**
 * Write a description of class BankAc here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankAc
{
     private int accountNo;
    private String holderName;
    private double balance;

    BankAc(int accountNo, String holderName, double balance) {
        this.accountNo = accountNo;
        this.holderName = holderName;
        this.balance = balance;
    }

    public int getAccountNo() {
        return accountNo;
    }

    public void setAccountNo(int accountNo) {
        this.accountNo = accountNo;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double calculateInterest() {
        return balance * 0.02;
    }

    @Override
    public String toString() {
        return "AccountNo: " + accountNo +"\n"+" Holder: " + holderName +"\n"+" Balance: " + balance;
    }
}