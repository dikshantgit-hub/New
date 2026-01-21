package Week8;


/**
 * Write a description of class ShoppingCartmain here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ShoppingCartmain
{
    public static void main(String[] args)
    {
        ShoppingCart s1= new ShoppingCart("Pringles",200,5);
        s1.setQuantity(2);
        System.out.println("Current quantity is: "+ s1.getQuantity());
        System.out.println("Total price is: "+ s1.calculateTotal());
        double discount = 100;
        System.out.println("Total price after discount is: "+ s1.calculateTotal());
        s1.displayCart();
    }
}