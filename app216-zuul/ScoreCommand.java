/**
 * This command displays the score and progress of the player
 *
 * @author Samuel Baker
 * @version 24/01/2022
 * */
public class ScoreCommand extends ZuulCommand
{
    public ScoreCommand(Game zuul)
    {
        super(zuul);
    }

    public void execute()
    {
        System.out.println(" Your score is " + zuul.Player.score);
        System.out.println(" Your progress is " + zuul.Player.itemPercentage + "%");
    }
}