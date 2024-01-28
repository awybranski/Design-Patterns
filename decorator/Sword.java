package decorator;

/**
 * This class is a child of the PlayerDecorator class creates a version of a Warrior that will add a sword to the graphic printed when run.
 * @author Alayna Wybranski
 * @version 1.0
 */
public class Sword extends PlayerDecorator{

    /**
     * This is the constructor for the Sword class. 
     * It sends the player that is inputed to the parent class and 
     * then calls the integrateDecor method to read the sword file and add the sword to the warrior image.
     * @param player the player thats graphic will be manipulated to add a sword.
     */
    public Sword(Player player){
        super(player);
        integrateDecor(FileReader.getLines("decorator/txt/sword.txt"));
    }
}
