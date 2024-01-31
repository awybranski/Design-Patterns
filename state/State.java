package state;
import java.util.ArrayList;
import java.util.Random;

/**
 * This class creates State class that can not be implemented in the driver because it is abstract.
 * It holds the name and the arrayList of strings for the child states. This class will be used by the SpellingList class
 * by using the state class to change grades and words throughout the program. 
 * @author Alayna Wybranski
 * @version 1.0
 */
public abstract class State {
    protected SpellingList spellingList;
    protected ArrayList<String> words;
    private Random rand;

    /**
     * This is the constructor method for the class state. It finishes 
     * constructing the spellingList, ArrayList, and random that it holds.
     * @param spellingList is the class that will be implementing the states that have been created.
     */
    public State(SpellingList spellingList){
        this.spellingList = spellingList;
        this.words = new ArrayList<String>();
        rand = new Random();
    }

    /**
     * This class gets the next random word in the arrayList of words and then prints it out.
     * @return a string that it recieved from the ArrayList and prints it out to the driver.
     */
    public String getNextWord(){
        String word = words.get(rand.nextInt(words.size()));
        return word;
    }

    /**
     * An abstract method that will be urther implemented in the child classes.
     * It will increase the current state.
     */
    public abstract void increaseGrade();

    /**
     * An abstract method that will be further implementes in the child classes.
     * It will decrease the current state.
     */
    public abstract void decreaseGrade();
}
