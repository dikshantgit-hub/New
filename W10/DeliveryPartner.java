package W10;


/**
 * Write a description of class DeliveryPartner here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DeliveryPartner
{
    private int partnerId;
    private String name;
    private double basePay;
    
    public DeliveryPartner(int partnerId, String name, double basePay)
    {
        this.partnerId= partnerId;
        this.name= name;
        this.basePay= basePay;
    }
    
    public double calculatePayment() {
        return basePay;
    }

    @Override
    public String toString() 
    {
        return "ID: " + partnerId + "\n" +" Name: " + name;
    }
}