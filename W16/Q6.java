package W16;


/**
 * Write a description of class Q6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q6
{
    public static void main(String[] args)
    {
        String text =" Dad ";
        String trimmed = text.trim();
        System.out.println(trimmed);
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = trimmed.length()-1; i>= 0;i--)
        {
            sb.append(trimmed.charAt(i));
        }
        String reversedString = sb.toString();
        System.out.println(reversedString);
        
        if(trimmed.equalsIgnoreCase(reversedString))
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Noy Palindrome");
        }
    }
}