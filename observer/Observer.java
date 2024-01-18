package observer;
import java.util.ArrayList;

/**
 * This is an interface that will be implemented by other classes. 
 * It gives the methods that are specific to the Observers, who are observing the subject.
 * @author Alayna Wybranski
 * @version 1.0
 */
public interface Observer {
    /**
     * This method will update the notes of the observer so that they can keep track of the subject.
     * @param location the location of where the subject, the cook, was seen.
     * @param description the description of what the subject was seen doing.
     * @param accomplices the poeple that the subject was seen with.
     */
    public void update(String location, String description, ArrayList<String> accomplices);

    /**
     * This method will print out the notes that the observer is keep. 
     * The notes are specific to the class that is implementing them.
     * @return it will return the notes of the observers, depedning on their specific type of notes.
     */
    public String getLog();
}
