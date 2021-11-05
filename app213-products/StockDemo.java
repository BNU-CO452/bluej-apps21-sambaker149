
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
        stock.buyProduct(100, 100);
        stock.buyProduct(101, 250);
        stock.buyProduct(102, 99);
        stock.buyProduct(103, 375); 
        stock.buyProduct(104, 100);
        stock.buyProduct(105, 50);
        stock.buyProduct(106, 200);
        stock.buyProduct(107, 625);
        stock.buyProduct(108, 700);
        stock.buyProduct(109, 550);
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