
/**
 * This class contains information relating to modules on a course.
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
     * Constructor for objects of class Module
     */
    public Module(String code, String title)
    {
        // initialise instance variables
        this.code = code;
        this.title = title;
        credit = 0;
    }

    /**
     * Method to get the Module Code
     *
     * @param  
     * @return code
     */
    public String getCode()
    {
        return code;
    }

    /**
     * Method to get the Module Title
     *
     * @param  
     * @return title
     */
    public String getTitle()
    {
        return title;
    }
    
    /**
     * Method to set the Module Credit
     *
     * @param  
     * @set credit
     */
    public void setCredit(int credit)
    {
        this.credit = credit;
    }
    
    /**
     * Method to print the details of the module
     */
    public void print()
    {
        System.out.println(" Module Code: " + code + ": " + title + 
        " credit " + credit);
        System.out.println();
    }
}
