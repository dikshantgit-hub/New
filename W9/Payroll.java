package W9;


/**
 * Write a description of class Payroll here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Payroll
{
    public static void main()
    {
        PermanentEmployee pe = new PermanentEmployee(101, "Ram", 20000, 5000, 2000);
        ContractEmployee ce = new  ContractEmployee(505, "Sita", 10000, 10);
        
        System.out.println("For PermanentEmployee");
        pe.displayEmployee();
        pe.calculateTotalSalary();
        
        System.out.println("For ContractEmployee");
        ce.displayEmployee();
        ce.calculateTotalSalary();
    }
}