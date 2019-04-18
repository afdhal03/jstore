import java.util.ArrayList;

/**
 * Kelas digunakan sebagai informasi database dari invoice
 *
 * @author Afdhal Kurniawan
 * @version 2019-02-28
 */

public class DatabaseInvoice
{
    //variabel yang dipakai
    //private Invoice[] listInvoice;

    private static ArrayList<Invoice> INVOICE_DATABASE = new ArrayList<Invoice>();
    private static int LAST_INVOICE_ID=0;
    
    
     //Menambah supplier
    public static ArrayList<Invoice> getInvoiceDatabase()
    {
        return INVOICE_DATABASE;
    }
    
    public static int getLastInvoiceID()
    {
        return LAST_INVOICE_ID;
    }
    
    /**
     * Method addSupplier()
     * @param supplier
     * @return false
     */
    public static boolean addInvoice(Invoice invoice)
    {
        INVOICE_DATABASE.add(invoice);
        //tambahan
        LAST_INVOICE_ID=invoice.getId();
        return true;
    }
    
    public static Invoice getInvoice(int id)
    {
        for(Invoice invoice : INVOICE_DATABASE)
        {
            if(invoice.getId()==id)
            {
                return invoice;
            }
        }
        return null;
    }
    
    public static Invoice getActiveOrderCustomer(Customer customer)
    {
        for(Invoice invoice : INVOICE_DATABASE)
        {
            if((invoice.getInvoiceStatus()==InvoiceStatus.Installment||invoice.getInvoiceStatus()==InvoiceStatus.Paid)&&invoice.getIsActive()==true)
            {
                return invoice;
            }  
        }
        return null;
    }
    
    //Menghapus supplier
    /**
     * Method remove Supplier()
     * @param supplier
     */
    public static boolean removeInvoice(int id)
    {
        for(Invoice invoice : INVOICE_DATABASE)
        {
            if(invoice.getId()==id)
            {
                if(invoice.getIsActive()==true)
                {
                    invoice.setIsActive(false);
                }
                INVOICE_DATABASE.remove(id);
                return true;
            }
        }
        return false;
    }
}
