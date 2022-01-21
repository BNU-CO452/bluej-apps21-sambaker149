/**
 * Gives user information on how to play the
 * zuul game
 *
 * @author Samuel Baker
 * @version 20/01/2022
 */
public class HelpCommand extends ZuulCommand
{
    public HelpCommand(Game zuul)
    {
        super(zuul);
    }

    /**
     * Print out some help information including the
     * aim of the game and a list of the command words.
     */
    public void execute()
    {
        System.out.print(ConsoleColours.ANSI_BG_BLACK);
        System.out.print(ConsoleColours.ANSI_CYAN);
        System.out.println(" You are outside a Technology Store.");
        System.out.println(" You want to buy parts to build a PC but");
        System.out.println(" you see that it's very disjointing inside");
        System.out.println();
        System.out.println(" Your task is to go around the store and try to");
        System.out.println(" the parts you need.");
        System.out.println();
        System.out.println(" Without all the items you need, you can't win");
        System.out.println(" the game. GOOD LUCK!");
        System.out.println();
        System.out.println(" Your command words are:");
        System.out.println();
        
        for(CommandWords command : CommandWords.values())
        {
            System.out.println(" "+ command.word +
                               "\t  : " + command.description);                        
        }   
        System.out.println();
        System.out.println(" e.g. go west, take keyboard");
        System.out.println();
        System.out.println(zuul.MAP.getCurrentLocation().getLongDescription());
    }
}
