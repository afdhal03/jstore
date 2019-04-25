/**
* <h1>Item.java</h1>
* <p>
* Class ini merupakan bagian Database Supplier dari JStore Application
* Class ini representasi dari sebuah Database Supplier yang terdapat pada JStore Application
* </p>
*
* @author afdhal kurniawan
* @version 2019-02-28
*/

package jstore;
import java.util.ArrayList;

public class DatabaseSupplier
{
    private static ArrayList<Supplier> supplier_database = new ArrayList<Supplier>();
    private static int last_supplier_id = 0;

    public DatabaseSupplier(){

    }

    /**
     * This is accessor for get last customer ID
     * @return supplier_database
     */
    public static ArrayList<Supplier> getSupplierDatabase() {
        return supplier_database;
    }

    /**
     * This is accessor for get last supplier ID
     * @return last_supplier_id.
     */
    public static int getLastSupplierID() {
        return last_supplier_id;
    }

    /**
     * This method is used to insert new supplier to database
     * @param supplier this is the only parameter
     * @return boolean
     */
    public static boolean addSupplier(Supplier supplier) throws SupplierAlreadyExistsException{
        boolean suplaier = true;
        for (Supplier supplier1 : supplier_database) {
            if (supplier1.getName() == supplier.getName() &&
                    supplier1.getEmail() == supplier.getEmail() &&
                    supplier1.getPhoneNumber() == supplier.getPhoneNumber()) {
                //suplaier = false;
                throw new SupplierAlreadyExistsException(supplier);
            }
        }
        if (supplier_database.add(supplier)){
            last_supplier_id++;
            suplaier=true;
        }
        return suplaier;
    }

    /**
     * This method is used to remove supplier to database
     * @return boolean
     * @param id this is the only parameter
     */
    public static boolean removeSupplier(int id) throws SupplierNotFoundException{
        for (Supplier supplier1 : supplier_database) {
            if (supplier1.getId() == id) {
                DatabaseItem.getItemDatabase().removeAll(DatabaseItem.getItemFromSupplier(supplier1));
                supplier_database.remove(id);
                return true;
            }
        }
        throw new SupplierNotFoundException(id);
    }

    /**
     * This is accessor for get supplier
     * @param id integer
     * @return item.
     */
    public static Supplier getSupplier(int id) {
        Supplier hasil = null;
        for (Supplier supplier1 : supplier_database) {
            if (supplier1.getId() == id) {
                hasil = supplier1;
            }
        }
        return hasil;
    }

}
