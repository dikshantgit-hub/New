package W17;


/**
 * Write a description of class Model here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Model
{
    private String studentId;
    private String name;
    private String course;

    public Model(String studentId, String name, String course) 
    {
        this.studentId = studentId;
        this.name = name;
        this.course = course;
    }

    public String getFormattedDetails() {
        return "<html><center><h2>Student ID Card</h2>ID: 1073  <br>Name: Dikshant Lama  <br>Course: Computing</center></html>";
    }
}