package CourseWork;


/**
 * Write a description of class AIModel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AIModel
{
    String modelName;
    Double price;
    int parameter;
    String window;
    
    public AIModel(String modelName, Double price, int parameter, String window)
    {
        this.modelName= modelName;
        this.price= price;
        this.parameter= parameter;
        this.window= window;
    }
    
    public void displayInfo()
    {
        System.out.println("Model Name: "+ this.modelName);
        System.out.println("Price:: "+ this.price);
        System.out.println("Parameter: "+ this.parameter);
        System.out.println("Window Size: "+ this.window);
    }
}