/**
 * This class creates and holkds information regarding a word. 
 * It will hold its defintition, type and sentence as well as the word itself.
 * @author Alayna Wybranski
 * @version 1.0
 */
public class Word {
    private String word;
    private String type;
    private String definition;
    private String sentence;

    /**
     * This method is the constructor for the Word class. 
     * It will take in parameters and set the data members equal to what is entered.
     * @param word the word that the information is regarding
     * @param type the type of word it is (noun, verb, adj, etc)
     * @param definition the defintion of the word
     * @param sentence the sentence that is using the word
     */
    public Word(String word, String type, String definition, String sentence){
        this.word = word;
        this.type = type;
        this.definition = definition;
        this.sentence = sentence;
    }

    /**
     * This method returns the word for the console.
     * @return a string, the word the instance of the class is about
     */
    public String getWord(){
        return this.word;
    }

    /**
     * This class returns all information that we know about the word to the console.
     * @return a string regarding the information for the word (the type, defintion, and sentence)
     */
    public String getDescription(){
        String returnString = "Part of Speech: " + this.type + "\nDefinition: " + this.definition + "\n" + this.sentence;
        return returnString;
    }
}
