import java.util.ArrayList;

public class Player
{
    private String name;
    private int lives;
    private ArrayList<Item> item;
    private int energy;

    public Player(String name)
    {
        this.name = name;
        lives = 1;
        energy = 100;
    }

    public void increaseEnergy(int amount)
    {
        energy += amount;

        if(energy > 100)
        {
            energy = 100;
        }
    }

    public void decreaseEnergy(int amount)
    {
        energy -= amount;
        if(energy < 10)
        {
            lives = 0;
        }
    }

    public boolean isAlive()
    {
        return lives > 0;
    }
}
