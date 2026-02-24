package Practice;
import java.util.Scanner;


/**
 * Write a description of class Multi here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Multi
{
    public static void main(String[] args)
    {
    Scanner scan= new Scanner(System.in);
    
    String[] ans= {"a","c","b"};
    String[] res= {"", "", ""};
    System.out.println("What is my Name?");
    System.out.println("a) Dikshant");
    System.out.println("b) Diksh");
    System.out.println("c) Diwa");
    
    System.out.println("What is my mother Name?");
    System.out.println("a) Manju");
    System.out.println("b) Manish");
    System.out.println("c) Maya");
    
    System.out.println("What is my surName?");
    System.out.println("a) Poudel");
    System.out.println("b) Lama");
    System.out.println("c) Rai");
    
    res[0]= scan.next();
    res[1]= scan.next();
    res[2]= scan.next();
    
    int score = 0;
    
    for(int i= 0; i<3; i++)
    {
        if(res[i].equalsIgnoreCase(ans[i]))
        {
            score++;
        }
    }
        System.out.println("Score: "+ score + "/3");
    }
}