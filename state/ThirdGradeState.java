package state;

/**
 * This class is specific to the State of a third grader's reading level. This class will be called to update the state
 *  that the spellingList class is holding and give the words for the user to read.
 * @author Alayna Wybranski
 * @version 1.0
 */
public class ThirdGradeState extends State{
    
    /**
     * This is the constructor method for the class ThirdGradeState. It creates calls the super
     * constructor for the State parent class and then updates the ArrayList 'words' to hold the 
     * third grade words by using the File Reader class.
     * @param spellingList is the class that will be implementing the states that have been created.
     */
    public ThirdGradeState(SpellingList spellingList){
        super(spellingList);
        words = FileReader.getWords("state/txt/second.txt");
    }

    /**
     * This method is supposed to change the state by increasing it, however, the third grade is the 
     * highest state that we can go. Because of this, it will just print out a message stating that
     * you can't increase the grade level.
     */
    public void increaseGrade(){
        System.out.println("Sorry, we currently only have up to third grade in our system...");
    }

    /**
     * This method will change the state by decreasing the state to second grade.
     * It prints out that it is moving to the second grade and then calls the set state 
     * method on the spellingList class to change the state held there to the second grade.
     */
    public void decreaseGrade(){
        System.out.println("Moving to Second Grade...");
        spellingList.setState(spellingList.getSecondGradeState());
    }

}
