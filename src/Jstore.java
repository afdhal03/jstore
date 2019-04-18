/**
* <h1>JStore.java</h1>
* <p>
* Class ini merupakan main class dari JStore Application
* </p>
*
* @author afdhal kurniawan
* @version 2019-02-28
*/
import java.util.ArrayList;
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
      Location lokasi = new Location ( "sumbar","panas","padang");
        try {
            DatabaseSupplier.addSupplier(new Supplier("afdhal1","afdhal1@gmail.com","1234561",lokasi));
            DatabaseSupplier.addSupplier(new Supplier("afdhal2","afdhal2@gmail.com","1234562",lokasi));
            DatabaseSupplier.addSupplier(new Supplier("afdhal3","afdhal3@gmail.com","1234563",lokasi));
            DatabaseSupplier.addSupplier(new Supplier("afdhal3","afdhal3@gmail.com","1234563",lokasi));
        } catch (SupplierAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }

      for(Supplier s : DatabaseSupplier.getSupplierDatabase())
      {
          System.out.println(s);
      }

        try {
            DatabaseCustomer.addCustomer(new Customer("kurniawan1","kurniawan1@gmail.com","kurniawan_1","password1",1998,3,1));
            DatabaseCustomer.addCustomer(new Customer("kurniawan2","kurniawan2@gmail.com","kurniawan_2","password2",1998,3,2));
            DatabaseCustomer.addCustomer(new Customer("kurniawan3","kurniawan3@gmail.com","kurniawan_3","password3",1998,3,3));
        } catch (CustomerAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }

      for(Customer c : DatabaseCustomer.getCustomerDatabase())
      {
          System.out.println(c);
      }


        try {
            DatabaseItem.addItem(new Item("soto1",1000,ItemCategory.Electronics,ItemStatus.New,DatabaseSupplier.getSupplier(1)));
            DatabaseItem.addItem(new Item("soto2",2000,ItemCategory.Electronics,ItemStatus.New,DatabaseSupplier.getSupplier(2)));
            DatabaseItem.addItem(new Item("soto3",3000,ItemCategory.Electronics,ItemStatus.New,DatabaseSupplier.getSupplier(3)));
        } catch (ItemAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }

      for(Item i : DatabaseItem.getItemDatabase())
      {
          System.out.println(i);
      }


      ArrayList<Integer> item1 = new ArrayList<>();
      item1.add(1);
      item1.add(2);


       try {
            DatabaseInvoice.addInvoice(new Sell_Paid(item1,DatabaseCustomer.getCustomer(1)));
            DatabaseInvoice.addInvoice(new Sell_Unpaid(item1,DatabaseCustomer.getCustomer(2)));
        } catch (InvoiceAlreadyExistsException e) {
            System.out.println(e.getExMessage());
        }

             
      
     
      //Transaction.finishTransaction(DatabaseInvoice.getInvoice(1));
      //Transaction.cancelTransaction(DatabaseInvoice.getInvoice(2));
        //for(Invoice invoice : DatabaseInvoice.getInvoiceDatabase())
        //{
          //  System.out.println(invoice);
        //}
       
        
       //Location location = new Location("Depok", "Jawa Barat", "ramai");
       //Supplier supplier = new Supplier(1, "afdhal", "afdhal.com", "123",location);
       //Item item = new Item(1, "Afdhal", 100, ItemStatus.New, 10000, supplier , ItemCategory.Electronics);
       //DatabaseItem.addItem(item);
       //Transaction.orderNewItem(DatabaseItem.getItem());
       //Transaction.sellItemPaid(DatabaseItem.getItem());
       //Transaction.sellItemUnpaid(DatabaseItem.getItem());
       //Transaction.sellItemInstallment(DatabaseItem.getItem());
             
       
    }
      
    
}


