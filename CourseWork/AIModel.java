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
    String modelName; 
    Double price;
    int parameter;
    String window;
    
    //Constructor
    public AIModel(String modelName, Double price, int parameter, String window)
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
    
    public Double getPrice()
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
    public void displayInfo()
    {
        System.out.println("Model Name: "+ this.modelName);
        System.out.println("Price:: "+ this.price);
        System.out.println("Parameter: "+ this.parameter);
        System.out.println("Window Size: "+ this.window);
    }
}