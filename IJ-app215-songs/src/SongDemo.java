import java.util.Random;
/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @modified Samuel Baker
 * @version 2016.02.29
 */
public class SongDemo
{
    private SongList song;
    private Random generator = new Random();

     /**
     * Create a StockManager and populate it with at least
     * 10 sample products.
     */
    public SongDemo(SongList song)
    {
        this.song = song;

        song.add(new Song("Beautiful", "Anne-Marie"));
        song.add(new Song("Bad Habits", "Ed Sheeran"));
        song.add(new Song("Halo", "Beyonce"));
        song.add(new Song("Clash", "Dave, (feat. Stormzy)"));
        song.add(new Song("It Gets Better", "Swedish House Mafia"));
        song.add(new Song("You for me", "Rita Ora"));
        song.add(new Song("Don’t delete the kisses", "Wolf Alice"));
        song.add(new Song("Holier Than Thou", "Biffy Clyro"));
        song.add(new Song("Plastic Hearts", "Miley Cyrus"));
        song.add(new Song("Prisoner", "Miley Cyrus (feat. Dua Lipa)"));

        runDemo();
    }
    
    /**
     * Provide a demonstration of how the ProductList meets all
     * the user requirements by making a delivery of each product 
     * buying it in various amounts and then selling each
     * product by various amounts. Make sure all the requirements
     * have been demonstrated.
     */
    public void runDemo()
    {
        song.print();
    }
    
    private void buyProducts()
    {
        Product product;
        int quantity = 1;
        for(int id = 100; id <= 109; id++)
        {
            product = stock.findProduct(id);
            if(product == null)
            {
                System.out.println("Product " + id + " Not Found" );
            }
            else
            {
                quantity = generator.nextInt(250);
                stock.buyProduct(id, quantity);
            }
        }
    }
    
    private void sellProducts()
    {
        Product product;
        int quantity = 1;
        for(int id = 100; id <= 109; id++)
        {
            product = stock.findProduct(id);
            if(product == null)
            {
                System.out.println("Product " + id + " Not Found" );
            }
            else
            {
                quantity = generator.nextInt(250);
                stock.sellProduct(id, quantity);
            }
        }
    }    
}