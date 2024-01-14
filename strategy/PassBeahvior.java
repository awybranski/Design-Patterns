package strategy;
/**
 * @author Alayna Wybranski
 * @version 1.0
 * class that implements the Offensive Behaviors interface, focusing on Passing
 */
public class PassBeahvior implements OffenceBehavior{
    
    /**
     * @param play is called from player class and prints the Player's passing behaviors
     * @return will return the players action, "passes to the forward".
     */
    public String play() {
        return "Passes to a forward";
    }
}
