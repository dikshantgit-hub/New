package CourseWork;


/**
 * Write a description of class PersonalPlan here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PersonalPlan extends AIModel
{
    private int prompts = 500;
    
    public PersonalPlan(String modelName, Double price, int parameter, String window, int prompts)
    {
        super(modelName, price, parameter, window);
        this.prompts= prompts;
    }
    
    public int getPrompts()
    {
        return prompts;
    }
    
    public String purchasePrompts(int prompts)
    {
        if(prompts < 0)
        {
            return "Enter positive value or user must upgrade to pro plan !";
        }
        prompts +=prompts;
        return prompts 
        
        
    }
    
    @Override
        public void displayInfo()
        {
        System.out.println("Model Name: "+ this.modelName);
        System.out.println("Price:: "+ this.price);
        System.out.println("Parameter: "+ this.parameter);
        System.out.println("Window Size: "+ this.window);
        }
}