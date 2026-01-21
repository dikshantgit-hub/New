package Week8;


/**
 * Write a description of class EmployeeSal here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class EmployeeSal
{
    private double basicSalary;
    
    
    //Constructors
    
    EmployeeSal(double baSal)
    {
        this.basicSalary = baSal;
    }
    
    public double calculateGrossSalary()
    {
        double gross = this.basicSalary + 0.20 * this.basicSalary;
        return gross;
    }
    
    //getter and setter for salary
    
    public double getBasicSalary()
    {
        return this.basicSalary;
    }
}