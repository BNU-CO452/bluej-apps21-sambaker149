public class Item
{
    private ItemType itemType;

    private String itemName;

    private int value;

    public Item(ItemType type, String name)
    {
        this.setItemType(type);
        this.setItemName(name);
        setValue(0);
    }

    public String getName()
    {
        return itemName;
    }

    public ItemType getItemType()
    {
        return itemType;
    }

    public void setItemType(ItemType itemType)
    {
        this.itemType = itemType;
    }

    public void setItemName(String name)
    {
        this.itemName = name;
    }

    public int getValue()
    {
        return value;
    }

    public void setValue(int value)
    {
        this.value = value;
    }
}