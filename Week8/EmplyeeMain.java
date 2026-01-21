package Week8;


/**
 * Write a description of class EmplyeeMain here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EmplyeeMain
{
    public static void main(String[] args)
    {
        EmployeeSal E1 = new EmployeeSal(10000);
        System.out.println("Basic Salary" + E1.getBasicSalary());
        System.out.println("Gross Salary" + E1.calculateGrossSalary());
    }
}