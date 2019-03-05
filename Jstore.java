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
        Location location =new Location ("padang", "dharmasraya" , "sawit");
        Supplier supplier = new Supplier (1,"afdhal", "afdhal@gmail.com", "08123456789", location);
        Item item = new Item (1,"soto", 100, 12000, "makanan", supplier);
        Invoice invoice = new Invoice (1,item,"05/03/2019",48000);
        System.out.println(supplier.getName());
        supplier.setName("ghifari");
        System.out.println(supplier.getName());
        item.printData();
        DataSupplier.addSupplier(suppiler);
    
    }
      
    
}


