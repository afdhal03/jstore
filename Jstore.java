/**
* <h1>JStore.java</h1>
* <p>
* Class ini merupakan main class dari JStore Application
* </p>
*
* @author afdhal kurniawan
* @version 2019-02-28
*/
public class Jstore{
    
    /**
    * Method JStore merupakan Constructor dari JStore Class
    * Method ini dapat berisi nilai default dari variabel dalam JStore Class
    */
    public Jstore(){
     
    }
 
    /**
    * Method main merupakan main method dari JStore Application
    * @param args Unused
    * @return Nothing
    */
    public static void main (String[] args){
       Location location = new Location("Depok", "Jawa Barat", "ramai");
        Supplier supplier = new Supplier(1, "afdhal", "afdhal.com", "123", location);
        Item item = new Item(1, "Afdhal", 100, ItemStatus.New, 10000, supplier , ItemCategory.Electronics);
        DatabaseItem.addItem(item);
        Transaction.orderNewItem(item);
        Transaction.sellItemPaid(item);
        Transaction.sellItemUnpaid(item);
        Transaction.sellItemInstallment(item);
 
    
    }
      
    
}


