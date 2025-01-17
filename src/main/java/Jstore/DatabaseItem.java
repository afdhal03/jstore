/**
* <h1>Item.java</h1>
* <p>
* Class ini merupakan bagian Database Item dari JStore Application
* Class ini representasi dari sebuah Database Item yang terdapat pada JStore Application
* </p>
*
* @author afdhal kurniawan
* @version 2019-02-28
*/

package jstore;
import java.util.ArrayList;
public class DatabaseItem
{
    //private Item[] listItem;
    //public static Item itemDB;
    private static ArrayList<Item> ITEM_DATABASE= new ArrayList<Item>();
    private static int LAST_ITEM_ID = 0;
 
    public static ArrayList<Item> getItemDatabase()
    {
        return ITEM_DATABASE;
    }
    
    public static int getLastItemID()
    {
        return LAST_ITEM_ID;
    }
    
    public static boolean addItem(Item item) throws ItemAlreadyExistsException
    {
        for (Item itemDB1 : ITEM_DATABASE ) {
            if(((itemDB1.getName().equals(item.getName())) && (itemDB1.getStatus() == item.getStatus()) &&
                    (itemDB1.getSupplier() == item.getSupplier()) && (itemDB1.getSupplier() == item.getSupplier()))){
                throw new ItemAlreadyExistsException(item);
            }
        }
        ITEM_DATABASE.add(item);
        LAST_ITEM_ID = item.getId();
        return true;
    }

    public static Item getItemFromID(int id)
    {
       for (Item itemDB2 : ITEM_DATABASE){
            if (itemDB2.getId() == id)
            {
                return itemDB2;
            }
       }
       return null;
    }
    
    public static ArrayList<Item> getItemFromSupplier(Supplier supplier)
    {
        ArrayList<Item> itemDB3 = new ArrayList<Item>();
        for (Item item : ITEM_DATABASE){
            if (item.getSupplier() == supplier ){
                itemDB3.add(item);
            }
        }
        if (itemDB3 != null){
            return itemDB3;
        }
        return null;
    }
    
    public static ArrayList<Item> getItemFromCategory(ItemCategory category)
    {
        ArrayList<Item> itemDB4 = new ArrayList<Item>();
        for (Item item : ITEM_DATABASE){
            if (item.getCategory() == category ){
                itemDB4.add(item);
            }
        }
        if (itemDB4 != null){
            return itemDB4;
        }
        return null;
    }
    
    public static ArrayList<Item> getItemFromStatus(ItemStatus status)
    {
        ArrayList<Item> bar = new ArrayList<Item>();
        for (Item item : ITEM_DATABASE){
            if (item.getStatus() == status ){
                bar.add(item);
            }
        }
        if (bar != null){
            return bar;
        }
        return null;
    }
    
    public static boolean removeItem(int id)
            throws ItemNotFoundException
    {
        for(Item item : ITEM_DATABASE){
            if(item.getId() == id)
            {
                ITEM_DATABASE.remove(id);
                return true;
            }
        }
        throw new ItemNotFoundException(id);
    }
}