package W9;


/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
    protected int id;
    protected String name;
    protected double basicSalary;
    protected static String collegeName;
    
    public Person(int id, String name, double basicSalary)
    {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }
    
    public double calculateAnnualSalary()
    {
        return this.basicSalary * 12;
    }
}