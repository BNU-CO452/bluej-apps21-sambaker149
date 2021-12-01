import java.util.ArrayList;

/**
 * Manage the stock in a business.
 * The stock is described by zero or more Products.
 * 
 * @author Samuel Baker 
 * @version 01/12/2021
 */
public class SongList
{
    private ArrayList<Song> music;
}

    /**
     * Initialise the stock manager.
     */
    public SongList()
    {
        song = new ArrayList<Song>();
    }

    /**
     * Add a product to the list.
     * @param item The product item to be added.
     */
    public void add(Song song)
    {
       music.add(song);
    }
    
    /**
     *  A method to remove a product from the list
     */
    public void remove(Song song)
    {
        song.remove(song);
    }
    
    /**
     * A method to buy a single quantity of the product
     */
    public void buyProduct(int productID)
    {
        buyProduct(productID, 1);
    }

    /**
     * Buy a quantity of a particular product.
     * Increase the quantity of the product by the given amount.
     * @param id The ID of the product.
     * @param amount The amount to increase the quantity by.
     */
    public void printSongs()
    {
        for(Song song : music)
        {
            System.out.println(" Song Name: " + song.getName() + ", Artist: " + song.getArtist());
            System.out.println();
        }
    }    
    
    /**
     * Find a product to match the product id,
     * if not found return null
     */
    public Product findProduct(int productID)
    {
        for(Product product : stock)
        {
            if(product.getID() == productID)
            {
                return product;
            }
        }
        return null;
    }
    
    /**
     * Sell one quantity of the given product.
     * Show the before and after status of the product.
     * @param id The ID of the product being sold.
     */
    public void sellProduct(int productID)
    {
        sellProduct(productID, 1);
    }    
    
    /**
     * Sell many of the given product.
     * Show the before and after status of the product.
     * @param id The ID of the product being sold.
     */
    public void sellProduct(int productID, int amount)
    {
        Product product = findProduct(productID);
        
        if(product != null) 
        {
            if(product.getQuantity() > 0 && product.getQuantity() > amount)
            {
                product.decreaseQuantity(amount);
                System.out.println("Sold " + amount + " of ID: " +product.getID()+" "+
                product.getName());
            }
            else if(product.getQuantity() == 0)
            {
                System.out.println("The product ID: " + product.getID()+ " " + product.getName() +
                " is out of stock");
            }
            else
            {
                System.out.println("Unable to sell " + amount + " of ID: " + product.getID() + " " +
                product.getName() + " due to only " + product.getQuantity() 
                + " being in stock");
            }
        }
        else
        {
            System.out.println("Couldn't find product");
        }
    }

    /**
     * A method to Search for Products available from Apple contained within StockList
     */
    public void searchByPhrase()
    {
        for(Product product : stock)
        {
            String str = product.getName();
            if(str.contains("Apple"))
            {
                System.out.println(" ID: " + product.getID() + " " + product.getName() +
                        " stock level: " + product.getQuantity());
            }
        }
    }

    /**
     * A method to Search for Products below a set Stock Level
     */
    public void searchLowStock()
    {
        for(Product product : stock)
        {
            if (product.getQuantity() >= 0 && product.getQuantity() < 75)
            {
                System.out.println(" ID: " + product.getID() + " " + product.getName() +
                        " stock level: " + product.getQuantity());
            }
        }
    }

    /**
     * A method to restock a product by a set amount
     */
    public void restockProduct()
    {
        for (Product product : stock)
        {
            if (product.getQuantity() >= 0 && product.getQuantity() < 75)
            {
                product.increaseQuantity(75);
                System.out.println("Restocked ID: " + product.getID() + " " + product.getName());
            }
        }
    }

    /**
     * Print details of the given product. If found,
     * its name and stock quantity will be shown.
     * @param id The ID of the product to look for.
     */
    public void printProduct(int productID)
    {
        Product product = findProduct(productID);
        
        if(product != null) 
        {
            System.out.println(product.toString());
        }
    }
    
    /**
     * Print out each product in the stock
     * in the order they are in the stock list
     */
    public void print()
    {
        printHeading();
        
        for(Product product : stock)
        {
            System.out.println(product);
        }

        System.out.println();
    }
    
    public void printHeading()
    {
        System.out.println();
        System.out.println(" Sam's Stock List");
        System.out.println(" ====================");
        System.out.println();
    }
}