import java.util.ArrayList;

/**
 * This app provides a user interface to the
 * stock manager so that users can add, edit,
 * print and remove stock products
 *
 * @author Samuel Baker
 * @version 01/12/2021
 */
public class SongApp
{
    private InputReader reader;
    
    public SongList music;
    
    /**
     * Constructor for objects of class StockApp
     */
    public SongApp()
    {
        reader = new InputReader();
        
        music = new SongList();
    }

    /**
     *  Display a list of menu choices and execute
     *  the user's choice.
     */
    public void run()
    {
        boolean finished = false;
        
        while(!finished)
        {
            printHeading();
            printMenuChoices();
           
            String choice = reader.getString("Please enter your choice > ");
            
            finished = executeChoice(choice.toLowerCase());
        }
    }
    
    /**
     * A method to initiate the methods that occur in the event of certain
     * selection being made by the user
     */
    private boolean executeChoice(String choice)
    {
        if(choice.equals("add"))
        {
            addSong();
        }
        else if(choice.equals("remove"))
        {
            removeSong();
        }
        else if (choice.equals("view songs"))
        {
            printSongs();
        }
        else if (choice.equals("filter by plays"))
        {
            searchByPlays();
        }
        return false;
    }
   
    /**
     * A method to add a product to the the stocklist, intitialised by
     * the executeChoice method
     */
    public void addSong()
    {
        System.out.println("Adding a New Song");
        System.out.println();
        
        String name = reader.getString("Please Enter the Song Name > ");
        String artist = reader.getString("Please Enter the Song Artist > ");
        
        Song song = new Song (name, artist);
        music.add(song);
        music.print();
        System.out.println("Added Name: " + song.getName() +", Artist: " + song.getArtist() + " to Song List ");
    }
    
    /**
     * A method to remove a product from the the stocklist, intitialised by
     * the executeChoice method
     */
    public void removeSong()
    {
        System.out.println("Removing a Song");
        System.out.println();
        
        int id = reader.getInt("Please Enter a Product ID > ");
        
        Song song = music.
        music.remove(song);
        music.print();
        System.out.println("Removed product ID "+product.getID()+": " +
        product.getName()+" from stock list");
    }
    
    /**
     * A method to view all the songs contained within the song list
     */
    public void printSongs()
    {
        System.out.println("Viewing Songs");
        System.out.println();

        music.printSongs();
    }
    
    /**
     * A method to sell different quantities of a product, intitialised by
     * the executeChoice method
     */
    public void sellProduct()
    {
        System.out.println("Selling a Product");
        System.out.println();
        
        int id = reader.getInt("Please Enter a Product ID > ");
        int amount = reader.getInt(
        "Please Enter the Amount to be Sold > ");
        
        Product product = stock.findProduct(id);
        stock.sellProduct(id, amount);
        stock.print();
        System.out.println("Sold "+amount+" of ID: "+product.getID()+": "+
        product.getName());
    }
    
    /**
     * A method to Search for Products based on manufacturer contained within StockList
     */
    public void searchByPhrase()
    {
        System.out.println("Searching for Products");
        System.out.println();

        reader.getString("Please Enter a Search Phrase > ");

        stock.searchByPhrase();
    }

    /**
     * A method to Search for Products below a set Stock Level
     */
    public void searchLowStock()
    {
        System.out.println("Searching for Low Stocked Products");
        System.out.println();

        stock.searchLowStock();
    }

    /**
     * A method to restock a product by a set amount
     */
    public void restockProduct()
    {
        System.out.println("Restocking Low Stocked Products");
        System.out.println();

        stock.restockProduct();
    }
    
    /**
     * Print out a menu of operation choices
     */
    private void printMenuChoices()
    {
        System.out.println();
        System.out.println("    Add:        Add a new Song");
        System.out.println("    Remove:     Remove a Song");
        System.out.println("    View Songs: View list of Songs");
        System.out.println("    Sell:       Sell a product");
        System.out.println("    Search:     Search for products");
        System.out.println("    Low Stock:  Lists all products low in stock");
        System.out.println("    Restock:    Restock a product");
        System.out.println("    Print:      Print all products");
        System.out.println("    Quit:       Quit the program");
        System.out.println();        
    }
    
    /**
     * Print the title of the program and the authors name
     */
    private void printHeading()
    {
        System.out.println("********************************");
        System.out.println("  App21-04: Stock Application ");
        System.out.println("      by Samuel Baker");
        System.out.println("********************************");
    }
}