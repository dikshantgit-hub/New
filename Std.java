import java.util.ArrayList;

/**
 * Write a description of class Std here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Std
{
    private int id;
    private String name;
    private String gender;
    private String skill;
    private String course;
   
    private static ArrayList<Std> studentList = new ArrayList<>();
   
    public Std(int id, String name, String gender, String skill, String course) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.skill = skill;
        this.course = course;
    }
   
    public int getId() {
        return id;
    }
   
    public String getName() {
        return name;
    }
   
    public String getGender() {
        return gender;
    }
   
    public String getSkill() {
        return skill;
    }
   
    public String getCourse() {
        return course;
    }
   
    public static boolean addStudent(Std student) {
        for (Std s : studentList) {
            if (s.getId() == student.getId()) {
                return false;
            }
        }
        studentList.add(student);
        return true;
    }
   
    public static void viewStudents() {
        if (studentList.isEmpty()) {
            System.out.println("No students !!!");
        }
        for (Std s : studentList) {
            System.out.println("ID: " + s.getId() + ", Name: " + s.getName() +
                             ", Gender: " + s.getGender() + ", Skill: " + s.getSkill() +
                             ", Course: " + s.getCourse());
        }
    }
   
    public static boolean deleteStudent(int id) {
        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getId() == id) {
                studentList.remove(i);
                return true;
            }
        }
        return false;
    }
}