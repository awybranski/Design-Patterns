package strategy;
/**
 * @author Alayna Wybranski
 * @version 1.0
 * interface for defensive behaviors that will be futher implemented
 */
public interface DefenceBehavior {
    /**
     * @param play will be called from Player class and describes the players actions, focusing on defense
     * @return a string regarding the Player's action
     */
    public String play();
}
