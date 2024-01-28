package strategy;
/**
 * @author Alayna Wybranski
 * @version 1.0
 * Is a child of Player class that gives characteristics focusing on a Defensive Player
 */
public class Defenceman extends Player{
    
    /** 
     * @param Defenceman constructor that creates a defenceman player utilizing the parent class.
     */
    public Defenceman(String firstName, String lastName) {
        super(firstName, lastName);
        setOffenceBehavior();
        setDefenceBehavior();
    }

    /**
     * @param setOffencebehavior randomizes the players offensive actions
     * 10% chance that the player will have a slap shot and 90% the player will pass
     */
    public void setOffenceBehavior(){
        if(rand.nextInt(10)==0)
            offenceBehavior = new SlapShotBehavior();
        else
            offenceBehavior = new PassBeahvior();
    }

    /**
     * @param setDefenceBeahvior randomizes the player's defensive actions
     * 50/50 chance that the player will either chance the puck or block while on defense.
     */
    public void setDefenceBehavior(){
        if(rand.nextInt(2)==0)
            defenceBehavior = new ChasePuckBehavior();
        else
            defenceBehavior = new BlockBehavior();
    }

    /**
     * @param toString prints out the information regarding the player
     * @return parent class's toString and prints out the the postition of the player
     */
    public String toString(){
        return super.toString() + " plays the position: Defenceman";
    }
}
