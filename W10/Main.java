package W10;


/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args)
    {
        SavingAc s1 = new SavingAc(1001, "Alice", 50000);
        CurrentAc c1 = new CurrentAc(2001, "Bob", 80000);

        System.out.println(s1);
        System.out.println("Savings Interest: " + s1.calculateInterest());
        System.out.println("Savings Interest (Custom Rate): " + s1.calculateInterest(0.06));

        System.out.println(c1);
        System.out.println("Current Interest: " + c1.calculateInterest());
        System.out.println("Current Interest (Custom Rate): " + c1.calculateInterest(0.04));
    }
}