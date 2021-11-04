import java.util.ArrayList;
/**
 * This class stores information about a course
 * that enrolled students may want to complete
 *
 * @author Derek Peacock and Nicholas Day
 * @version 0.1 11/Sep/2020
 */
public class Course
{
    public final static int MAXN_MODULES = 4;
    
    public ArrayList<Module> modules;
    public ArrayList<Student> students;
    
    private String code;
    private String title;
    
    private Grades finalGrade;
    
    /**
     * Constructor to create a course with set course code and title
     */
    public Course()
    {
        this("BT1CWD1", "BSc (Hons) Computing and Web Development");
    }
    
    /**
     * Constructor for objects of class Course
     */
    public Course(String code, String title)
    {
        // initialise instance variables
        this.code = code;
        this.title = title;
        
        modules  = new ArrayList<Module>();
        students = new ArrayList<Student>();
        
        createModules();
        createStudents();
    }

    /**
     * Create four modules and add them to the
     * modules list for testing purposes.  These
     * must be your four modules.
     */
    public void createModules()
    {
        Module moduleCO452 = new Module("CO452", "Programming Concepts");
        addModule(moduleCO452);
        Module moduleCO450 = new Module("CO450", "Computer Architectures");
        addModule(moduleCO450);
        Module moduleCO454 = new Module("CO454", "Digital Technologies");
        addModule(moduleCO454);
        Module moduleCO456 = new Module("CO456", "Web Development");
        addModule(moduleCO456);
    }
    
    public void addModule(Module module)
    {
        if(modules.size() < MAXN_MODULES)
        {
            modules.add(module);
        }
    }
    
     /**
     * Constructor for initialisation of list of students enrolled on a course.
     */
    public void createStudents()
    {
        Student student_samuelBaker = new Student("Samuel Baker", 22135877);
        addStudent(student_samuelBaker);
        Student student_joeCollins = new Student("Joe Collins", 23467452);
        addStudent(student_joeCollins);
        Student student_aliPhillips = new Student("Ali Phillips", 23467453);
        addStudent(student_aliPhillips);
        Student student_thomasHoward = new Student("Thomas Howard", 23467454);
        addStudent(student_thomasHoward);
    }
    
    public void addStudent (Student student)
    {
        students.add(student);
    }
    
    /**
     * Method to initialise the boundaries for conversion of marks into a grade
     */
    public Grades convertToGrade(int mark)
    {
        if (mark >= 0 && mark <= 39)
        {
            return Grades.F;
        }
        else if(mark <= 49)
        {
            return Grades.D;
        }
        else if(mark <= 59)
        {
            return Grades.C;
        }
        else if(mark <= 69)
        {
            return Grades.B;
        }
        else if(mark <= 100)
        {
            return Grades.A;
        }
        else
            return Grades.NS;
    }
    
    /**
     * Calculate the average mark from the four module marks
     * and convert that into a final grade.
     */
    public Grades calculateGrade(ArrayList<ModuleMark> marks)
    {
        int total = 0;
        int finalMark = 0;
        
         for(ModuleMark mark : marks)
        {
            total = total + mark.getValue();
        }
        
        finalMark = total / MAXN_MODULES;
        finalGrade = convertToGrade(finalMark);
        
        return finalGrade;
    }
    
     /**
     * Method to print the list of all students enrolled on a course
     */
    public void printStudents()
    {
        for(Student student : students)
        {
            System.out.print("    " + student.getName());
            System.out.println("    " + student.getID());
        }
    }
    
    /**
     * Prints out the details of a course and the
     * four modules
     */
    public void print()
    {
        System.out.println();
        System.out.println(" Course " + code + ": " + title);
        //System.out.println();
        
        printModules();
    }
    
    /**
     * Print the course's four modules
     */
    public void printModules()
    {
       System.out.println("    Course Modules");
       System.out.println("    --------------"); 
       System.out.println();
        for(Module module : modules)
        {
            System.out.print("    " + module.getCode());
            System.out.println("    " + module.getTitle());
        }
    }
}
