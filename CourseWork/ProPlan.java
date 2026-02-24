package CourseWork;


/**
 * Write a description of class ProPlan here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ProPlan extends AIModel
{
    int slot;
    
    public ProPlan(String modelName, Double price, int parameter, String window, int slot)
    {
        super(modelName, price, parameter, window);
        this.slot= slot;
    }
}