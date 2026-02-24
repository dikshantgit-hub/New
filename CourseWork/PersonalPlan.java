package CourseWork;


/**
 * Write a description of class PersonalPlan here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PersonalPlan extends AIModel
{
    int prompts;
    
    public PersonalPlan(String modelName, Double price, int parameter, String window, int prompts)
    {
        super(modelName, price, parameter, window);
        this.prompts= prompts;
    }
    
    
}