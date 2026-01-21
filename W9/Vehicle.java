package W9;


/**
 * Write a description of class Vehicle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Vehicle
{
    protected int vehicleid;
    protected String brandName;
    protected double basePrice;
    
    public Vehicle(int vehicleid, String brandName, double basePrice)    {
        this.vehicleid= vehicleid;
        this.brandName= brandName;
        this.basePrice= basePrice;
    }
    
    public void displayVehicleInfo()
    {
        System.out.println("Vehicle Id: "+ this.vehicleid);
        System.out.println("Vehicle brand "+ this.brandName);
        System.out.println("Vehicle basePrice: "+ this.basePrice);
    }
    
    public double calculateTax()
    {
        return basePrice*0.10;
    }
}