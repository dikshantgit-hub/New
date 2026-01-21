package W10;


/**
 * Write a description of class doctor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class doctor extends Person
{
    private String specialization;
    private double consultationFee;
    
    public doctor(int id, String name, double baseSalary, String specilization, double consultationFee)
    {
        super(id, name, baseSalary);
        this.specialization= specialization;
        this.consultationFee= consultationFee;
    }
    
    public String getSpecialization() 
    {
        return specialization;
    }

    public void setSpecialization(String specialization) 
    {
        this.specialization = specialization;
    }

    public double getConsultationFee() 
    {
        return consultationFee;
    }

    public void setConsultationFee(double consultationFee) 
    {
        this.consultationFee = consultationFee;
    }

    public double calculateSalary() 
    {
        return super.calculateSalary() + consultationFee;
    }

    public double calculateSalary(int emergencyCases) 
    {
        return calculateSalary() + (emergencyCases * 5000);
    }

    public String toString() 
    {
        return super.toString() +"\n"+" Specialization: " + specialization +"\n"+" Salary: " + calculateSalary();
    }
}