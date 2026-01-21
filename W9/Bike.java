package W9;


/**
 * Write a description of class Bike here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bike extends Vehicle
{
    private int engineCapacity;
    public Bike(int vehicleid, String brandName, double basePrice, int cc)
    {
        super(vehicleid, brandName, basePrice);
        this.engineCapacity= cc;
    }
    
    public double calculateFinalPrice()
    {
        return super.basePrice + super.calculateTax();
    }
}