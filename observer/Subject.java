package observer;
import java.util.ArrayList;

/**
 * This is an interface that will be implemented by another class. 
 * It gives the methods that are specific to the Subject, who will be observed by other classes.
 * @author Alayna Wybranski
 * @version 1.0
 */
public interface Subject {
    /**
     * This method will register an observer of the subject by adding it to the arraylist of observers.
     * @param observer an instance of the interface observer that will be holding information regarding the subject.
     */
    public void registerObserver(Observer observer);

    /**
     * This method will remove an observer of the subject by removing from the arraylist of observers.
     * @param observer an instance of the interface observer that will be holding information regarding the subject.
     */
    public void removeObserver(Observer observer);

    /**
     * This method will be implemented by another class. It will notify the observers by calling the update method on
     * each instance of the arraylist of observers that the class will hold as a private data member.
     * @param location the location of where the subject was seen.
     * @param description the description of what the subject was seen doing.
     * @param accomplices the people that the subject was seen with.
     */
    public void notifyObservers(String location, String description, ArrayList<String> accomplices);
}
