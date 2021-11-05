
/**
 * Demonstrate the StockManager and Product classes.
 * The demonstration becomes properly functional as
 * the StockManager class is completed.
 * 
 * @author David J. Barnes and Michael Kölling.
 * @version 2016.02.29
 */
public class StockDemo
{
    // The stock manager.
    private StockList stock;

    /**
     * Create a StockManager and populate it with at least
     * 10 sample products.
     */
    public StockDemo()
    {
        this.stock = new StockList();
        
        // Add at least 10 products, they must be unique to you
        // Make sure the ids are sequential numbers
        
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
        // Show details of all of the products before delivery.
        
        stock.print();

        buyProducts();
        stock.print();        

        sellProducts();
        stock.print();        
    }
    
    private void buyProducts()
    {
        stock.buyProduct(100, 10);
    }

    private void sellProducts()
    {
        stock.sellProduct(103, 2);
    }    
}