package Week8;


/**
 * Write a description of class Student here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student
{
    String name;
    int id;
    
    // <Access Modifier><className>(){}
    // Constructor overloading
    public Student(String name)
    {
        this.name = name;
    }
    
    public Student(int id)
    {
        this.id = id;
    }
    
    public Student(String nam, int id)
    {
        this.name = nam;
        this.id = id;
    }
}