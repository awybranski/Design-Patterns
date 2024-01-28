package decorator;
import java.util.ArrayList;

/**
 * This class is a child of the Player class. It will be a player, while also holing an instance of a player.
 * This class will decorate the Warrior image with what the user wants: sword, shield, armor.
 * @author Alayna Wybranski
 * @version 1.0
 */
public abstract class PlayerDecorator extends Player{
    private Player player;
    
    /**
     * This is a constructor for the Player Decorator class. It calls the super for the parent class, Player.
     * It also makes the private data member, player, equal to the player that was inputed.
     * @param player an instance of a warrior, the image that will be printed.
     */
    public PlayerDecorator(Player player){
        super(player.lines, player.getName());
        this.player = player;
    }

    /**
     * The method will add the decor to the warrior image. It will loop through both arrays and add any
     * characters to a string that will replace the current one at that spot.
     * @param decor an arrayList of strings, decor, that will be added to the warrior image.
     */
    protected void integrateDecor(ArrayList<String> decor){
        String string = "";

        for(int i = 0; i < player.lines.size(); i++){
            for(int k = 0; k < player.lines.get(i).length(); k++){
                    if(decor.get(i).length() > k && ' ' != decor.get(i).charAt(k)){
                        string += decor.get(i).charAt(k);
                    }
                    else{
                        string += player.lines.get(i).charAt(k);
                    }
            }
            if(decor.get(i).length() > player.lines.get(i).length()){
                String holder = decor.get(i).substring(player.lines.get(i).length(), decor.get(i).length());
                string += holder;
            }
            
            player.lines.set(i, string);
            string = "";
        }
    }
}
