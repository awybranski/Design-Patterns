package state;

/**
 * This class is specific to the State of a first grader's reading level. This class will be called to update the state
 * that the spellingList class is holding and give the words for the user to read.
 * @author Alayna Wybranski
 * @version 1.0
 */
public class FirstGradeState extends State{
    
    /**
     * This is the constructor method for the class FirstGradeState. It creates calls the super
     * constructor for the State parent class and then updates the ArrayList words to hold the 
     * first grade words by using the File Reader class. 
     * @param spellingList is the class that will be implementing the states that have been created.
     */
    public FirstGradeState(SpellingList spellingList){
        super(spellingList);
        words = FileReader.getWords("state/txt/first.txt");
    }

    /**
     * This method will change the state by increasing the state to Second Grade.
     * It prints out that it is moving to second grade and then calls the set state 
     * method on the spellingList class to change the state to the second grade.
     */
    public void increaseGrade(){
        System.out.println("Moving to Second Grade...");
        spellingList.setState(spellingList.getSecondGradeState());
    }

    /**
     * This method is supposed to change the state by decreasing it, however, the first grade is the 
     * lowest state that we can go. Because of this, it will just print out a message stating that
     * you can't decrease the grade level.
     */
    public void decreaseGrade(){
        System.out.println("You can't go below First Grade...");
    }
}
