/**
 * Write a description of class Bonus here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Bonus
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Bonus
     */
    public Bonus()
    {
        // initialise instance variables
        x = 0;
    }

    public void formatCountry(String country) {
        System.out.println(country.substring(0,1).toUpperCase()
            +country.substring(1).toLowerCase() + " ("
            +country.substring(0,3).toUpperCase() +")");
    }
}
