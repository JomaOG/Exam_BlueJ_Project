
/**
 * Write a description of class AgeCalculator here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class AgeCalculator
{
    // instance variables - replace the example below with your own
    private int currentYear = 2025;

    /**
     * Constructor for objects of class AgeCalculator
     */
    public AgeCalculator()
    {
        
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int canDrive(int yearOfBirth)
    {
        int canDrive = currentYear - yearOfBirth;
        if(canDrive >= 18) {
            System.out.println("Can Drive");
        } else {
            System.out.println("Cannot Drive");
        }
        return canDrive;
    }
}
