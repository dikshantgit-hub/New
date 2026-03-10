package CourseWork;


/**
 * Write a description of class ProPlan here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ProPlan extends AIModel
{
    private int slot; //attributes
    
    //Constructor
    public ProPlan(String modelName, double price, int parameter, String window, int slot)
    {
        super(modelName, price, parameter, window);
        this.slot= slot;
    }
    
    //Method to add team member
    public String addTeamMember(String memberName)
    {
        if(slot > 0) 
        {
            slot--;
            return "Team member " + memberName + " added. Remaining slots: " + slot;
        }
        else
        {
            return "Error: No available team slots in the Pro Plan.";
        }
    }

    //Method to remove team member
    public String removeTeamMember(String memberName)
    {
        slot++;
        return "Team member " + memberName + " removed. Available slots: " + slot;
    }

    //Overriding the method of AiModel
    @Override
    public String displayInfo()
    {
        return super.displayInfo() + 
               "Available Team Slots: "+ slot;
    }
}