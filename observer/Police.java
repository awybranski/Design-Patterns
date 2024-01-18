package observer;
import java.util.ArrayList;

/**
 * This class implements the interface observer. The police will be an observer to the subject, the cook. 
 * This class will hold all of the information that the police class is given regarding the subject.
 * @author Alayna Wybranski
 * @version 1.0
 */
public class Police implements Observer{
    private Subject cook;
    private ArrayList<String> locations;
    private String notes;
    private ArrayList<String> people;

    /**
     * This method is a constructor of the class. It will formulate the subject, the cook, 
     * the String of notes, then construct both ArrayLists for the locations and people.
     * It then registers this class as an observer to the subject, the cook.
     * @param cook the subject of the program that all the information is regarding.
     */
    public Police(Subject cook){
        this.cook = cook;
        this.notes = "";
        locations = new ArrayList<String>();
        people = new ArrayList<String>();
        cook.registerObserver(this);
    }

    /**
     * This method will update the notes for the class so that the police will have accurate information regarding the subject.
     * It adds the locations, descriptions, and accomplices to the list of already known information.
     * @param location the location of where the subject, the cook, was seen.
     * @param description the description of what the subject was seen doing.
     * @param accomplices the people the subject was seen with.
     */
    public void update(String location, String description, ArrayList<String> accomplices){
        this.locations.add(location);
        this.notes = this.notes + "\n- " + description;
        String ppl = accomplices.get(0);
        String[] names = ppl.split(", ");
        boolean match;
        for(int i = 0; i<names.length; i++){
            match = false;
            for(int j = 0; j< people.size(); j++){
                if(people.get(j).equals(names[i])){
                    match = true;
                }
            }
            if(!match)
                people.add(names[i]);
        }
    }

    /**
     * This method prints of the cartel's log of sightings of the subject. It adds all information to a string.
     * @return it returns a list of where, who, and what the subject was seen doing.
     */
    public String getLog(){
        String returnString = "Locations: ";
        
        for(int i = 0; i<locations.size(); i++){
            returnString = returnString + "\n- " + locations.get(i);
        }
        returnString = returnString + "\n\nNotes: " + notes + "\n";
        returnString = returnString +"\nAccomplices:";
        
        for(int i = 0; i<people.size(); i++)
            returnString = returnString + "\n- " + people.get(i);
        
        return returnString;
    }
}
