import java.util.ArrayList;

/**
 * This class contains information relating to the player, including the name, score and list of items that the player
 * has picked up
 */
public class Player
{
    private String name;

    private int lives;

    private Item item;

    public int score = 0;

    public ArrayList<Item> items;

    // This is a percentage
    private int itemPercentage;

    public Player(String name)
    {
        this.name = name;
        lives = 1;
        itemPercentage = 0;
    }

    public void increasePercentage(int amount)
    {
        itemPercentage += amount;

        if(itemPercentage > 100)
            itemPercentage = 100;
    }

    public void decreasePercentage(int amount)
    {
        itemPercentage -= amount;
    }

    public boolean isAlive()
    {
        return lives > 0;
    }

    /**
     * If the item is an item of treasure inclrease
     * the score
     * @param item
     */
    public void addItem(Item item)
    {
        this.item = item;

        if(item.getItemType()==ItemType.Peripherals)
        {
            itemPercentage += 11.1;
            score += 10;
        }
        else if(item.getItemType()==ItemType.Components)
        {
            itemPercentage += 11.1;
            score += 11;
        }
        else if(item.getItemType()==ItemType.Accessories)
        {
            itemPercentage += 11.1;
            score += 5;
        }
    }
}