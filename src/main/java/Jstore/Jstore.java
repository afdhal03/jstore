/**
* <h1>JStore.java</h1>
* <p>
* Class ini merupakan main class dari JStore Application
* </p>
*
* @author afdhal kurniawan
* @version 2019-02-28
*/
package jstore;
import java.util.ArrayList;
import javax.xml.crypto.Data;
import java.util.*;
import java.text.SimpleDateFormat;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
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

        SpringApplication.run(Jstore.class, args);

        /*
      Location lokasi = new Location ( "sumbar","panas","padang");
        System.out.println("\n================== Supplier Already Exist ==================");
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

        System.out.println("\n================== Customer Already Exist ==================");
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

        System.out.println("\n================== Item Already Exist ==================");
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


        System.out.println("\n================== Invoice Already Exist ==================");
      ArrayList<Integer> item1 = new ArrayList<>();
      item1.add(1);
      item1.add(2);


       try {
           DatabaseInvoice.addInvoice(new Sell_Paid(item1, DatabaseCustomer.getCustomer(1)));
           DatabaseInvoice.addInvoice(new Sell_Unpaid(item1, DatabaseCustomer.getCustomer(2)));
        } catch (InvoiceAlreadyExistsException i) {
           System.out.println(i.getExMessage());
       }


        try {
            DatabaseInvoice.removeInvoice(9);
        } catch (InvoiceNotFoundException e) {
            System.out.println("======== Invoice Not Found ============");
            System.out.println(e.getExMessage());
        }

        try {
            DatabaseCustomer.removeCustomer(5);
        } catch (CustomerNotFoundException e) {
            System.out.println("======== Customer Not Found ============");
            System.out.println(e.getExMessage());
        }

        try {
            DatabaseSupplier.removeSupplier(5);
        } catch (SupplierNotFoundException e) {
            System.out.println("======== Supplier Not Found ============");
            System.out.println(e.getExMessage());
        }

        try {
            DatabaseItem.removeItem(9);
        } catch (ItemNotFoundException e) {
            System.out.println("======== Item Not Found ============");
            System.out.println(e.getExMessage());
        }

        try {
            DatabaseInvoice.getActiveOrderCustomer(DatabaseCustomer.getCustomer(3));
        } catch (CustomerDoesntHaveActiveException e) {
            System.out.println("======== Don't Have Active ============");
            System.out.println(e.getExMessage());
        }

        ArrayList<Item> tempBrg = DatabaseItem.getItemDatabase();
        for(Item temp: tempBrg){
            System.out.println(temp.toString());
        }

        ArrayList<Supplier> supplier_temp = DatabaseSupplier.getSupplierDatabase();
        for(Supplier temp: supplier_temp){
            System.out.println(temp.toString());
        }

        ArrayList<Customer> sementaraCustomer = DatabaseCustomer.getCustomerDatabase();
        for(Customer sementara: sementaraCustomer){
            System.out.println(sementara.toString());
        }

        ArrayList<Invoice> tempinv = DatabaseInvoice.getInvoiceDatabase();
        System.out.println(tempinv);
        System.out.println();
        System.out.println();









        System.out.println("\n================== Supplier Not Found ==================");
        try {
            DatabaseSupplier.removeSupplier(5);
        } catch (SupplierNotFoundException e) {
            System.out.println(e.getExMessage());
        }

        System.out.println("\n================== Customer Not Found ==================");
        try {
            DatabaseCustomer.removeCustomer(5);
        } catch (CustomerNotFoundException e) {
            System.out.println(e.getExMessage());
        }

        System.out.println("\n================== Item Not Found ==================");
        try {
            DatabaseItem.removeItem(5);
        } catch (ItemNotFoundException e) {
            System.out.println(e.getExMessage());
        }

        System.out.println("\n================== Invoice Not Found ==================");
        try {
            DatabaseInvoice.removeInvoice(5);
        } catch (InvoiceNotFoundException e) {
            System.out.println(e.getExMessage());
        }

        System.out.println("\n================== Don't Have Active ==================");
        try {
            DatabaseInvoice.getActiveOrderCustomer(DatabaseCustomer.getCustomer(2));
        } catch (CustomerDoesntHaveActiveException e) {
            System.out.println(e.getExMessage());
        }

        System.out.println("\n========================RESULT========================");
        System.out.println("========================Supplier========================");
        for(Supplier supplier : DatabaseSupplier.getSupplierDatabase()){
            System.out.println(supplier);
        }
        System.out.println("========================Item========================");
        for(Item item : DatabaseItem.getItemDatabase()){
            System.out.println(item);
        }
        System.out.println("========================Customer========================");
        for( Customer cus : DatabaseCustomer.getCustomerDatabase()){
            System.out.println(cus);
        }
        System.out.println("========================Invoice========================");
        for(Invoice invoice : DatabaseInvoice.getInvoiceDatabase()){
            System.out.println(invoice);
        }

        */
       
    }
      
    
}


