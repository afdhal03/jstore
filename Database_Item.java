
/**
 * Write a description of class Database_Item here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Database_Item
{
    // instance variables - replace the example below with your own
    
    private String[] listItem;
    private Item item;

    /**
     * Constructor for objects of class Database_Item
     */
    public Database_Item()
    {
        // initialise instance variables
        
    }
    
    public boolean addItem(Item item){
        return true;
    }
    public boolean removeItem(){
        return true;
    }
    public Item getItem(){
        return item;
    }
    public String[] getItemDatabase(){
        return listItem;
    }

    
}
