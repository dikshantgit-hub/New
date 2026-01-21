package W10;


/**
 * Write a description of class HospitalApp here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HospitalApp
{
    public static void main(String[] Args)
    {
        doctor d1= new doctor(101, "Dr.Ram", 100000, "Ginologist", 200000);
        Nurse n1= new Nurse(105, "Sita", 50000, "Night", 100000);
        
        System.out.println(d1);
        System.out.println("Doctor Salary with Emergencies: " + d1.calculateSalary(2));
        System.out.println(n1);
    }
}