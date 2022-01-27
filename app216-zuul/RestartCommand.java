/**
 * This command restarts the game and resets the score etc
 *
 * @author Samuel Baker
 * @version 18/01/2022
 * */
public class RestartCommand extends ZuulCommand
{
    public RestartCommand(Game zuul)
    {
        super(zuul);
    }

    /**
     * Print out some help information including the
     * aim of the game and a list of the command words.
     */
    public void execute()
    {
        Game zuul = new Game();
        zuul.play();
    }
}