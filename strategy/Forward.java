package strategy;

/**
 * @author Alayna Wybranski
 * @version 1.0
 * child of Player class that gives characteristics focusing on a Forward Player
 */
public class Forward extends Player{
    
    /**
     * @param Forward creates an instance of the parent class that regards the player to the position of a Forward.
     */
    public Forward(String firstName, String lastName) {
        super(firstName, lastName);
        setOffenceBehavior();
        setOffenceBehavior();
    }

    /**
     * @param setOffenceBehavior randomizes the players offensive actions.
     * 50/50 chance that the player will either pass or shoot while on offense.
     */
    public void setOffenceBehavior(){
        if(rand.nextInt(2)==0)
            offenceBehavior = new PassBeahvior();
        else
            offenceBehavior = new ShootBehavior();
    }

    /**
     * @param setDefenceBeahvior randomizes the players defensive actions
     * 50/50 chance that the player will either chase the puck or block while on denfense
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
    public String toString() {
        return super.toString() + " plays the position: Forward";
    }
}
