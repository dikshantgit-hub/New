package CourseWork;


/**
 * Write a description of class AIModel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AIModel //class name
{
    //attributes
    private String modelName; 
    private double price;
    private int parameter;
    private String window;
    
    //Constructor
    public AIModel(String modelName, double price, int parameter, String window)
    {
        this.modelName= modelName;
        this.price= price;
        this.parameter= parameter;
        this.window= window;
    }
    
    //Getter method of attributes
    public String getModelName()
    {
        return modelName;
    }
    
    public double getPrice()
    {
        return price;
    }
    
    public int getParameter()
    {
        return parameter;
    }
    
    public String getWindow()
    {
        return window;
    }
    
    //Displaying the output
    public String displayInfo()
    {
        return "Model Name: " + modelName +
           "\nPrice: " + price +
           "\nParameters: " + parameter +
           "\nContext Window: " + window;
    }
}