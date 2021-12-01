/**
 * Initialises the Application and Enables it to be Run
 *
 * @author     Samuel Baker
 * @version    01/12/2021
 */
public class Main
{
    private static SongApp app;

    public static void main(String[] args)
    {
        app = new SongApp();
        app.run();
    }
}
