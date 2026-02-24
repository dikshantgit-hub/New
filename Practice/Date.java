package Practice;
import java.time.Period;
import java.time.LocalDate;


/**
 * Write a description of class Date here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Date
{
    public static void main(String[] args)
    {
        LocalDate today = LocalDate.now();
        LocalDate birthDate = LocalDate.of(2007, 8, 24);
        int years= Period.between(birthDate, today).getYears();
        System.out.println(today);
        System.out.println(birthDate);
        System.out.println(years);
    }
}