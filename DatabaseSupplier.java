import java.util.ArrayList;

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
public class DatabaseSupplier
{
    /**
    * List Array dari Supplier yang dibuat
    */
    //private Supplier[] listSupplier;
    
    
    private static ArrayList<Supplier> SUPPLIER_DATABASE = new ArrayList<Supplier>();
    private static int LAST_SUPPLIER_ID=0;
    /**
    * Supplier dari Object Database Supplier yang dibuat
    */
    //private Supplier supplier;

    /**
    * Method DatabaseSupplier merupakan Constructor dari DatabaseSupplier Class
    * Method ini dapat berisi nilai default dari variabel dalam DatabaseSupplier Class
    */
    public DatabaseSupplier(){
        
    }
    
    //Menambah supplier
    public static ArrayList<Supplier> getSupplierDatabase()
    {
        return SUPPLIER_DATABASE;
    }
    
    public static int getLastSupplierID()
    {
        return LAST_SUPPLIER_ID;
    }
    
    /**
     * Method addSupplier()
     * @param supplier
     * @return false
     */
    public static boolean addSupplier(Supplier supplier)
    {
        boolean value=false;
        for(Supplier supplierDB : SUPPLIER_DATABASE)
        {
            if(supplier.getName()!=supplierDB.getName()&&supplier.getEmail()!=supplierDB.getEmail()&&supplier.getPhoneNumber()!=supplierDB.getPhoneNumber())
            {
            SUPPLIER_DATABASE.add(supplier);
            LAST_SUPPLIER_ID=supplier.getId();
            value=true;
            }
        }
        return value;
    }
    
    //Menghapus supplier
    /**
     * Method remove Supplier()
     * @param supplier
     */
    //Menampilkan nama supplier
    /**
     * Method getSupplier()
     * @return supplier
     */
    public Supplier getSupplier(int id)
    {
        Supplier value=null;
        for(Supplier supplierDB : SUPPLIER_DATABASE)
        {
            if(supplierDB.getId()==id)
            {
                value=supplierDB;
            }
        }
        return value;
    }
    
    //Menampilkan list supplier
    /**
     * Method getListSupplier()
     * @return listSupplier
     */
    public static boolean removeSupplier(int id)
    {
        boolean value=false;
        for(Supplier supplierDB : SUPPLIER_DATABASE)
        {
            if(supplierDB.getId()==id)
            {
                DatabaseItem.getItemDatabase().removeAll(DatabaseItem.getItemFromSupplier(supplierDB));
                SUPPLIER_DATABASE.remove(id);
                value=true;
            }
        }
        return value;
    }
    
}
