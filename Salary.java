
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
    public void Salary(double hours, double wagePerHour)
    {
        // put your code here
        double totalSalary = hours * wagePerHour;
        double tax = 1-0.30;
        double netSalary = totalSalary * tax;
        System.out.println("Your net pay is: " +netSalary);
    }
}
