/**
 * This command allows the player to
 * take or pickup an item from a room
 * and carry it around to use somewhere
 * else
 *
 * @author Derek Peacock & Nicholas Day
 * @version 19/01/2022
 * @modified Samuel Baker
 */
public class TakeCommand extends ZuulCommand
{
    Item item;
    String itemName;
    int score;
    int itemPercentage;

    /**
     * Take an item from a location and add it
     * to the player's inventory.
     */
    public TakeCommand(Game zuul, String itemName)
    {
        super(zuul);
        this.itemName = itemName;
    }

    public void execute()
    {
        if(item == null)
        {
            System.out.println("Take what?");
            return;
        }

        Map map = zuul.MAP;
        map.getCurrentLocation().remove(this.itemName);
        zuul.Player.addItem(item);
        System.out.println("You have picked up " + item);
        System.out.println();
        System.out.println("Your score is " + score);
        System.out.println("Your progress is " + itemPercentage);
    }
}