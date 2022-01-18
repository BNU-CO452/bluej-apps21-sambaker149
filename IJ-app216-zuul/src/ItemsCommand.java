import java.util.ArrayList;

/**
 * This command prints a list of the items a player has picked up
 *
 * @author Samuel Baker
 * @version 18/01/2022
 * */
public class ItemsCommand extends ZuulCommand
{
    public ArrayList<Item> items;

    public ItemsCommand(Game zuul)
    {
        super(zuul);
        Item items;
    }
    public void execute()
    {
        System.out.print(ConsoleColours.ANSI_BG_YELLOW);
        System.out.print(ConsoleColours.ANSI_BLACK);
        System.out.println(items);
    }
}