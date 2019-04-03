
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
public class DatabaseItem
{
    /**
    * List Array dari Item yang dibuat
    */
    private String listItem[];
    
    /**
    * Item dari Object Database Item yang dibuat
    */
    public static Item itemDB;

    
    /**
    * Method DatabaseItem merupakan Constructor dari DatabaseItem Class
    * Method ini dapat berisi nilai default dari variabel dalam DatabaseItem Class
    */
    public DatabaseItem()
    {
        // initialise instance variables
        
    }
    
    /**
    * Method ini merupakan method yang menambahkan Item baru
    * Kedalam Database Item
    * @param item Item yang ingin dimasukan kedalam database
    * @return nilai boolean apakah pemasukan item berhasil atau gagal
    */
    public static boolean addItem(Item item){
        itemDB = item; // use this to prevent confusion as the name variable is same
        
            return true;
    }
    
    /**
    * Method ini merupakan method yang menghapus Item
    * Dari Database Item
    * @param item Item yang ingin dihapus dari database
    * @return nilai boolean apakah penghapusan item berhasil atau gagal
    */
    public static boolean removeItem(){
       itemDB = null;
        return true;
    }
    
     /**
    * Accessor Method untuk mengambil Item dari objek DatabaseItem
    * @return Item dari DatabaseItem Object
    */
    public static Item getItem(){
        return itemDB;
    }
    
    /**
    * Accessor Method untuk mengambil List Array Item dari objek DatabaseItem
    * @return List Array Item dari DatabaseItem Object
    */
    public String[] getItemDatabase(){
        return listItem;
    }

    
}
