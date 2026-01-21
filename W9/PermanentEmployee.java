package W9;


/**
 * Write a description of class PermanentEmployee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PermanentEmployee extends Employees
{
    private double HRA;
    private double DA;
    
    public PermanentEmployee(int employeeid, String Name, double basicSalary, double HRA, double DA)
    {
        super(employeeid,Name,basicSalary);
        this.HRA = HRA;
        this.DA = DA;
    }
    
    public double calculateTotalSalary()
    {
        return this.basicSalary + HRA + DA + super.calculateBonus();
    }
}