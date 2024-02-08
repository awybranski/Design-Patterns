package decorator;
import java.util.ArrayList;

/**
 * This class creates an abstract player. 
 * It will hold the name and image of the player that will be manipulated and changed in other classes.
 * @author Alayna Wybranski
 * @version 1.0
 */

public abstract class Player {
    protected String name;
    protected ArrayList<String> lines;

    /**
     * This class constructs a Player. It creates the class' private arrayList.
     * It then sets the class arrayList to equal the one inputed by the user.
     * It also makes the String name for the class equal to the string inputed.
     * @param lines Arraylist that will hold the strings that will create the image of the warrior.
     * @param name the name of the warrior.
     */
    public Player(ArrayList<String> lines, String name){
        this.name = name;
        this.lines = new ArrayList<String>();
        this.lines = lines;
    }

    /**
     * This is an accessor for the protected data member name;
     * @return the name of the warrior.
     */
    public String getName(){ 
        return this.name;
    }

    /**
     * This is a toString method. It will loop through the arrayList 
     * and add it to a string that will hold the image of the warrior.
     * @return a string, the image of our warrior, with or without the modifications.
     */
    public String toString(){
        String output = "#### " + name + " ####\n";

        for(int i = 0; i < lines.size(); i++){
            output += lines.get(i) + "\n";
        }
        return output;
    }

}
