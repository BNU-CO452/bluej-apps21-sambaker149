import java.util.ArrayList;

/**
 * This class contains information relating to the player, including the name, score and list of items that the player
 * has picked up
 *
 * @author Samuel Baker
 * @version 24/01/2022
 */
public class Player
{
    private String name;

    private int lives;

    private Item item;

    public int score = 0;

    public ArrayList<Item> items;

    public int itemPercentage;

    public Player(String name)
    {
        this.name = name;
        lives = 1;
        itemPercentage = 0;
    }

    public void increaseItemPercentage(int amount)
    {
        itemPercentage += amount;

        if(itemPercentage > 100)
            itemPercentage = 100;
    }

    public void decreaseItemPercentage(int amount)
    {
        itemPercentage -= amount;
        if(itemPercentage < 10)
        {
            lives = 0;
        }
    }

    public void increaseScore(int amount)
    {
        score += amount;
    }

    public void decreaseScore(int amount)
    {
        score -= amount;
    }
    public boolean isAlive()
    {
        return lives > 0;
    }

    /**
     * Increase the score based on type of item
     */
    public void addItem(Item item)
    {
        this.item = item;
        if(item.getItemType() == ItemType.peripherals)
        {
            increaseItemPercentage(13);
            increaseScore(10);
        }
        else if(item.getItemType() == ItemType.components)
        {
            increaseItemPercentage(15);
            increaseScore(12);
        }
        else if(item.getItemType() == ItemType.accessories)
        {
            increaseItemPercentage(12);
            increaseScore(4);
        }

    }
}