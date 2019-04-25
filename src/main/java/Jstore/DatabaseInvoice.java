

/**
 * Kelas digunakan sebagai informasi database dari invoice
 *
 * @author Afdhal Kurniawan
 * @version 2019-02-28
 */

package jstore;
import java.util.ArrayList;


public class DatabaseInvoice
{
    private static ArrayList<Invoice> invoice_database = new ArrayList<Invoice>();
    private static int last_invoice_id=0;

    /**
     * This is accessor for get invoice database
     * @return invoice database
     */
    public static ArrayList<Invoice> getInvoiceDatabase(){
        return invoice_database;
    }

    /**
     * This is accessor for get last invoice ID
     * @return last_invoice_id.
     */
    public static int getLastInvoiceID(){
        return last_invoice_id;
    }

    /**
     * This is method for adding invoice to database
     * @param invoice Invoice
     * @return boolean
     */
    public static boolean addInvoice(Invoice invoice) throws InvoiceAlreadyExistsException{
        for (Invoice inv1: invoice_database){
            if (inv1.getItem()==invoice.getItem() &&
                    inv1.getCustomer() == invoice.getCustomer()) {
                throw new InvoiceAlreadyExistsException(invoice);
            }
        }
        if (invoice_database.add(invoice)){
            last_invoice_id++;
        }
        return true;
    }

    /**
     * This is method for remove invoice from database
     * @param id int
     * @return boolean
     */
    public static Boolean removeInvoice(int id) throws InvoiceNotFoundException
    {
        for (Invoice invoice : invoice_database) {
            if (invoice.getId() == id && invoice.getIsActive()==true) {
                invoice.setIsActive(false);
                invoice_database.remove(invoice);
                return true;
            }
        }
        throw new InvoiceNotFoundException(id);
    }

    /**
     * This is accessor for getting invoice
     * @param id integer
     * @return invoice
     */
    public static Invoice getInvoice(int id){
        Invoice hasil=null;
        for (Invoice invoice : invoice_database){
            if (invoice.getId() == id){
                hasil=invoice;
            }
        }
        return hasil;
    }

    /**
     * This is accessor for get active order consumer's invoice
     * @param customer Customer
     * @return invoice
     */
    public static ArrayList<Invoice> getActiveOrderCustomer(Customer customer)
            throws CustomerDoesntHaveActiveException{
        ArrayList<Invoice> res = new ArrayList<>();
        for (Invoice invoice : invoice_database ) {
            if (invoice.getInvoiceType()==InvoiceType.Sell &&
                    (invoice.getInvoiceStatus()==InvoiceStatus.Installment ||
                            invoice.getInvoiceStatus()==InvoiceStatus.Paid)
                    &&invoice.getIsActive()==true) {
                res.add(invoice);
            }
        }
        throw new CustomerDoesntHaveActiveException(customer);
    }
}