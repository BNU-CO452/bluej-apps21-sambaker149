
/**
 * This class is reponsible for creating and
 * linking all the Locations in the game to
 * form a 2D or 3D network
 *
 *                                              [Aisle 5]
 *                                                 |
 *      [Staff Area]       [Aisle 4]<---->[Accessories Section]----->[Staff Area]
 *           |                                     |                       |
 *       [Aisle3]<---->[Aisle 2]                   |                   [Aisle 6]<---->[Aisle 7]
 *                        |                        |                       |
 *[Aisle 1]<---->[Processors Section]<---->[Store Entrance]<---->[Miscellaneous Section]<---->[Aisle 8]
 *                                                |                                               |
 *                                            [Outside]                                      [Staff Area]
 *             
 * @author Derek Peacock and Nicholas Day
 * @version 2021-08-22
 */
public class Map
{
    // Need to add a list of exits
    
    private Location outside, storeEntrance, processors, accessories, miscellaneous, aisle1, aisle2, aisle3, aisle4,
            aisle5, aisle6, aisle7, aisle8, staff1, staff2, staff3;

    private Location currentLocation;

    /**
     * Constructor for objects of class Map
     */
    public Map()
    {
        createLocations();
    }

    /**
     * Create all the Locations and link their exits together.
     * Set the current location to the outside.
     * Both locations need to have been created before
     * their exists are linked.
     */
    private void createLocations()
    {
        createOutside();
        createStoreEntrance();
        createProcessors();
        createAccessories();
        createMiscellaneous();
        createAisle1();
        createAisle2();
        createAisle3();
        createAisle4();
        createAisle5();
        createAisle6();
        createAisle7();
        createAisle8();
        createStaffArea1();
        createStaffArea2();
        createStaffArea3();

        currentLocation = outside;  // start game outside
    }
    
    /**
     * Create the outside and link it to the
     * theatre, lab and pub
     */
    private void createOutside()
    {
        outside = new Location("You are outside the Main Entrance of the Store");

        outside.setExit("north", storeEntrance);
        storeEntrance.setExit("south", outside);
    }

    /**
     * Create store entrance and link it to the outside and sections of the store
     */
    private void createStoreEntrance()
    {
        storeEntrance = new Location("You have entered the Store");

        storeEntrance.setExit("south", outside);
        outside.setExit("north", storeEntrance);

        storeEntrance.setExit("west", processors);
        processors.setExit("east", storeEntrance);

        storeEntrance.setExit("north", accessories);
        accessories.setExit("south", storeEntrance);

        storeEntrance.setExit("east", miscellaneous);
        miscellaneous.setExit("west", storeEntrance);
    }

    /**
     * Create the accessories section and link it to the store entrance and aisles
     */
    private void createAccessories()
    {
        accessories = new Location("You are in the Accessories and Hardware Section");
        
        accessories.setExit("south", storeEntrance);
        storeEntrance.setExit("north", accessories);

        accessories.setExit("west", aisle4);
        aisle4.setExit("east", accessories);

        accessories.setExit("north", aisle5);
        aisle5.setExit("south", accessories);

        accessories.setExit("east", staff2);
    }

    /**
     * Create the processors section and link it to the store entrance and aisles
     */
    private void createProcessors()
    {
        processors = new Location("You are in the Processors Section");

        processors.setExit("east", storeEntrance);
        storeEntrance.setExit("west", processors);

        processors.setExit("west", aisle1);
        aisle1.setExit("east", processors);
    }

    /**
     * Create the miscellaneous section and link it to the store entrance and aisles
     */
    private void createMiscellaneous()
    {
        miscellaneous = new Location("You are in the Miscellaneous Section");

        miscellaneous.setExit("west", storeEntrance);
        storeEntrance.setExit("east", miscellaneous);

        miscellaneous.setExit("north", aisle6);
        aisle6.setExit("south", miscellaneous);

        miscellaneous.setExit("east", aisle8);
        aisle8.setExit("west", miscellaneous);
    }

    /**
     * Create aisle 1 linked to the processors section
     */
    private void createAisle1()
    {
        aisle1 = new Location("You are in Aisle 1");

        aisle1.setExit("east", processors);
        processors.setExit("west", aisle1);
    }
    /**
     * Create aisle 2 linked to the processors section
     */
    private void createAisle2()
    {
        aisle2 = new Location("You are in Aisle 2");

        aisle2.setExit("south", processors);
        accessories.setExit("north", aisle2);

        aisle2.setExit("west", aisle3);
        aisle3.setExit("east", aisle2);
    }

    /**
     * Create aisle 3 linked to the accessories section
     */
    private void createAisle3()
    {
        aisle3 = new Location("You are in Aisle 3");

        aisle3.setExit("east", aisle2);
        aisle2.setExit("west", aisle3);

        aisle3.setExit("north", staff1);
    }

    /**
     * Create aisle 4 linked to the accessories section
     */
    private void createAisle4()
    {
        aisle4 = new Location("You are in Aisle 4");

        aisle4.setExit("east", accessories);
        accessories.setExit("west", aisle4);
    }

    /**
     * Create aisle 5 linked to the accessories section
     */
    private void createAisle5()
    {
        aisle5 = new Location("You are in Aisle 5");
        
        aisle5.setExit("south", accessories);
        accessories.setExit("north", aisle5);
    }

    /**
     * Create aisle 6 linked to the miscellaneous section
     */
    private void createAisle6()
    {
        aisle6 = new Location("You are in Aisle 6");

        aisle6.setExit("south", miscellaneous);
        miscellaneous.setExit("north", aisle6);

        aisle6.setExit("east", aisle7);
        aisle7.setExit("west", aisle6);

        aisle6.setExit("north", staff2);
    }

    /**
     * Create aisle 7 linked to the miscellaneous section
     */
    private void createAisle7()
    {
        aisle7 = new Location("You are in Aisle 7");

        aisle7.setExit("west", aisle6);
        aisle6.setExit("east", aisle7);
    }

    /**
     * Create aisle 8 linked to the miscellaneous section
     */
    private void createAisle8()
    {
        aisle8 = new Location("You are in Aisle 8");

        aisle8.setExit("west", miscellaneous);
        miscellaneous.setExit("east", aisle8);

        aisle8.setExit("south", staff3);
    }

    /**
     * Create a staff area linked to the processors section
     */
    private void createStaffArea1()
    {
        staff1 = new Location("You have entered the Staff Area - GAME OVER");
    }

    /**
     * Create a staff area linked to the accessories section
     */
    private void createStaffArea2()
    {
        staff2 = new Location("You have entered the Staff Area - GAME OVER");
    }

    /**
     * Create a staff area linked to the miscellaneous section
     */
    private void createStaffArea3()
    {
        staff3 = new Location("You have entered the Staff Area - GAME OVER");
    }
    
    public Location getCurrentLocation()
    {
        return currentLocation;
    }
    
    public void enterLocation(Location nextLocation)
    {
        currentLocation = nextLocation;
    }
}
