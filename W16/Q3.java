package W16;


/**
 * Write a description of class Q3 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q3
{
    public static void main(String[] args)
    {
        String name = " Dikshant Lama";
        String trimmed = name.trim();
        
        char c = name.charAt(5);
        int index = name.indexOf("m");
        System.out.println(index);
        
        boolean output = name.contains("ma");
        System.out.println(output);
    }
}