package strategy;

import java.util.Random;
/** 
 * @author Alayna Wybranski
 * @version 1.0
 * implements the interface the Defense and Ofense interface, focusing on blocking the goal beahviors
 */
public class BlockGoalBehavior implements DefenceBehavior, OffenceBehavior{
    
    /**
     * @param play is called from player class and will randomize the Player's blocking behaviors, specifically the goalie.
     * @return will return the players action.
     */
    public String play() {
        Random rand = new Random();
        if(rand.nextInt(4)==0)
            return "hand blocks the puck";
        else if(rand.nextInt(4)==0)
            return "catches the puck";
        else if(rand.nextInt(4)==0)
            return "blocks puck with knew pads";
        else 
            return "blocks puck with stick";

        // could have made a string array and returned it based on length of array with random
    }
}
