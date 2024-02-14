package iterator;
import java.util.Iterator;

/**
 * This class implements the Iterator interface in regards to a TaskList and the information that a 
 * TaskList holds.
 * @author Alayna Wybranski
 * @version 1.0
 */
public class TaskListIterator implements Iterator{
    private Ticket[] tickets;
    private int position;

    /**
     * This is the constructor for the class. It populates the tickets array with the
     * array thatwas inputted when it was called, and the position int with zero.
     * @param tickets
     */
    public TaskListIterator(Ticket[] tickets){
        this.tickets = tickets;
        position = 0;
    }

    /**
     * This method will check if the tickets array is still in range and if it is not null.
     * @return a boolean to say that it has a valid value next.
     */
    public boolean hasNext(){
        return position < tickets.length && tickets[position] != null;
    }

    /**
     * This method will return the next ticket in the tickets array. It will then increase the position by one.
     * @return a ticket, the next one in the array
     */
    public Ticket next(){
        if(hasNext())
            return tickets[position++];

        return null;
    }
}
