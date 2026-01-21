package W9;


/**
 * Write a description of class Main here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Main
{
    public static void main(String[] args)
    {
        Car c1 = new Car(1, "BMW", 100000, 4, "Gasoline");
        Bike b1 = new Bike(2, "YAMAHA", 200000, 300);
        
        System.out.println("For Car");
        c1.displayCarDetails();
        c1.calculateTax();
        c1.calculateFinalPrice();
        
        
        System.out.println("For Bike");
        b1.displayVehicleInfo();
        b1.calculateTax();
        b1.calculateFinalPrice();
    }
}