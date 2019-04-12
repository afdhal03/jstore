
/**
 * Write a description of class Transaction here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
import java.util.ArrayList;
public class Transaction
{
    public static void orderNewItem(Item item)
    {
         ArrayList<Integer> itemID = new ArrayList<Integer>();
        itemID.add(item.getId());
        Invoice invoice=new Buy_Paid(itemID);
        DatabaseInvoice.addInvoice(invoice);
        
        /*Invoice invoice = new Buy_Paid(1, item, "25/03/2020", 1, item.getPrice());
        if (invoice instanceof Sell_Paid)
        {
            System.out.println("Benar Invoice Type adalah Sell_Paid");
        }else
        {
            System.out.println("Salah, Invoice Type adalah Sell_Paid");
        }
        invoice.printData();
        item.printData();
       */
    }

 
    
    
    public static void orderSecondItem(Item item)
    {
         ArrayList<Integer> itemID = new ArrayList<Integer>();
        itemID.add(item.getId());
        Invoice invoice=new Buy_Paid(itemID);
        DatabaseInvoice.addInvoice(invoice);
        
        // Invoice invoice = new Buy_Paid(1, item, "25/03/2020", 1, item.getPrice());
       // invoice.printData();
      //  item.printData();
    }
 
    
    public static void orderRefurbishedItem(Item item)
    {
         ArrayList<Integer> itemID = new ArrayList<Integer>();
        itemID.add(item.getId());
        Invoice invoice=new Buy_Paid(itemID);
        DatabaseInvoice.addInvoice(invoice);
        
        // Invoice invoice = new Buy_Paid(1, item, "25/03/2020", 1, item.getPrice());
        //invoice.printData();
       // item.printData();
    }
    
    public static void sellItemPaid(Item item,Customer customer)
    {
        ArrayList<Integer> itemID = new ArrayList<Integer>();
        itemID.add(item.getId());
        Invoice invoice=new Sell_Paid(itemID,customer);
        DatabaseInvoice.addInvoice(invoice);
        
        //Invoice invoice = new Sell_Paid(1, item, "25/03/2020", 1, item.getPrice());
        //invoice.printData();
        //item.printData();
    }
    
    public static void sellItemUnpaid(Item item,Customer customer)
    {
        ArrayList<Integer> itemID = new ArrayList<Integer>();
        itemID.add(item.getId());
        Invoice invoice=new Sell_Unpaid(itemID,customer);
        DatabaseInvoice.addInvoice(invoice);
        
        // Invoice invoice = new Sell_Unpaid(1, item, "25/03/2020", 1, item.getPrice());
        //invoice.printData();
       // item.printData();
        
    }
    
    public static void sellItemInstallment(Item item,Customer customer,int installmentPeriod)
    {
        ArrayList<Integer> itemID = new ArrayList<Integer>();
        itemID.add(item.getId());
        Invoice invoice=new Sell_Installment(itemID,installmentPeriod,customer);
        DatabaseInvoice.addInvoice(invoice);
        
        //Invoice invoice = new Sell_Installment(1, item, "25/03/2020", 1, item.getPrice(),5);
       //invoice.printData();
       //item.printData();
    }
    
    public boolean finishTransaction(Invoice invoice)
    {
        boolean value=false;
        for (Invoice invoiceDB : DatabaseInvoice.getInvoiceDatabase()){
            if (invoiceDB.getId()==invoice.getId()){
                invoice.setIsActive(false);
                System.out.print(invoice.getIsActive());
                value=true;
            }
        }
        return value;
    }
    
    public boolean cancelTransaction(Invoice invoice)
    {
        boolean value=false;
        for (Invoice invoiceDB : DatabaseInvoice.getInvoiceDatabase()){
               if (invoiceDB.getId()==invoice.getId()){
                   DatabaseInvoice.removeInvoice(invoice.getId());
                   value=true;
               }
           }
        return value;
    }
    
    
}





