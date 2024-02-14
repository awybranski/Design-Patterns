package iterator;

/**
 * This class will create 3 types of the taskList classes and store information in them. It will then move
 * the information throughout the tasklists when the user inputs to do so.
 * @author Alayna Wybranski
 * @version 1.0
 */
public class SCRUMBoard {
    private String projectName;
    private TaskList todo;
    private TaskList doing;
    private TaskList done;

    /**
     * This is the constructor method for the class. It will populate the string with the name
     * and create the taskLists.
     * @param projectName the string that will be the SCRUMBoard's name
     */
    public SCRUMBoard(String projectName){
        this.projectName = projectName;
        todo = new TaskList("ToDo");
        doing = new TaskList("Doing");
        done = new TaskList("Done");
    }

    /**
     * This method will add a ticket to the ToDo TaskList.
     * @param name the name of the task being created
     * @param teamMember the name of the team member that will complete the task
     * @param difficulty the level of difficulty of the task
     */
    public void addTicket(String name, String teamMember, int difficulty){
        todo.addTicket(name, teamMember, difficulty);
    }

    /**
     * This method will move a ticket from the ToDo Tasklist to the Doing TaskList.
     * It will check to make sure that the ticket was removed from the ToDo TaskList and
     * that the Doing TaskList now holds it.
     * @param name the name of the task that is being moved.
     * @return return a boolean based on if it was moved.
     */
    public boolean startTicket(String name){
         doing.addTicket(todo.getTicket(name));
        if(doing.contains(name) && !todo.contains(name))
            return true;

        return false;
    }

    /**
     * This method will move a ticket from the Doing Tasklist to the Done TaskList.
     * It will check to make sure that the ticket was removed from the Doing TaskList and
     * that the Done TaskList now holds it.
     * @param name the name of the task that is being moved.
     * @return return a boolean based on if it was moved.
     */
    public boolean finishTicket(String name){
         done.addTicket(doing.getTicket(name));
         if(done.contains(name) && !doing.contains(name))
            return true;

        return false;
    }

    /**
     * This method will concatenate all of the information of the TaskLists and Tickets to one string
     * that will be returned to the console.
     * @return a string of all the information regarding the taskLists.
     */
    public String toString(){
        String output = "*****" + projectName + "*****\n" + todo + "\n" + doing + "\n" +done;
        return output;
    }
}
