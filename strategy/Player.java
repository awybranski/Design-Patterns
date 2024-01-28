package strategy;

import java.util.Random;
/** 
 * This class creates an abstract Player that will be extended by other classes.
 * @author Alayna Wybranski
 * @version 1.0
 */
public abstract class Player {
    private String firstName;
    private String lastName;
    protected DefenceBehavior defenceBehavior;
    protected OffenceBehavior offenceBehavior;
    protected Random rand = new Random();

    /** Creates a player with given information:
     * @param firstName is the Player's first name
     * @param lastName is the Player's last name
     */
    public Player(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
        //Should have called setOffence/Deffence behavior here
    }

    /**  @param setDefenceBavior public method that sets the player's defensive actions/beahviors.
     * This is abstract because it will be used in the child classes 
     */
    public abstract void setDefenceBehavior();

    /** @param setOfenceBehavior public method that sets the player's offesive actions/beahviors.
     * This is abstract because it will be used in the child class.
     */
    public abstract void setOffenceBehavior();

    /** @param play public method that will call the Player's defensive/ofensive actions based on boolean given
     * @return the action the player is commiting determined on if on offense or defense
    */
    public String play(boolean play) {
        if(play){
            setOffenceBehavior();
            return offenceBehavior.play();
        }
        else{
            setDefenceBehavior();
            return defenceBehavior.play();
        }
    }

    /** 
     * @return the Player's first and last names
     */
    public String toString() {
        return this.firstName + " " + this.lastName;
    }
}
