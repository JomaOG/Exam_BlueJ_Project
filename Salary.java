
/**
 * Write a description of class Salary here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Salary
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Salary
     */
    public Salary()
    {
        // initialise instance variables
        x = 0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void getSalary(double hours, double wage)
    {
        // put your code here
        double totalSalary = hours * wage;
        double tax = 1-0.3;
        double netPay = totalSalary * tax;
        System.out.println("Net Pay is : " +netPay);
    }
}
