package TC;
import java.util.ArrayList;


/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Person> persons = new ArrayList<>();
        
        Student std1 = new Student("Dikshant", 23, "Computing");
        Teacher teacher = new Teacher("Ram", 34, "Programming");
        
        //Upcasting 
        
        Person p1 = std1;
        Person p2 = teacher;
        
        p1.showBasicInfo();
        p2.showBasicInfo();
        
        //DownCasting
        
        if(p1 instanceof Student)
        {
            Student s1 = (Student) p1;
            s1.attendClass();
            persons.add(s1);
        }
        
        if(p2 instanceof Teacher)
        {
            Teacher t1 = (Teacher) p2;
            t1.takeLecture();
            persons.add(t1);
        }
        
        for(Person pp: persons)
        {
            if(pp instanceof Teacher)
            {
                pp.showBasicInfo();
            }
        }
        //p1.attendClass();
        //p2.takeLecture();
    }
}