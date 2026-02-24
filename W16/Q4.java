package W16;


/**
 * Write a description of class Q4 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q4
{
    public static void main(String[] args)
    {
        String text = " hEllO   gUys ";
        String trimmed = text.trim();
        System.out.println(trimmed);
        
        String [] words = trimmed.split("\\s+");
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < words.length; i++)
        {
            String first = words[i].substring(0,1).toUpperCase();
            String rest = words[i].substring(1).toLowerCase();
            sb.append(first).append(rest).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}