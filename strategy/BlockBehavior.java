package strategy;

import java.util.Random;
/**
 * @author Alayna Wybranski
 * @version 1.0
 * implements the defense interface focusing on blocking actions
 */
public class BlockBehavior implements DefenceBehavior{
    
    /**
     * @param play is called from the player class which will randomize the blocking action
     * @return depending on randomization, it will return what the player is doing.
     */
    public String play() {
        Random rand = new Random();
        if (rand.nextInt(3)==0)
            return "blocks player from passing";
        else if(rand.nextInt(3)==0)
            return "blocks player from shooting";
        else
            return "checks player with puck";
    }
}
