package W11;


/**
 * Write a description of class Main1 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main1
{
    public static void main(String[] args)
    {
        Shape[] shapes = new Shape[2];
        shapes[0] = new Rectangle(2, 2);
        shapes[1] = new Circle(3);
        
        for (Shape shape: shapes)
        {
            shape.displayShapeInfo();
        {
            ((Drawable) shape).draw();
        }
    }
}
}