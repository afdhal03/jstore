import java.util.ArrayList;
/**
 * Write a description of class DatabaseCostumer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DatabaseCustomer
{
     //private Customer[] listCustomer;
    
    private static ArrayList<Customer> CUSTOMER_DATABASE=new ArrayList<Customer>();
    private static int LAST_CUSTOMER_ID=0;
    

    public DatabaseCustomer()
    {    
    }
    
    
    public static ArrayList<Customer> getCustomerDatabase()
    {
        return CUSTOMER_DATABASE;
    }
    
    /**
     * Method addSupplier()
     * @param supplier
     * @return false
     */
    public static int getLastCustomer()
    {
        return LAST_CUSTOMER_ID;
    }
    
    //Menghapus supplier
    /**
     * Method remove Supplier()
     * @param supplier
     */
    public static boolean addCustomer(Customer customer)
    {
        boolean value=false;
        for(Customer customerDB : CUSTOMER_DATABASE)
        {
            if(customer.getName()!=customerDB.getName()&&customer.getEmail()!=customerDB.getEmail())
            {
            CUSTOMER_DATABASE.add(customer);
            LAST_CUSTOMER_ID=customer.getId();
            value=true;
            }
        }
        return value;
    }
    
    //Menampilkan nama supplier
    /**
     * Method getSupplier()
     * @return supplier
     */
    public static Customer getCustomer(int id)
    {
        Customer value=null;
        for(Customer customerDB : CUSTOMER_DATABASE)
        {
            if(customerDB.getId()==id)
            {
                value=customerDB;
            }
        }
        return value;
    }
    
    //Menampilkan list supplier
    /**
     * Method getListSupplier()
     * @return listSupplier
     */
    public static boolean removeCustomer(int id)
    {
        boolean value=false;
        for(Customer customerDB : CUSTOMER_DATABASE)
        {
            if(customerDB.getId()==id)
            {
                CUSTOMER_DATABASE.remove(id);
                value=true;
            }
        }
        return value;
    }
       
    
}