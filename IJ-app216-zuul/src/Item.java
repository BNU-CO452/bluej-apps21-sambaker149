public class Item
{
    private ItemType itemType;
    private String name;
    private int value;

    public Item(ItemType type, String name)
    {
        this.itemType = type;
        this.name = name;
        value = 0;
    }
}
