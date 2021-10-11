
/**
 * This class contains information relating to moddules on courses.
 *
 * @author Samuel Baker
 * @version 11/10/2021
 */
public class Module
{
    // instance variables - replace the example below with your own
    private String code;
    private String title;
    private int credit;
    
    /**
     * Create a new module, including module code and title.
     */
    public Module(String code, String title)
    {
        // initialise instance variables
        this.code = code;
        this.title = title;
        credit = 0;
    }

    /**
     * Return the Module Code.
     *
     * @param  
     * @return code
     */
    public String getCode()
    {
        return this.code;
    }

    /**
     * Return the Module Title.
     *
     * @param  
     * @return title
     */
    public String getTitle()
    {
        return this.title;
    }
    
    /**
     * Return the Module credit.
     *
     * @param  
     * @return credit
     */
    public int getCredit()
    {
        return this.credit;
    }
    
    /**
     * Set the module credit.
     *
     * @param  
     * @set credit
     */
    public void setCredit(int credit)
    {
        this.credit = credit;
    }
    
    /**
     * Print the module code and title.
     */
    public void print()
    {
        System.out.println(" Module Code: " + code + ": " + title);
    }
}
