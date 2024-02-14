package iterator;
import java.util.Iterator;

/**
 * This class will create a TaskList. It will hold the tickets and all of the information within them. 
 * It will be utilzed by the SCRUMBoard class.
 * @author Alayna Wybranski
 * @version 1.0
 */
public class TaskList {
    private Ticket[] tickets;
    private int count;
    private String name;

    /**
     * This is the construcot method for the TaskList class. It will populate the name of the
     * TaskList, set the count to zero, and create the tickets array.
     * @param name what the taskList will be called.
     */
    public TaskList(String name){
        this.name = name;
        count = 0;
        tickets = new Ticket[100];
    }

    /**
     * This method will add a Ticket to the taskList. It will first have to create the ticket
     * and then it will populate the array at the count index and then increase the count by one.
     * @param name the name of the task/ticket being created.
     * @param teamMember the team member that will complete the ticket
     * @param difficulty the level of difficulty of the ticket
     */
    public void addTicket(String name, String teamMember, int difficulty){
       Ticket newTicket = new Ticket(name, teamMember, difficulty);
       if(count < tickets.length){
            tickets[count] = newTicket;
            count++;
       }
       else{
            System.out.println("System Error - you have exceeded the amount for the list");
       }
    }

    /**
     * This will add an already created ticket, one that came from another TaskList, and add it to the 
     * this array of tickets. It will populate the array at the index count and then increase count by one.
     * @param ticket the ticket being moved from antoher taskList to this one
     */
    public void addTicket(Ticket ticket){
        if(count < tickets.length && ticket != null){
            tickets[count] = ticket;
            count++;
        }
        else{
            System.out.println("System Error - you have exceeded the amount for the list");

        }
    }

    /**
     * This method will return a ticket to where this function was called from. It will then delete the 
     * ticket and if there are tickets after it, it will move them so there are no gaps in the array.
     * @param name the name of the task/ticket that we are searching for
     * @return the ticket that matched the String inputted
     */
    public Ticket getTicket(String name){
        Ticket holder = null;
        for(int i = 0; i < count; i++){
            if(tickets[i] != null && tickets[i].getName().equalsIgnoreCase(name)){
                holder = tickets[i];
                count--;
            }
            if(holder != null){
                tickets[i] = tickets[i+1];
                tickets[i+1] = null;
            }
        }

        return holder;
    }

    /**
     * This method will tell me if the TaskList conatins a specific ticket in its array of tickets.
     * @param name the name of the task/ticket that we are searching for.
     * @return true if the ticket is in the array and false if it is not.
     */
    public boolean contains(String name){
        for (Ticket ticket : tickets) {
            if(ticket != null && ticket.getName().equalsIgnoreCase(name))
                return true;
        }
        return false;
    }

    /**
     * This method will create a TaskListIterator with the array of tickets as its input.
     * @return the created TaskListIterator
     */
    public TaskListIterator createIterator(){
        return new TaskListIterator(tickets);
    }
 
    /**
     * This method will call the creatorIterator method and then use that iterator to create a string that
     * will have all the information of the taskList in it.
     * @return the string created.
     */
    public String toString(){
        TaskListIterator list = createIterator();
        String output = name + "\n";
        while(list.hasNext()){
            output += "- " + list.next() + "\n";
        }
        return output;
    }
}
