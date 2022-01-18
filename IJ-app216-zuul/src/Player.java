import java.util.ArrayList;

/**
 * This class contains information relating to the player, including the name, score and list of items that the player
 * has picked up
 *
 * @author Samuel Baker
 * @version 18/01/2022
 */
public class Player
{
    public String name;

    public int lives;

    public Item item;

    public int score = 0;

    public ArrayList<Item> items;

    public int itemPercentage;

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
     * Increase the score based on type of itemgo
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