
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
    private String listSupplier[];
    
    /**
    * Supplier dari Object Database Supplier yang dibuat
    */
    private Supplier supplier;

    /**
    * Method DatabaseSupplier merupakan Constructor dari DatabaseSupplier Class
    * Method ini dapat berisi nilai default dari variabel dalam DatabaseSupplier Class
    */
    public DatabaseSupplier(){
        
    }
    
    /**
    * Method ini merupakan method yang menambahkan Supplier baru
    * Kedalam Database Supplier
    * @param supplier Supplier yang ingin dimasukan kedalam database
    * @return nilai boolean apakah pemasukan supplier berhasil atau gagal
    */
    public static boolean addSupplier(Supplier supplier){
        return true;
    }
    
    /**
    * Method ini merupakan method yang menghapus Supplier
    * Dari Database Supplier
    * @param supplier Supplier yang ingin dihapus dari database
    * @return nilai boolean apakah penghapusan supplier berhasil atau gagal
    */
    public boolean removeSupplier(Supplier supplier){
        return true;
    }
    
    /**
    * Accessor Method untuk mengambil Supplier dari objek DatabaseSupplier
    * @return Supplier dari DatabaseSupplier Object
    */
    public Supplier getSupplier(){
        return supplier;
    }

    /**
    * Accessor Method untuk mengambil List Array Supplier dari objek DatabaseSupplier
    * @return List Array Supplier dari DatabaseSupplier Object
    */
    public String[] getListSupplier(){
        return listSupplier;
    }

    
}
