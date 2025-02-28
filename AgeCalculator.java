
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


    public int canDrive(int year) {
        int age = this.currentYear - year;
        if(age>=16) {
            System.out.println("the user can drive");
        } else {
            System.out.println("You have to wait" +(16-age) +"years");
        } return age;
    }
}