package observer;
import java.util.ArrayList;

/**
 * This class implements the Subject interface. This class will be seen as the subject of the program, 
 * all information and observations will be made about an instance of a cook.
 * @author Alayna Wybranski
 * @version 1.0
 */
public class Cook implements Subject {
    private ArrayList<Observer> observers;
    private String name;

    /**
     * This is a constructor method for the class cook. creates a cook with a name and 
     * then creates an Array list of observers that will be watching the cook.
     * @param name the name of the the cook.
     */
    public Cook(String name){
        this.name = name;
        observers = new ArrayList<Observer>();
    }

    /**
     * This method adds an observer to the ArrayList of observers this class is holding.
     * @param observer another class that is 'observing' the subject - the cook.
     */
    public void registerObserver(Observer observer){
        observers.add(observer);
    }

    /**
     * this method removes an observer from the ArrayList of observers.
     * @param observer another class that is 'observing' the subject - the cook.
     */
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    /**
     * this method lets the observers know that there was a new sighting of the subject 
     * and calls the method update on all the observers.
     * @param location the location of where the subject, the cook, was seen
     * @param description the description of the what was going on at the location.
     * @param accomplices the people the subject was seen with.
     */
    public void notifyObservers(String location, String description, ArrayList<String> accomplices){
        for(Observer observer : observers) {
            observer.update(location, description, accomplices);
        }
    }

    /**
     * This method is called when the subject is seen. 
     * It populates the arraylist of accomplices and calls the notify observers 
     * method so that the observers will be updated.
     * @param location the location of where the subject, the cook, was seen.
     * @param description the description of what the subject was doing.
     * @param accomplices the poeple that the subject was with.
     */
    public void enterSighting(String location, String description, String accomplices){
        ArrayList<String> people = new ArrayList<String>();
        people.add(accomplices);
        notifyObservers(location, description, people);
    }

    /**
     * method to return the name of the subject.
     * @return returns the subjects name.
     */
    public String getName(){
        return name;
    }
}
