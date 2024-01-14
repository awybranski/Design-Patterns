package strategy;
/**
 * @author Alayna Wybranski
 * @version 1.0
 * interface for Offensive Beahviors that will be implemented further
 */
public interface OffenceBehavior {
   
    /**
     * @param play will be called from Player class and describes the players actions, focusing on offense
     * @return a string regarding the Player's action
     * 
     */
    public String play();
}
