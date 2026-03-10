package CourseWork;


/**
 * Write a description of class PersonalPlan here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PersonalPlan extends AIModel
{
    private int prompt; //attribute
    
    //Constructor
    public PersonalPlan(String modelName, double price, int parameter, String window, int prompts) 
    {
        super(modelName, price, parameter, window);
        this.prompt= prompts;
    }
    
    //Getter method 
    public int getPrompts()
    {
        return prompt;
    }
    
    //Method to purchase prompts
    public String purchasePrompts(int promp)
    {
        if(promp <= 0)
        {
            return "Enter positive value or user must upgrade to Pro Plan !";
        }
        prompt +=promp;
        return promp + " prompts added. Total prompts: " + prompt;
    }
    
    //Method to enter prompt text and expected token
    public String enterPrompt(String promptText, int expectedTokens)
    {
    if(expectedTokens > getParameter()) //if the expected tokena is greater than parameter then returns rejected.
    {
        return "Prompt rejected: exceeds context window.";
    }

    if(prompt > 0) //if the prompt is more tha 0 then decrease by 1.
    {
        prompt--;
        return "Prompt: "+ promptText +"Expected Tokens: "+ expectedTokens +"Remaining Prompts: " + prompt;
    }
    return "Monthly plan limit reached, upgrade to Pro";
    }
    
    //Overriding the method of AiModel
    @Override
    public String displayInfo()
    {
        return super.displayInfo() +
               "Remaining Monthly Prompts: "+ prompt;
    }
        
    }