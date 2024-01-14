package strategy;
/**
 * @author Alayna Wybranski
 * @version 1.0
 * child of Player class that gives characteristics of the goalie position
 */
public class Goalie extends Player{
    
    /**
     * @param Goalie constructor that creates a goalie position utilizing the parent class.
     */
    public Goalie(String firstName, String lastName) {
        super(firstName, lastName);
        setOffenceBehavior();
        setDefenceBehavior();
    }

    /**
     * @param setOffenceBehavior sets players offensive actions to block goal
     */
    public void setOffenceBehavior(){
        offenceBehavior = new BlockGoalBehavior();
    }
   
    /**
     * @param setDefenceBehavior sets player's defensive actions to block goal
     */
    public void setDefenceBehavior(){
        defenceBehavior = new BlockGoalBehavior();
    }

    /**
     * @param toString prints out the information regarding the player
     * @return parent class's toString and prints out the the postition of the player
     */
    public String toString(){
        return super.toString() + " plays the position: Goalie";
    }
}
