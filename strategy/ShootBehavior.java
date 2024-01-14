package strategy;
/**
 * @author Alayna Wybranski
 * @version 1.0
 * class that implements the Offensive Behaviors interface, focusing on shooting
 */
public class ShootBehavior implements OffenceBehavior{
    /**
     * @param play is called from player class and prints the player's shooting behaviors
     * @return will return the players action, "shoots at the goal".
     */
    public String play() {
        return "Shoots at the goal";
    }
}
