package strategy;
/**
 * @author Alayna Wybranski
 * @version 1.0
 * implements the defense interface focusing of chasing the puck
 */
public class ChasePuckBehavior implements DefenceBehavior{
    
    /** 
     * @param play called from Player class and gives information on what the player is doing
     * @return the players action, chasing the puck
     */
    public String play() {
        return "Chases the puck";
    }
}
