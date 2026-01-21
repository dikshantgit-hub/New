package W11;


/**
 * Write a description of class Rectangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rectangle extends Shape implements Drawable
{
    private double length;
    private double width;
    
    //constrant
    public Rectangle(double len, double wid)
    {
        this.length= len;
        this.width= wid;
    }
    
    @Override
    public double calculateArea()
    {
        return length * width;
    }
    
    @Override 
    public double calculatePerimeter()
    {
        return 2 * (length + width);
    }
    
    @Override
    public void draw()
    {
        System.out.println("Drawing a circle");
    }
}