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
 *[Aisle 1]<---->[Components Section]<---->[Store Entrance]<---->[Miscellaneous Section]<---->[Aisle 8]
 *                                                |                                               |
 *                                            [Outside]                                      [Staff Area]
 *             
 * @author Derek Peacock and Nicholas Day
 * @version 24/01/2022
 * @modified Samuel Baker
 */
public class Map
{
    private Location outside, storeEntrance, internalComponents, accessories, miscellaneous, aisle1, aisle2, aisle3, aisle4,
            aisle5, aisle6, aisle7, aisle8, staff1, staff2, staff3;

    public Location currentLocation;
    boolean gameOver;

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
        createInternalComponents();
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

        currentLocation = outside;
    }
    
    /**
     * Create the outside and link it to the
     * theatre, lab and pub
     */
    private void createOutside()
    {
        outside = new Location("outside the Main Entrance of the Store");
    }

    /**
     * Create store entrance and link it to the outside and sections of the store
     */
    private void createStoreEntrance()
    {
        System.out.print(ConsoleColours.ANSI_BG_CYAN);
        System.out.print(ConsoleColours.ANSI_BLACK);

        storeEntrance = new Location("inside the Store");

        outside.setExit("north", storeEntrance);
        storeEntrance.setExit("south", outside);
    }

    /**
     * Create the processors section and link it to the store entrance and aisles
     */
    private void createInternalComponents()
    {
        internalComponents = new Location("in the Internal Components Section");

        storeEntrance.setExit("west", internalComponents);
        internalComponents.setExit("east", storeEntrance);
    }

    /**
     * Create the accessories section and link it to the store entrance and aisles
     */
    private void createAccessories()
    {
        accessories = new Location("in the Accessories and Hardware Section");

        storeEntrance.setExit("north", accessories);
        accessories.setExit("south", storeEntrance);
    }

    /**
     * Create the miscellaneous section and link it to the store entrance and aisles
     */
    private void createMiscellaneous()
    {
        miscellaneous = new Location("in the Miscellaneous Section");

        storeEntrance.setExit("east", miscellaneous);
        miscellaneous.setExit("west", storeEntrance);
    }

    /**
     * Create aisle 1 linked to the internal components section
     */
    private void createAisle1()
    {
        aisle1 = new Location("in Aisle 1");

        internalComponents.setExit("west", aisle1);
        aisle1.setExit("east", internalComponents);

        Item cpu = new Item(ItemType.components, "cpu");
        aisle1.addItem(cpu);
    }
    /**
     * Create aisle 2 linked to the internal components section
     */
    private void createAisle2()
    {
        aisle2 = new Location("in Aisle 2");

        internalComponents.setExit("north", aisle2);
        aisle2.setExit("south", internalComponents);

        Item graphicsCard = new Item(ItemType.components, "graphics-card");
        aisle2.addItem(graphicsCard);
    }

    /**
     * Create aisle 3 linked to aisle 2
     */
    private void createAisle3()
    {
        aisle3 = new Location("in Aisle 3");

        aisle2.setExit("west", aisle3);
        aisle3.setExit("east", aisle2);

        Item wifiCard = new Item(ItemType.components, "wifi-card");
        aisle3.addItem(wifiCard);
    }

    /**
     * Create aisle 4 linked to the accessories section
     */
    private void createAisle4()
    {
        aisle4 = new Location("in Aisle 4");

        aisle4.setExit("east", accessories);
        accessories.setExit("west", aisle4);

        Item mouse = new Item(ItemType.peripherals, "mouse");
        aisle4.addItem(mouse);
    }

    /**
     * Create aisle 5 linked to the accessories section
     */
    private void createAisle5()
    {
        aisle5 = new Location("in Aisle 5");
        
        aisle5.setExit("south", accessories);
        accessories.setExit("north", aisle5);

        Item keyboard = new Item(ItemType.peripherals, "keyboard");
        aisle5.addItem(keyboard);
    }

    /**
     * Create aisle 6 linked to the miscellaneous section
     */
    private void createAisle6()
    {
        aisle6 = new Location("in Aisle 6");

        miscellaneous.setExit("north", aisle6);
        aisle6.setExit("south", miscellaneous);

        Item monitor = new Item(ItemType.peripherals, "monitor");
        aisle6.addItem(monitor);
    }

    /**
     * Create aisle 7 linked to aisle 6
     */
    private void createAisle7()
    {
        aisle7 = new Location("in Aisle 7");

        aisle6.setExit("east", aisle7);
        aisle7.setExit("west", aisle6);

        Item pcCase = new Item(ItemType.components, "pc-case");
        aisle7.addItem(pcCase);
    }

    /**
     * Create aisle 8 linked to the miscellaneous section
     */
    private void createAisle8()
    {
        aisle8 = new Location("in Aisle 8");

        miscellaneous.setExit("east", aisle8);
        aisle8.setExit("west", miscellaneous);

        Item hdmiCable = new Item(ItemType.accessories, "hdmi-cable");
        aisle8.addItem(hdmiCable);
    }

    /**
     * Create a staff area linked to the processors section
     */
    private void createStaffArea1()
    {
        staff1 = new Location("in the Staff Area - GAME OVER");

        aisle3.setExit("north", staff1);

        gameOver = true;
    }

    /**
     * Create a staff area linked to the accessories section
     */
    private void createStaffArea2()
    {
        staff2 = new Location("in the Staff Area - GAME OVER");

        aisle6.setExit("north", staff2);

        accessories.setExit("east", staff2);

        gameOver = true;
    }

    /**
     * Create a staff area linked to the miscellaneous section
     */
    private void createStaffArea3()
    {
        staff3 = new Location("in the Staff Area - GAME OVER");

        aisle8.setExit("south", staff3);

        gameOver = true;
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