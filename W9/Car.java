package W9;


/**
 * Write a description of class Car here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Car extends Vehicle
{
    private int doors;
    private String fuelType;
    
    public Car(int vehicleid, String brandName, double basePrice, int doors, String fuelType)
    {
        super(vehicleid, brandName, basePrice);
        this.doors= doors;
        this.fuelType= fuelType;
    }
    
    public double calculateFinalPrice()
    {
        return super.basePrice + super.calculateTax()+ 0.05 * super.basePrice;
    }
    
    public void displayCarDetails()
    {
        super.displayVehicleInfo();
        double finalPrice= this.calculateFinalPrice();
        System.out.println("Number of doors: " + this.doors);
        System.out.println("Fuel Type is: " + this.fuelType);
        System.out.println("The final price of the car is: " + finalPrice);
    }
}