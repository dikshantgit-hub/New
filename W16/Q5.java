package W16;
import java.util.Scanner;


/**
 * Write a description of class Q5 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q5
{
    public static void main(String[] args)
    {
         Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the initial string: ");
        String initialString = scanner.nextLine();
        
        StringBuilder sb = new StringBuilder(initialString);
        System.out.print("Enter the second string to append: ");
        
        String secondString = scanner.nextLine();
        sb.append(secondString);
        
        System.out.print("Enter an integer to append: ");
        int number = scanner.nextInt();
        sb.append(number);

        sb.append('!'); 
        System.out.println("Final modified string: " + sb.toString());
    }
}