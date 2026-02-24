package W16;


/**
 * Write a description of class Q7 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Q7
{
    public static boolean isValidPhone(String phone)
        {
            return phone.matches("^(98|97)[0-9]{8}$");
        }
        
    public static void main(String[] args) 
        {
            System.out.println(isValidPhone("9841234567"));
            System.out.println(isValidPhone("1234567890"));
            System.out.println(isValidPhone("98412345"));
            System.out.println(isValidPhone("98-412-345"));
        }
}