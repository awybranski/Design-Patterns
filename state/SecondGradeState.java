package state;

/**
 * This class is specific to the State of a second grader's reading level. This class will be called to update the state
 * that the spellingList class is holding and give the words for the user to read.
 * @author Alayna Wybranski
 * @version 1.0
 */
public class SecondGradeState extends State{
   
    /**
     * This is the constructor method for the class SecondGradeState. It creates calls the super
     * constructor for the State parent class and then updates the ArrayList words to hold the 
     * second grade words by using the File Reader class.
     * @param spellingList is the class that will be implementing the states that have been created.
     */
    public SecondGradeState(SpellingList spellingList){
        super(spellingList);
        words = FileReader.getWords("state/txt/second.txt");
    }

    /**
     * This method will change the state by increasing the state to third grade.
     * It prints out that it is moving to the third grade and then calls the set state 
     * method on the spellingList class to change the state held there to the third grade.
     */
    public void increaseGrade(){
        System.out.println("Moving to Third Grade...");
        spellingList.setState(spellingList.getThirdGradeState());
    }

    /**
     * This method will change the state by decreasing the state to first grade.
     * It prints out that it is moving to the first grade and then calls the set state 
     * method on the spellingList class to change the state held there to the first grade.
     */
    public void decreaseGrade(){
        System.out.println("Moving to First Grade...");
        spellingList.setState(spellingList.getFirstGradeState());
    }

}
