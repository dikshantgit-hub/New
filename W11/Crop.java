package W11;


/**
 * Write a description of class Crop here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Crop
{
    protected String cropName;
    protected String season;
    protected double landArea;
    
    public Crop(String CN, String sea, double LA)
    {
        this.cropName= CN;
        this.season= sea;
        this.landArea= LA;
    }
    
    public abstract double calculateYield();
    
    public abstract double calculateWaterRequirement();
    
    public void displayCropInfo()
    {
        System.out.println("Yield: "+ calculateYield());
        System.out.println("Water Requiement: "+ calculateWaterRequirement());
        System.out.println("Crop Name: "+ cropName);
        System.out.println("Season: "+ season);
        System.out.println("Land Area: "+ landArea);
    }
}