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


import java.util.ArrayList;

public class DatabaseSupplier
{
    // variabel yang digunakan dalam class
    private static ArrayList<Supplier> SUPPLIER_DATABASE = new ArrayList<Supplier>();
    private static int LAST_SUPPLIER_ID = 0;

    public static ArrayList<Supplier> getSupplierDatabase(){
        return SUPPLIER_DATABASE;
    }

    public static int getLastSupplierID(){
        return LAST_SUPPLIER_ID;
    }

    public static boolean addSupplier(Supplier supplier) throws SupplierAlreadyExistsException {
        String email = supplier.getEmail();
        String name = supplier.getName();
        String phoneNumber = supplier.getPhoneNumber();
        for (Supplier supplier1 : SUPPLIER_DATABASE) {
            if ((supplier.getEmail().equals(supplier1.getEmail())) && (supplier.getPhoneNumber().equals(supplier1.getPhoneNumber()))) {
                throw new SupplierAlreadyExistsException(supplier1);
            }
        }
        SUPPLIER_DATABASE.add(supplier);
        LAST_SUPPLIER_ID = supplier.getId();
        return true;
    }

    public static Supplier getSupplier(int id) {
        for (Supplier supplier : SUPPLIER_DATABASE) {
            if (supplier.getId() == id) {
                return supplier;
            }
        }
        return null;
    }

    public static boolean removeSupplier(int id) throws SupplierNotFoundException {
        for (Supplier supplier : SUPPLIER_DATABASE) {
            if (supplier.getId() == id) {
                return true;
            }
        }
        throw new SupplierNotFoundException(id);
    }

}
