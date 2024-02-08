import java.util.ArrayList;
import java.util.Random;

/**
 * This class will only create one instance of a FlashCard. 
 * It will hold information regarding each word and return the current word to the user to help them study.
 * @author Alayna Wybranski
 * @version 1.0
 */
public class FlashCards {
    private Random rand;
    private static FlashCards flashCards;
    private ArrayList<Word> words;
    private Word currentWord;

    /**
     * This method is the constructor for the class, however, it is privte and has no 
     * code because we will only create one instance which will be created in getInstance.
     */
    private FlashCards(){}

    /**
     * This method returns the instance of flashCards that the class itself holds. It will create/populate it
     * if flashCards is null or just return it if it is not.
     * @return the one instance of the FlashCard class
     */
    public static FlashCards getInstance(){
        if(flashCards == null){
            System.out.println("Creating Flash Cards");
            flashCards = new FlashCards();
            flashCards.words = FileReader.getWords();
            flashCards.rand = new Random();
        }
        return flashCards;
    }

    /**
     * This method will generate a random word using the rand and return it to the console.
     * @return the current word that the flashcard instance is holding.
     */
    public Word getWord(){
        int bound = flashCards.words.size();
        flashCards.currentWord = flashCards.words.get(rand.nextInt(bound)); 
        return this.currentWord;
    }
}
