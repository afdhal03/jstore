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
    // variabel yang digunakan dalam class
    private static ArrayList<Item> item_database = new ArrayList<Item>();
    private static int last_item_id=0;

    public static ArrayList<Item> getItemDatabase(){
        return item_database;
    }
    public static int getLastItemID(){
        return last_item_id;
    }

    /**
     * This method is used to insert new item to database
     * @param item this is the only parameter
     */
    public static boolean addItem(Item item) throws ItemAlreadyExistsException {
        boolean tmbh = false;
        for (Item item1 : item_database) {
            if (item1.getName() == item.getName() &&
                    item1.getCategory() == item.getCategory() &&
                    item1.getStatus() == item.getStatus() &&
                    item1.getSupplier() == item.getSupplier()) {
                throw new ItemAlreadyExistsException(item);
            }
        }
        if (item_database.add(item)) {
            last_item_id++;
            tmbh=true;
        }
        return tmbh;
    }

    /**
     * This is accessor for get item
     * @return item.
     */
    public static Item getItemFromID(int id)
    {
        Item hasil=null;
        for (Item item2 : item_database){
            if (item2.getId()==id){
                hasil=item2;
            }
        }
        return hasil;
    }
    public static ArrayList<Item> getItemFromSupplier(Supplier supplier)
    {
        ArrayList<Item> hasil2 = null;
        for (Item item3 : item_database){
            if (item3.getSupplier()==supplier){
                hasil2.add(item3);
            }
        }
        return hasil2;
    }
    public static ArrayList<Item> getItemFromCategory(Item category)
    {
        ArrayList<Item> hasil2 = null;
        for (Item item3 : item_database){
            if (item3.getCategory()==category.getCategory()){
                hasil2.add(item3);
            }
        }
        return hasil2;
    }
    public static ArrayList<Item> getItemFromStatus(Item status)
    {
        ArrayList<Item> hasil2 = null;
        for (Item item3 : item_database){
            if (item3.getStatus()==status.getStatus()){
                hasil2.add(item3);
            }
        }
        return hasil2;
    }
    /**
     * This method is used to remove item to database
     * @param id this is the only parameter
     */
    public static boolean removeItem(int id) throws ItemNotFoundException
    {
        for (Item item1 : item_database) {
            if (item1.getId() == id ) {
                item_database.remove(id);
                return true;
            }
        }
        throw new ItemNotFoundException(id);
    }

}
