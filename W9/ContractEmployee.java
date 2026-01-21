package W9;


/**
 * Write a description of class ContractEmployee here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ContractEmployee extends Employees
{
    private int workingDays;
    
    public ContractEmployee(int employeeid, String Name, double basicSalary, int WK)
    {
        super(employeeid,Name,basicSalary);
        this.workingDays= WK;
    }
    
    public double calculateTotalSalary()
    {
        return this.basicSalary * workingDays;
    }
    
    
}