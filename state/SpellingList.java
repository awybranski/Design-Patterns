package state;

/**
 * This class will move through the states for the Spelling Program. It will hold the information
 * that is specific to each state, the ArrayList of words that will be printed out for the user.
 * @author Alayna Wybranski
 * @version 1.0
 */
public class SpellingList {
    
    private State state;
    private FirstGradeState firstGradeState;
    private SecondGradeState secondGradeState;
    private ThirdGradeState thirdGradeState;

    /**
     * This is the constructor method for the SpellingList class. It finishes 
     * constructing each of the states by putting this class in the state constructor calls.
     * It then assigns the staring state to first grade because that is the lowest that we can be.
     */
    public SpellingList(){
        firstGradeState = new FirstGradeState(this);
        secondGradeState = new SecondGradeState(this);
        thirdGradeState = new ThirdGradeState(this);
        this.state = firstGradeState;
    }

    /**
     * This method calls the current state's getNextWord to get a random word from it's ArrayList of words.
     * @return a string that it recieved from the current states ArrayList and prints it out to the driver.
     */
    public String getNextWord(){
        return state.getNextWord();
    }

    /**
     * This method calls the current state's increaseGrade method to change to the above state.
     */
    public void increaseGrade(){
        state.increaseGrade();
    }

    /**
     * This method calls the current state's decreaseGrade method to change to the below state.
     */
    public void decreaseGrade(){
        state.decreaseGrade();
    }

    /**
     * This method is an accessor to the SpellingList's firstGradeState and the information that is held within.
     * @return the firstGradeState that the SpellingList class currently holds
     */
    public State getFirstGradeState(){
        return this.firstGradeState;
    }

    /**
     * This method is an accessor to the SpellingList's secondGradeState and the information that is held within.
     * @return the secondGradeState that the SpellingList class currently holds.
     */
    public State getSecondGradeState(){
        return this.secondGradeState;
    }

    /**
     * This method is an accessor to the SpellingList's thirdGradeState and the information that is held within.
     * @return the thirdGradeState that the SpellingList class currently holds.
     */
    public State getThirdGradeState(){
        return this.thirdGradeState;
    }

    /**
     * This method will change the current state that the SpellingList class is currently in. It will
     * be called from the child classes of State in their increase/decrease Grade methods to change the state.
     * @param state The state that SpellingList will be change to.
     */
    public void setState(State state){
        this.state = state;
    }
}
