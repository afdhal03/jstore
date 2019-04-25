
/**
 * Write a description of class Transaction here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
package jstore;
import java.util.*;
import javax.xml.crypto.Data;
import java.lang.reflect.Array;
import java.util.ArrayList;



public class Transaction
{
    public static void orderNewItem(ArrayList<Integer> item_list) throws InvoiceAlreadyExistsException {
        item_list.add(DatabaseItem.getLastItemID());
        Invoice inv = new Buy_Paid(item_list);
        DatabaseInvoice.addInvoice(inv);
    }

    public static void orderSecondItem(ArrayList<Integer> item_list) throws InvoiceAlreadyExistsException {
        item_list.add(DatabaseItem.getLastItemID());
        Invoice inv = new Buy_Paid(item_list);
        DatabaseInvoice.addInvoice(inv);
    }

    public static void orderRefurbishedItem(ArrayList<Integer> item_list) throws InvoiceAlreadyExistsException {
        item_list.add(DatabaseItem.getLastItemID());
        Invoice inv = new Buy_Paid(item_list);
        DatabaseInvoice.addInvoice(inv);
    }

    public static void sellItemPaid(ArrayList<Integer> item_list , Customer customer) throws InvoiceAlreadyExistsException {
        item_list.add(DatabaseItem.getLastItemID());
        Invoice inv = new Sell_Paid(item_list, customer);
        DatabaseInvoice.addInvoice(inv);
    }

    public static void sellItemUnpaid(ArrayList<Integer> item_list, Customer customer) throws InvoiceAlreadyExistsException {
        item_list.add(DatabaseItem.getLastItemID());
        Invoice inv = new Sell_Unpaid(item_list, customer);
        DatabaseInvoice.addInvoice(inv);
    }

    public static void sellItemInstallment(ArrayList<Integer> item_list, Customer customer) throws InvoiceAlreadyExistsException {
        item_list.add(DatabaseItem.getLastItemID());
        Invoice inv = new Sell_Installment(item_list,10,customer);
        DatabaseInvoice.addInvoice(inv);
    }

    public static boolean finishTransaction(Invoice invoice){
        for (Invoice inv1 : DatabaseInvoice.getInvoiceDatabase()){
            if (inv1.getId()==invoice.getId() && (inv1.getInvoiceStatus().equals("UNPAID")
                    && inv1.getInvoiceStatus().equals("INSTALLMENT"))){
                invoice.setIsActive(false);
                System.out.println("Apakah status aktif? "+invoice.getIsActive());
                return true;
            }
        }
        return false;
    }
    public static boolean cancelTransaction(Invoice invoice){
        for (Invoice inv1 : DatabaseInvoice.getInvoiceDatabase()){
            if (inv1.getId()==invoice.getId() && (inv1.getInvoiceStatus().equals("UNPAID")
                    && inv1.getInvoiceStatus().equals("INSTALLMENT"))){
                try {
                    DatabaseInvoice.removeInvoice(invoice.getId());
                } catch (InvoiceNotFoundException e) {
                    e.printStackTrace();
                }
                System.out.print(invoice.getIsActive());
                return true;
            }
        }
        return false;
    }
}




