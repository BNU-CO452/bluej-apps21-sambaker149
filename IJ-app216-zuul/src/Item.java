public class Item
{
    public ItemType itemType;

    public String name;

    public int value;

    public Item(ItemType type, String name)
    {
        this.setItemType(type);
        this.setName(name);
        setValue(0);
    }

    public String getName()
    {
        return name;
    }

    public ItemType getItemType()
    {
        return itemType;
    }

    public void setItemType(ItemType itemType)
    {
        this.itemType = itemType;
    }

    public void setName(String name)
    {
        this.name = name;
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