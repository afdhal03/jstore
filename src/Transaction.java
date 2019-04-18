
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
    //inisialisasi variable

    /**
     * This is method for order new item
     * @param item_list Array List Item
     */
    public static void orderNewItem(ArrayList<Integer> item_list)
    {
//        ArrayList<Integer> barang= new ArrayList<Integer>();
//        barang.add(item.getId());
//        Invoice inv=new Buy_Paid(barang);
//        DatabaseInvoice.addInvoice(inv);
    }

    public static void orderSecondItem(ArrayList<Integer> item_list)
    {
//        ArrayList<Integer> barang= new ArrayList<Integer>();
//        item.setStatus(ItemStatus.Second);
//        barang.add(item.getId());
//        Invoice inv=new Buy_Paid(barang);
//        DatabaseInvoice.addInvoice(inv);
    }

    public static void orderRefurbishedItem(ArrayList<Integer> item_list)
    {
//        ArrayList<Integer> barang= new ArrayList<Integer>();
//        item.setStatus(ItemStatus.Refurbished);
//        barang.add(item.getId());
//        Invoice inv=new Buy_Paid(barang);
//        DatabaseInvoice.addInvoice(inv);
    }
    public static void sellItemPaid(ArrayList<Integer> item_list, Customer customer){
//        ArrayList<Integer> barang= new ArrayList<Integer>();
//        barang.add(item.getId());
//        Invoice inv=new Sell_Paid(barang,customer);
//        DatabaseInvoice.addInvoice(inv);
    }
    public static void sellItemUnpaid(ArrayList<Integer> item_list, Customer customer)
    {
//        ArrayList<Integer> barang= new ArrayList<Integer>();
//        barang.add(item.getId());
//        Invoice inv=new Sell_Paid(barang,customer);
//        DatabaseInvoice.addInvoice(inv);
    }
    public static void sellItemInstallment(ArrayList<Integer> item_list, Customer customer, int installmentPeriod)
    {
//        ArrayList<Integer> barang= new ArrayList<Integer>();
//        barang.add(item.getId());
//        Invoice inv=new Sell_Paid(barang,customer);
//        DatabaseInvoice.addInvoice(inv);

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





