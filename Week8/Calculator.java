package Week8;


/**
 * Write a description of class Calculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Calculator
{
    //Instance method 
    
    //void return type + no parameters
    
    public void displayInfo()
    {
        System.out.print("Welcome to Calculator App.");
    }
    
    // void return type + parameters
    
    // Method overloading
    
    public void add(int a, int b) // formal parameters
    {
        System.out.println("The sum of two numbers are: " + (a+b));
    }
    
    public void add(double a, double b) 
    {
        System.out.println("The sum of two numbers are: " + (a+b));
    }
    
    public void add(int a, int b, int c) 
    {
        System.out.println("The sum of two numbers are: " + (a+b+c));
    }
    
    public void add(double a, double b, double c) 
    {
        System.out.println("The sum of two numbers are: " + (a+b+c));
    }
    // return type + no parameters
    
    public int getFixedNumber()
    {
        return 10;
    }
    
    // return type + parameters
    
    public int multiply(int a, int b) //formal parameters 
    {
        return a * b;
    }
    
    // static method 
    
    public static int square(int x)
    {
        return x*x;
    }
}