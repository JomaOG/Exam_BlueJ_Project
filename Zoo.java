import java.util.ArrayList;

/**
 * Write a description of class Zoo here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Zoo
{
    // instance variables - replace the example below with your own
    private int x;
    private ArrayList<Bird> zooBirds;

    /**
     * Constructor for objects of class Zoo
     */
    public Zoo()
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
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
    
    public int countBlueBirds() {
        int count = 0;
        for(Bird color : zooBirds) {
            if(color.equals("blue")) {
                count++;
            }
        }
        return count;
    }
}
