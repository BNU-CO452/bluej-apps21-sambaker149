
/**
 * This contains all the possible command words
 * for the game of Zuul
 *
 * @author Derek Peacock & Nicholas Day
 * @version 18/01/2022
 * @modified Samuel Baker
 */
public enum CommandWords
{
    GO      ("go",      "Exit location in <direction>"),
    TAKE    ("take",    "Take <item> from location"),
    ITEMS   ("items",   "List items the Player has"),
    SCORE   ("score",   "Prints the player's score and progress"),
    FINISH  ("finish",  "Submits progress when player finished"),
    HELP    ("help",    "List all available commands"),
    RESTART ("restart", "Restart the game"),
    QUIT    ("quit",    "End the game");


    public final String word;
    public final String description;
    
    CommandWords(String word, String description)
    {
        this.word = word;
        this.description = description;
    }
}
