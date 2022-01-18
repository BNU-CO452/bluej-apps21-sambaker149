/**
 * This command allows the player to
 * take or pickup an item from a room
 * and carry it around to use somewhere
 * else
 *
 * @author Derek Peacock & Nicholas Day
 * @version 18/01/2022
 * @modified Samuel Baker
 */
public class TakeCommand extends ZuulCommand
{
    public Item item;
    public String name;
    public int score;
    public int itemPercentage;
    public String word2;

    /**
     * Take an item from a location and add it
     * to the player's inventory.
     */
    public TakeCommand(Game zuul, String name)
    {
        super(zuul);
        this.name = name;
    }

    public void execute()
    {
        if(name == null)
        {
            System.out.println("Take what?");
            return;
        }

        Map map = zuul.MAP;
        map.getCurrentLocation().remove(name);
        zuul.Player.addItem(item);
        System.out.println("You have picked up " + item);
        System.out.println();
        System.out.println("Your score is " + score);
        System.out.println("Your progress is " + itemPercentage);
    }
}