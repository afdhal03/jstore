
/**
 * Write a description of class Transaction here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;

public class Transaction
{

 public void orderNewItem(Supplier supplier)
    {
        Item newItem = new Item(1, "name", 1, 1, supplier, 
                                ItemStatus.New, ItemCategory.Electronics);
                                
        DatabaseItem.addItem(newItem);
                                
        Date date = new Date();
        Invoice newInvoice = new Invoice(1, newItem, 
                                        date.toString(),
                                        newItem.getPrice(),InvoiceStatus.Paid);
                                
        newItem.setStatus(ItemStatus.New); 
        newInvoice.setInvoiceStatus(InvoiceStatus.Paid);
        
        System.out.println("============Order New Item============");
        newItem.printData();
        newInvoice.printData();
    }
    
    
    public void orderSecondItem(Supplier supplier)
    {
         Item newItem = new Item(1, "Meja", 1, 1, supplier, 
                                ItemStatus.Second, ItemCategory.Electronics);
                                
        DatabaseItem.addItem(newItem);
                                
        Date date = new Date();
        Invoice newInvoice = new Invoice(1, newItem, 
                                        date.toString(),
                                        newItem.getPrice(),InvoiceStatus.Paid);
                                
        newItem.setStatus(ItemStatus.Second); 
        newInvoice.setInvoiceStatus(InvoiceStatus.Paid);
        
        System.out.println("============Order New Item============");        
        newInvoice.printData();         
        newItem.printData();   
        System.out.println();
    }
 
    
    public void orderRefurbishedItem(Supplier supplier)
    {
         Item newItem = new Item(1, "Meja", 1, 1, supplier, 
                                ItemStatus.Refurbished, ItemCategory.Electronics);
           
        DatabaseItem.addItem(newItem);                                
                                
        Date date = new Date();
        Invoice newInvoice = new Invoice(1, newItem, 
                                        date.toString(),
                                        newItem.getPrice(),InvoiceStatus.Paid);
                                
        newItem.setStatus(ItemStatus.Refurbished); 
        newInvoice.setInvoiceStatus(InvoiceStatus.Paid);
        
        System.out.println("============Order New Item============");  
        newInvoice.printData();         
        newItem.printData();  
        System.out.println();
    }
    
    public void sellItemPaid(Item item)
    {
        Date date = new Date();
        
        Invoice newInvoice = new Invoice(1, item, date.toString(),
                                        item.getPrice(),InvoiceStatus.Paid);
        newInvoice.setInvoiceStatus(InvoiceStatus.Paid); 
        item.setStatus(ItemStatus.Sold);
        
        System.out.println("============Order New Item============");        
        newInvoice.printData();
        item.printData();     
        System.out.println();
    }
    
    public void sellItemUnpaid(Item item)
    {
         Date date = new Date();
        
        Invoice newInvoice = new Invoice(1, item, date.toString(),
                                        item.getPrice(),InvoiceStatus.Paid);
        newInvoice.setInvoiceStatus(InvoiceStatus.Unpaid); 
        item.setStatus(ItemStatus.Sold);
        
        System.out.println("============Order New Item============");        
        newInvoice.printData();
        item.printData();   
        System.out.println();
        
    }
    
    public void sellItemInstallment(Item item)
    {
        Date date = new Date();
        
        Invoice newInvoice = new Invoice(1, item, date.toString(),
                                        item.getPrice(),InvoiceStatus.Paid);
        newInvoice.setInvoiceStatus(InvoiceStatus.Installment); 
        item.setStatus(ItemStatus.Sold);
        
        System.out.println("============Order New Item============");        
        newInvoice.printData();
        item.printData();    
        System.out.println();
    }
    
}





