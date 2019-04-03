
/**
 * Write a description of class Transaction here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;

public class Transaction
{
    public static void orderNewItem(Item item)
    {
        Invoice invoice = new Buy_Paid(1, item, "25/03/2020", 1, item.getPrice());
        if (invoice instanceof Sell_Paid)
        {
            System.out.println("Benar Invoice Type adalah Sell_Paid");
        }else
        {
            System.out.println("Salah, Invoice Type adalah Sell_Paid");
        }
        invoice.printData();
        item.printData();
       
    }

 
    
    
    public static void orderSecondItem(Item item)
    {
         Invoice invoice = new Buy_Paid(1, item, "25/03/2020", 1, item.getPrice());
        invoice.printData();
        item.printData();
    }
 
    
    public static void orderRefurbishedItem(Item item)
    {
         Invoice invoice = new Buy_Paid(1, item, "25/03/2020", 1, item.getPrice());
        invoice.printData();
        item.printData();
    }
    
    public static void sellItemPaid(Item item)
    {
        Invoice invoice = new Sell_Paid(1, item, "25/03/2020", 1, item.getPrice());
        invoice.printData();
        item.printData();
    }
    
    public static void sellItemUnpaid(Item item)
    {
         Invoice invoice = new Sell_Unpaid(1, item, "25/03/2020", 1, item.getPrice());
        invoice.printData();
        item.printData();
        
    }
    
    public static void sellItemInstallment(Item item)
    {
       Invoice invoice = new Sell_Installment(1, item, "25/03/2020", 1, item.getPrice(),5);
       invoice.printData();
       item.printData();
    }
    
    
}





