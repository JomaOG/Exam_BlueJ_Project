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
    private ArrayList<Bird> zooBirds;
    public Zoo() {
        zooBirds = new ArrayList<>();
        zooBirds.add(new Bird("blue", "BlueJay", 2));
    }
    
    int countBlueBirds() {
        int count = 0;
        for(Bird color : zooBirds) {
            if(color.getColor().equals("blue")){
                count++;
            }
        }
        return count;
    }
}


