package decorator;

/**
 * This class is a child of the Player class and creates an instance of a Warrior. 
 * It will add the image of the warrior to the arrayList held in the parent class.
 * @author Alayna Wybranski
 * @version 1.0
 */
public class Warrior extends Player{
    
    /**
     * This is a constructor for the Warrior class. It will call the super for the parent class. 
     * When calling the super, it will also call the FileReader to read the warrior file and create an ArrayList
     * for the image of the warrior that will be held in the lines data member.
     * @param name name of the Player, or warrior that is being created.
     */
    public Warrior(String name){
       super(FileReader.getLines("decorator/txt/warrior.txt"), name);
    }
}
