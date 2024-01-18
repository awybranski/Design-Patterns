package observer;
import java.util.ArrayList;

/**
 * This class will be used by the cartel class. it will hold more organized information for the cartel class to hold.
 * It will have a strings for locations and details and an arraylist for the accomplices.
 * @author Alayna Wybranski
 * @version 1.0
 */
public class Sighting {
    private String location;
    private String details;
    private ArrayList<String> accomplices;

    /**
     * This is the constructor method for the Sighting class. It will be given information regarding what the subjet was doing at the specific sighting.
     * It will then populate the private objects of the class with the infrmation passed through.
     * @param location the locations of where the subject, the cook, was seen.
     * @param details the details of what the subject was seen doing.
     * @param accomplices the people the subject was seen with at that specfic sighting.
     */
    public Sighting(String location, String details, ArrayList<String> accomplices){
        this.location = location;
        this.details = details;
        this.accomplices = accomplices;
    }

    /**
     * This method will be an accessor for the private data memeber location.
     * @return the location the subject was seen at.
     */
    public String getLocation(){
        return this.location;
    }

    /**
     * This method will be an accessor for the private data member details.
     * @return the details of what the subject was seen doing.
     */
    public String getDetails(){
        return this.details;
    }

    /**
     * This method will be an accessor for the private data memeber accomplices.
     * @return the people that the subject was seen with.
     */
    public String getAccomplices(){
        String returnString = "";
        for(int i = 0; i < accomplices.size(); i++){
            returnString = returnString + accomplices.get(i);
        }
        return returnString;
    }
}
