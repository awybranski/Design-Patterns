package decorator;

/**
 * This class is a child of the PlayerDecorator class and creates a version of a Warrior that will add a shield to the graphic printed when run.
 * @author Alayna Wybranski
 * @version 1.0
 */
public class Shield extends PlayerDecorator{

    /**
     * This is the constructor for the Shield class. 
     * It sends the player that is inputed to the parent class and 
     * then calls the integrateDecor method to read the shield file and add the shield to the warrior image.
     * @param player the player thats graphic will be manipulated to add a shield.
     */
    public Shield(Player player){
        super(player);
        integrateDecor(FileReader.getLines("decorator/txt/shield.txt"));
    }
}
