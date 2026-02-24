package W16;


/**
 * Write a description of class Q2 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q2
{
    public static void main(String[] args)
    {
            String info = " Dikshant Lama, 18";
            String trimmed = info.trim();
            System.out.println("Trimmed text: "+ trimmed);
            
            System.out.println(info.substring(0,10));
            
            String[] parts = trimmed.split("\\s+");
            for(int i =0; i < parts.length; i++)
            {
                System.out.println(parts[i]);
            }
    }
}