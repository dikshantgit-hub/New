package Week8;
import java.util.Scanner;


/**
 * Write a description of class BankACMain here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BankACMain
{
    public static void main(String[] args)
    {
    Scanner input= new Scanner (System. in);
    BankAc a1=new BankAc (1,101,"Ram");
    System.out.println("Current balance is: " + a1.getBalance());
    System.out.println("how much would you like to deposit?");
    double tmp=input.nextDouble();
    a1.deposit (tmp);
    System.out.println("How much you want to withdraw");
    tmp=input.nextDouble() ;
    a1.withdraw(tmp) ;
    System.out.println("Current balance is:" + a1.getBalance());
    }
}