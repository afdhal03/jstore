
/**
 * Write a description of class DatabaseCostumer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DatabaseCostumer
{
     private Customer[] listCustomer;
    
    
    
    public DatabaseCostumer()
    {
    }
    
     /**
     * method ini digunakan untuk menambah costumer kedalam database
     *
     * @return boolean true
     */
    
    public boolean addCustomer(Customer customer)
    {
        return false;
    }
      
     
    public static void removeCustomer(Customer customer)
    {
        
    }
   public Customer getCustomer()
    {
        return listCustomer[0];
    }
    /**
     * Method yang digunakan untuk mereturn nilai dari database costumer
     * 
     * @return list costumer
     */
     public Customer[] getListCustomer()
    {
        return listCustomer;
    }
    
    
}