package decorator;
/**
 * This class is a child of the PlayerDecorator class and creates a version of a Warrior that will add armor to the graphic shown when run.
 * @author Alayna Wybranki
 * @version 1.0
 */
public class Armor extends PlayerDecorator{

    /**
     * This is the constructor for the Armor class. 
     * It sends the player that is inputed to the parent class and 
     * then calls the integrateDecor method to read the armor file and sadd the armor to the warrior image.
     * @param player the player thats graphic will be manipulated to add armor.
     */
    public Armor(Player player){
        super(player);
        integrateDecor(FileReader.getLines("decorator/txt/armor.txt"));
    }
}
