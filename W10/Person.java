package W10;


/**
 * Write a description of class Person here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Person
{
    private int id;
    private String name;
    private double baseSalary;
    
    public Person(int id, String name, double baseSalary)
    {
        this.id= id;
        this.name= name;
    }
    
    public int getId()
    {
        return id;
    }
    
    public void setId()
    {
        this.id= id;
    }
    
    public String getName()
    {
        return name;
    }
    
    public void setName(String name) 
    {
        this.name = name;
    }
    
    public double getBaseSalary() 
    {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) 
    {
        this.baseSalary = baseSalary;
    }
    
    public double calculateSalary()
    {
        return baseSalary;
    }
    
     @Override
    public String toString() 
    {
        return "ID: " + id + "\n"+ " Name: " + name;
    }
}