package Week8;


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
        Calculator calc = new Calculator();
        
        //instance return type, no parameter
        
        calc.displayInfo();
        calc.add(10,20); // actual parameters
        
        int fixNum = calc.getFixedNumber();
        
        System.out.println("The fix number is: " + fixNum);
        
        System.out.println("The multiplication of two number are: " + calc.multiply(10,20));
        
        // invocation of static method --> use class name 
        int sqr = Calculator.square(10);
        System.out.println("The square is: " + sqr);
        
        // Student obj
        
        Student St1 = new Student("Dikshant", 67);
    
}
}