package Week8;


/**
 * Write a description of class ShoppingCart here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ShoppingCart
{
    private String itemName;
    private double itemPrice;
    private int quantity;
    
    //Constructor
    
    ShoppingCart(String itName, double itPrice, int q)
    {
        this.itemName= itName;
        this.itemPrice= itPrice;
        this.quantity= q;
    }
    
    public void setQuantity(int q)
    {
        this.quantity= q;
    }
    
    public int getQuantity()
    {
        return quantity;
    }
    public double calculateTotal(){
        return this.itemPrice*this.quantity;
    }
    
    public double calculateDiscountTotal(double discountPercent)
    {
        this.itemPrice = this.itemPrice-(discountPercent/100)*this.itemPrice;
        return this.itemPrice*this.quantity;
    }
    
    public void displayCart()
    {
        System.out.println("Item Name: "+ this.itemName);
        System.out.println("Item Price: "+ this.itemPrice);
        System.out.println("Item Quantity: "+ this.quantity);
    }
}