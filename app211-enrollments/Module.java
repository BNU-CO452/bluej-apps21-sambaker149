
/**
 * This class contains information relating to the course code, title and
 * credit available in a module as part of a course
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
     * Constructor for objects of class Module which initialises the code,
     * title and credit attributes
     */
    public Module(String code, String title)
    {
        // initialise instance variables
        this.code = code;
        this.title = title;
        credit = 0;
    }

    public String getCode()
    {
        return code;
    }

    public String getTitle()
    {
        return title;
    }
    
    public void setCredit(int credit)
    {
        this.credit = credit;
    }
    
    /**
     * Method to print all attributes relating to a module as part of a
     * course
     */
    public void print()
    {
        System.out.println(" Module Code: " + code + ": " + title + 
        " credit " + credit);
        System.out.println();
    }
}
