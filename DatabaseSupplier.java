
/**
 * Write a description of class DatabaseSupplier here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DatabaseSupplier
{
    // instance variables - replace the example below with your own
    private String[] listSupplier;
    private Supplier supplier;

    /**
     * Constructor for objects of class DatabaseSupplier
     */
    
    public DatabaseSupplier(){
    }
    
    public boolean addSupplier(Supplier supplier){
    	return true;
    }
    
    public boolean removeSupplier(Supplier supplier){
    	return true;
    }
    
    public Supplier getSupplier(){
    	return supplier;
    }

    public String[] getListSupplier(){
    	return listSupplier;
    }

    
}
