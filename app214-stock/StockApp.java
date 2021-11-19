
/**
 * This app provides a user interface to the
 * stock manager so that users can add, edit,
 * print and remove stock products
 *
 * @author Samuel Baker
 * @version 19/11/2021
 */
public class StockApp
{
    private InputReader reader;
    
    private StockList stock;
    
    /**
     * Constructor for objects of class StockApp
     */
    public StockApp()
    {
        reader = new InputReader();
        
        stock = new StockList();
        StockDemo demo = new StockDemo(stock);
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
    
    private boolean executeChoice(String choice)
    {
        if(choice.equals("add"))
        {
            addProduct();
        }
        else if(choice.equals("remove"))
        {
            removeProduct();
        }
        else if (choice.equals("buy"))
        {
            buyProduct();
        }
        else if (choice.equals("sell"))
        {
            sellProduct();
        }
        else if(choice.equals("print"))
        {
            stock.print();
        }
        else if(choice.equals("quit"))
        {
            return true;
        }
        return false;
    }
   
    public void addProduct()
    {
        System.out.println("Adding a New Product");
        System.out.println();
        
        int id = reader.getInt("Please Enter a Product ID > ");
        String name = reader.getString("Please Enter the Product Name > ");
        
        Product product = new Product (id, name);
        stock.add(product);
        stock.print();
    }
    
    public void removeProduct()
    {
        System.out.println("Removing a Product");
        System.out.println();
        
        int id = reader.getInt("Please Enter a Product ID > ");
        
        Product product = stock.findProduct(id);
        stock.remove(product);
        stock.print();
    }
    
    public void buyProduct()
    {
        System.out.println("Buying a Product");
        System.out.println();
        
        int id = reader.getInt("Please Enter a Product ID > ");
        int amount = reader.getInt(
        "Please Enter the Amount to be Bought > ");
        
        Product product = stock.findProduct(id);
        stock.buyProduct(id, amount);
        stock.print();
    }
    
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
    }
    
    /**
     * Print out a menu of operation choices
     */
    private void printMenuChoices()
    {
        System.out.println();
        System.out.println("    Add:        Add a new product");
        System.out.println("    Remove:     Remove an old product");
        System.out.println("    Buy:        Buy a product");
        System.out.println("    Sell:       Sell a product");
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