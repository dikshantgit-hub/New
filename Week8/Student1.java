package Week8;


/**
 * Write a description of class Student1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Student1
{
    private String name;
    private int id;
    private String address;
    private long phoneNumber;
    private static String collegeName;
    //Constructors
    
    public Student1(String name, int id, String add, long phNo, String coll)
    {
        this.name= name;
        this.id= id;
        this.address= add;
        this.phoneNumber= phNo;
        this.collegeName= coll;
    }
    
    //setters and getters methods for name
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    // setters and getters methods for id
    
    public void setId(int id)
    {
        this.id = id;
    }
    
    public void displayInfo()
    {
        System.out.println("Name of this student: " + this.name);
        System.out.println("Id of this student: " + this.id);
        System.out.println("Address of this student: " + this.address);
        System.out.println("Phone number of this student: " + this.phoneNumber);
        System.out.println("College Name of this student: " + this.collegeName);
    }
    
    public void setAddress(String add)
    {
        this.address = address ;
    }
    
    public String getAddress()
    {
        return this.address ;
    }
    
    public void setPhoneNumber(int phno)
    {
        this.phoneNumber = phoneNumber;
    }
    
}