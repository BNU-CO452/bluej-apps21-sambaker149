/**
 * This command displays the score and progress of the player
 *
 * @author Samuel Baker
 * @version 19/01/2022
 * */
public class ScoreCommand extends ZuulCommand
{
    int score;
    int itemPercentage;
    public ScoreCommand(Game zuul)
    {
        super(zuul);
    }

    public void execute()
    {
        System.out.println(" Your score is " + score);
        System.out.println(" Your progress is " + itemPercentage + "%");
    }
}