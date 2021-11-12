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
public class StockDemo
{
    private StockList stock;
    private Random generator = new Random();

     /**
     * Create a StockManager and populate it with at least
     * 10 sample products.
     */
    public StockDemo()
    {
        this.stock = new StockList();
        
        stock.add(new Product(100, "Apple iPhone XR"));
        stock.add(new Product(101, "Samsung Galaxy S20"));
        stock.add(new Product(102, "Google Pixel 5"));
        stock.add(new Product(103, "Samsung Galaxy A22"));
        stock.add(new Product(104, "Apple iPhone XS")); 
        stock.add(new Product(105, "Apple iPhone 13"));
        stock.add(new Product(106, "Samsung Galaxy A51"));
        stock.add(new Product(107, "Google Pixel 4A"));
        stock.add(new Product(108, "Apple iPhone 11"));
        stock.add(new Product(109, "Google Pixel 3A"));        
        
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
        stock.print();

        buyProducts();
        stock.print();        

        sellProducts();
        stock.print();        
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
                quantity = generator.nextInt(20);
                stock.buyProduct(id, quantity);
            }
        }
    }
    
    private void sellProducts()
    {
        stock.sellProduct(99, 50);
        stock.sellProduct(101, 300);
        stock.sellProduct(102, 25);
        stock.sellProduct(103, 300);
        stock.sellProduct(104, 150);
        stock.sellProduct(105, 25);
        stock.sellProduct(106, 100);
        stock.sellProduct(107, 500);
        stock.sellProduct(108, 250);
        stock.sellProduct(109, 475);
    }    
}