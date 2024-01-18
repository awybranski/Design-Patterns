package observer;
import java.util.ArrayList;

/**
 * This class implements the interface observer. The cartel will be an observer to the subject, the cook. 
 * This class will hold all of the information that the cartel class is given regarding the subject.
 * @author Alayna Wybranski
 * @version 1.0
 */
public class Cartel implements Observer{
    private Subject cook;
    private ArrayList<Sighting> sightings;

    /**
     * This is a constructor for an instance of the cartel class. It will formulate the subject for the class, an object of the cook class.
     * it then constructs the arraylist so that it can populate throughout the program. It then registers this class as an observer to the cook. 
     * @param cook is what the cartel class is observing, is the subject of the program.
     */
    public Cartel(Subject cook){
        this.cook = cook;
        sightings = new ArrayList<Sighting>();
        cook.registerObserver(this);
    }

    /**
     * This class 'updates' the cartel class with a new sighting. It creates a new sighting object 
     * and then adds it to the ArrayList of sightings for organization.
     * @param location this is the location of where the subject, the cook, was seen.
     * @param description this is the description of what the subject was seen doing.
     * @param accomplices this is whoo the subject was seen with.
     */
    public void update(String location, String description, ArrayList<String> accomplices){
        Sighting sighting = new Sighting(location, description, accomplices);
        this.sightings.add(sighting);
    }

    /**
     * This method prints of the cartel's log of sightings of the subject. It adds all information to a string then returns that string.
     * @return it returns detailed information of where, who, and what the subject was seen doing during each sighting.
     */
    public String getLog(){
        String returnString = "";
        for(Sighting sighting : sightings){
            returnString = returnString + sighting.getLocation() + " (" + sighting.getDetails() + "), with " + sighting.getAccomplices() +"\n";
        }
        
        return returnString;
    }
}
