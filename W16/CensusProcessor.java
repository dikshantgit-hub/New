package W16;


/**
 * Write a description of class CensusProcessor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CensusProcessor
{
    public static Student[] parseCSV(String[] csvData)
    {
        Student[] students = new Student[csvData.length-1];
        int index = 0;
        
        for(int i =1; i < csvData.length; i++)
        {
            String[] data = csvData[i].split(",");
            
            String name = data[0].trim();
            int age = Integer.parseInt(data[1].trim());
            String school = data[2].trim();
            int grade = Integer.parseInt(data[3].trim());
            String citizenship = data[4].trim();
            String phone = data[5].trim();
            
            students[index++] = new Student(name, age, school, grade, citizenship, phone);
        }
        
        return students;
    }
    
    public static boolean isValidCitizenship(String citiz)
    {
        if(citiz.length() != 10) 
        return false;
        if(citiz.charAt(2) != '-')
        return false;
        
        for(int i = 0; i<citiz.length(); i++)
        {
            if(i == 2) continue;
            if(!Character.isDigit(citiz.charAt(i))) return false;
        }
        return true;
    }
    
    public static Student[] findBySchool(Student[] students, String school)
    {
        int count=0;
        for(Student s:students)
            if(s.getSchool().equalsIgnoreCase(school))
            count ++;
        
        Student[] result = new Student[count];
        int i = 0;
        for(Student s:students)
            if(s.getSchool().equalsIgnoreCase(school))
            result[i++] = s;   
        return result;
    }
    
    public static int countByGrade(Student[] students, int grade)
    {
        int count = 0;
        for(Student s:students)
            if(s.getGrade() == grade)
            count++;
        return count;
    }
    
    public static double averageAge(Student[] students )
    {
        int sum = 0;
        for(Student s:students)
            sum += s.getAge();
        return (double) sum/students.length;
    }
    
    public static Student findLongestName(Student[] students)
    {
        Student longest = students[0];
        for(Student s:students)
        {
            if(s.getName().length() > longest.getName().length())
            longest = s;
        }
        return longest;
    }
    
    public static String generateCensusReport(Student[] students)
    {
        StringBuilder sb = new StringBuilder();
        
        int total = students.length;
        int invalid = 0;
        int valid = 0;
        
        for(Student s:students)
        {
            if(isValidCitizenship(s.getCitizenship()))
                valid++;
            else 
                invalid++;
        }
    
        sb.append("========== Nepal School Census Report ==========\n");
        sb.append(String.format("Total Students: %d  Valid Records: %d  Invalid Records: %d\n", total, valid, invalid));
        
        sb.append("-- Student List --\n");
        for(Student s:students)
        {
            String status = isValidCitizenship(s.getCitizenship()) ? "VALID" : "INVALID";
            
            sb.append(String.format("%-6s %-20s | %2d | Grade %-2d | %s\n", s.getNameInitials(), s.getName(), s.getAge(), 
            s.getGrade(), status));
        }
        
        sb.append("\n-- Statistics --\n");
        
        sb.append(String.format("Average age: %.1f\n", averageAge(students)));
        
        Student longest = findLongestName(students);
        sb.append(String.format("Longest name: %s (%d chars)\n", longest.getName(), longest.getName().length()));
        
        int itahariCount = 0;
        for(Student s:students)
        {
            if(s.getSchool().equalsIgnoreCase("Itahari Int. College"))
            {
                itahariCount++;
            }
        }
        sb.append(String.format("Itahari Int. College: %d students\n", itahariCount));
        
        return sb.toString();
        }
}  


