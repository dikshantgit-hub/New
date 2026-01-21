package W9;


/**
 * Write a description of class Teacher here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Teacher extends Person
{
    private String subject;
    private double bonus;
    
    public Teacher(int id, String name, double basicSalary, String sub, double bonus)
    {
        super(id,name,basicSalary);
        this.subject= sub;
        this.bonus = bonus;
    }
    
    @override
    public calculateAnnualSalary()
    {
        return super.calculateAnnualSalary() + bonus;
    }
}