package W9;


/**
 * Write a description of class Employees here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Employees
{
    protected int employeeid;
    protected String Name;
    protected double basicSalary;
    
    public Employees(int employeeid, String Name, double basicSalary)
    {
        this.employeeid= employeeid;
        this.Name= Name;
        this.basicSalary= basicSalary;
    }
    
    public double calculateBonus()
    {
        return this.basicSalary * 0.10;
    }
    
    public void displayEmployee()
    {
        System.out.println("Employee Id: "+ this.employeeid);
        System.out.println("Employee Name: "+ this.Name);
        System.out.println("Employee salary: "+ this.basicSalary);
    }
}