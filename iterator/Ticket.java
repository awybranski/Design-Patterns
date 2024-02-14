package iterator;

/**
 * This class creates an instance of a ticket. A ticket will be the task name, the person doing the task, and the difficulty of
 * the task. This class will be used by the TastList class and TaskListIterator class.
 * @author Alayna Wybranski
 * @version 1.0
 */
public class Ticket {
    private String name;
    private String teamMember;
    private int difficulty;

    /**
     * This class is the constructor for the Ticket class and it will populate the variables held within 
     * with the data entered when the method was called.
     * @param name the name of the ticket (or the task being performed)
     * @param teamMember the team member that is completing the ticket
     * @param difficulty the levl of difficulty tht the ticket is
     */
    public Ticket(String name, String teamMember, int difficulty){
        this.name = name;
        this.teamMember = teamMember;
        this.difficulty = difficulty;
    }

    /**
     * Is a accessor method for the name data member
     * @return the name of the ticket (or the task being performed)
     */
    public String getName(){
        return name;
    }

    /**
     * This is the toString method for the class. It will create a string and return it to the method that called it.
     * @return a string of all revelant data pertaining to the ticket.
     */
    public String toString(){
        String output = name + "(" + difficulty+") - " + teamMember;
        return output;
    }
}
