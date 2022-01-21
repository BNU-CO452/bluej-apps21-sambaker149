/**
 * This command transfers the player from
 * one location to another location provided the
 * two locations are linked by a valid exit
 *
 * @author Derek Peacock & Nicholas Day
 * @version 2021-08-23
 */
public class TakeCommand2 extends ZuulCommand
{
    Item item;
    String itemName;
    int score;
    int itemPercentage;

    /**
     * Take an item from a location and add it
     * to the player's inventory.
     */
    public TakeCommand2(Game zuul, String itemName)
    {
        super(zuul);
        this.itemName = itemName;
    }

    public void execute()
    {
        Map map = zuul.MAP;
        if (this.itemName.isEmpty())
        {
            System.out.println("Take what?");
        }
        else
        {
            Item item = map.getCurrentLocation().remove(itemName);
            zuul.Player.addItem(this.item);
            System.out.println("You have picked up " + item.getItemName());
            System.out.println();
            System.out.println("Your score is " + score);
            System.out.println("Your progress is " + itemPercentage);
        }
    }
}

