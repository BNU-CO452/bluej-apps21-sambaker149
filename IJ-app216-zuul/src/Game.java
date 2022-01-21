/**
 *  This class is the main class of the "World of Zuul" application.
 *  "World of Zuul" is a very simple, text based adventure game.  Users
 *  can walk around some scenery. That's all. It should really be extended
 *  to make it more interesting!
 *
 *  To play this game, create an instance of this class and call the "play"
 *  method.
 *
 *  This main class creates and initialises all the others: it creates all
 *  locations, creates the CommandReader and starts the game.
 *
 * @author  Michael Kölling and David J. Barnes
 * @version 2016.02.29
 *
 * Modified and extended by Student Name
 */

public class Game
{
    public final Map MAP;
    public Player Player;

    private CommandReader reader;
    private boolean gameOver;

    int score;
    int itemPercentage;
    /**
     * Create the game and initialise its internal map.
     */
    public Game()
    {
        MAP = new Map();
        Player = new Player("Sam");
        reader = new CommandReader(this);
    }

    /**
     *  Main play routine.  Loops until end of play.
     */
    public void play()
    {
        printWelcome();
        gameOver = false;

        while (! gameOver)
        {
            gameOver = reader.getCommand();
        }

        System.out.println("Thankyou for playing. Goodbye.");
    }

    /**
     * Print out the opening message for the player.
     */
    private void printWelcome()
    {
        System.out.print(ConsoleColours.ANSI_BG_BLACK);
        System.out.print(ConsoleColours.ANSI_CYAN);
        System.out.println(" Welcome to the PC Store Maze!");
        System.out.println(" The aim of this game is to find");
        System.out.println(" the parts needed to build a PC within");
        System.out.println(" this disjointed tech store. GOOD LUCK!");
        System.out.println();
        System.out.println(" Type 'help' if you need help.");
        System.out.println();
        System.out.println(" Your score is " + score);
        System.out.println(" Your progress is " + itemPercentage + "%");
        System.out.println();
        System.out.println(MAP.getCurrentLocation().getLongDescription());
    }
}