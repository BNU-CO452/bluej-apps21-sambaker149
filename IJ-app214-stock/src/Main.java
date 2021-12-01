/**
 * Initialises the Application and Enables it to be Run
 *
 * @author     Samuel Baker
 * @version    28/11/2021
 */
public class Main
{
    private static StockApp app;

    public static void main(String[] args)
    {
        app = new StockApp();
        app.run();
    }
}