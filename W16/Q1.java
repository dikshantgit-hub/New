package W16;
import java.util.Scanner;


/**
 * Write a description of class Q1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q1
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        
        System.out.println("Enter first string!");
        String S1 = scan.nextLine();
        
        System.out.println("Enter second string!");
        String S2 = scan.nextLine();
        
        String S3 = S1.concat(S2);
        System.out.println("The concat is: "+ S3);
        
        String S4 = scan.nextLine();
        boolean result = S3.equals(S4);
        
        System.out.println(result);
    }
}