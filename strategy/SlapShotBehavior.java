package strategy;
/**
 * @author Alayna Wybranski
 * @version 1.0
 * lass that implements the Offensive Behaviors interface, focusing on slap shots
 */
public class SlapShotBehavior implements OffenceBehavior{
 
    /**
     * @param play is called from player class and prints the player's shooting behaviors
     * @return will return the players action, "shoots the puck from the blue line".
     */
    public String play() {
        return "Shoots the puck from the blue line";
    }
}
