
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
public class Database_Item
{
    /**
    * List Array dari Item yang dibuat
    */
    private String listItem[];
    
    /**
    * Item dari Object Database Item yang dibuat
    */
    private Item item;

    
    /**
    * Method DatabaseItem merupakan Constructor dari DatabaseItem Class
    * Method ini dapat berisi nilai default dari variabel dalam DatabaseItem Class
    */
    public Database_Item()
    {
        // initialise instance variables
        
    }
    
    /**
    * Method ini merupakan method yang menambahkan Item baru
    * Kedalam Database Item
    * @param item Item yang ingin dimasukan kedalam database
    * @return nilai boolean apakah pemasukan item berhasil atau gagal
    */
    public boolean addItem(Item item){
        return true;
    }
    
    /**
    * Method ini merupakan method yang menghapus Item
    * Dari Database Item
    * @param item Item yang ingin dihapus dari database
    * @return nilai boolean apakah penghapusan item berhasil atau gagal
    */
    public boolean removeItem(){
        return true;
    }
    
     /**
    * Accessor Method untuk mengambil Item dari objek DatabaseItem
    * @return Item dari DatabaseItem Object
    */
    public Item getItem(){
        return item;
    }
    
    /**
    * Accessor Method untuk mengambil List Array Item dari objek DatabaseItem
    * @return List Array Item dari DatabaseItem Object
    */
    public String[] getItemDatabase(){
        return listItem;
    }

    
}
