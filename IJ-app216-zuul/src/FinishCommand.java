/**
 * This command enables the player to submit their progress to see if they have won
 * or lost the game
 *
 * @author Samuel Baker
 * @version 24/01/2022
 * */
public class FinishCommand extends ZuulCommand
{
    Boolean gameOver;
    int lives;
    public FinishCommand(Game zuul)
    {
        super(zuul);
    }
    public void execute()
    {
        if(zuul.Player.score <= 55)
        {
            System.out.print(ConsoleColours.ANSI_BRIGHT_BG_RED);
            System.out.print(ConsoleColours.ANSI_BLACK);
            System.out.println(" Your score is " + zuul.Player.score);
            System.out.println(" Your progress is " + zuul.Player.itemPercentage + "%");
            System.out.println();
            System.out.println(" You have lost the Game as you haven't collected enough items");
            lives -= 1;
            gameOver = true;
        }
        else
        {
            System.out.print(ConsoleColours.ANSI_BRIGHT_BG_GREEN);
            System.out.print(ConsoleColours.ANSI_BLACK);
            System.out.println(" Your score is " + zuul.Player.score);
            System.out.println(" Your progress is " + zuul.Player.itemPercentage + "%");
            System.out.println();
            System.out.println(" Congratulations - You have won the Game");
            gameOver = true;
        }
    }
}