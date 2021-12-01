/**
 * Model details of different songs
 * 
 * @author Samuel Baker
 * @version 01/12/2021
 */
public class Song
{
    private String name;
    private String artist;
    private int plays;

    /**
     * Constructor for objects of class Product.
     * The initial stock quantity is zero.
     * @param id The product's identifying number.
     * @param name The product's name.
     */
    public Song(String name, String artist)
    {
        this.name = name;
        this.artist = artist;
        
        plays = 0;
    }

    /**
     * @return The name of the song
     */
    public String getName()
    {
        return name;
    }

    /**
     * @return The name of the artist
     */
    public String getArtist()
    {
        return artist;
    }

    /**
     * @return The number of plays
     */
    public int getPlays()
    {
        return plays;
    }

    public void setPlays(int plays)
    {
        this.plays = plays;
    }
    
    public void increasePlays(int amount)
    {
        plays = plays + amount;
    }
    
    public void decreasePlays(int amount)
    {
        if(plays >= amount)
            plays = plays - amount;
    }
    
    /**
     * @return The id, name and quantity in stock.
     */
    public String toString()
    {
        return " Name " + name + ", Artist: " +  artist + ", Number of Plays: " + plays;
    }

    
    public void print()
    {
        System.out.println(toString());
    }
}