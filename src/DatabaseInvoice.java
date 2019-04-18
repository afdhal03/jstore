import java.util.ArrayList;

/**
 * Kelas digunakan sebagai informasi database dari invoice
 *
 * @author Afdhal Kurniawan
 * @version 2019-02-28
 */
public class DatabaseInvoice
{
    private static ArrayList<Invoice> INVOICE_DATABASE= new ArrayList<Invoice>();
    private static int LAST_INVOICE_ID = 0;

    public static ArrayList<Invoice> getInvoiceDatabase()
    {
        return INVOICE_DATABASE;
    }

    public static int getLastInvoiceID()
    {
        return LAST_INVOICE_ID;
    }

    public static boolean addInvoice(Invoice invoice) throws InvoiceAlreadyExistsException
    {
        for(Invoice temp : INVOICE_DATABASE){
            if(invoice.getCustomer() == temp.getCustomer() && invoice.getItem() == temp.getItem()){
                throw new InvoiceAlreadyExistsException(invoice);
//                return false;
            }
        }
        INVOICE_DATABASE.add(invoice);
        LAST_INVOICE_ID = invoice.getId();
        return true;
    }

    public static Invoice getInvoice(int id)
    {
        for (Invoice invoice : INVOICE_DATABASE){
            if (invoice.getId() == id)
            {
                return invoice;
            }
        }
        return null;
    }

    public static ArrayList<Invoice> getActiveOrder(Customer customer) throws CustomerDoesntHaveActiveException
    {
        ArrayList<Invoice> invoice_list = new ArrayList<Invoice>();
        for (Invoice invoice : INVOICE_DATABASE)
        {
            if( (invoice.getCustomer() == customer)  && (invoice.getInvoiceStatus() == InvoiceStatus.Unpaid) || (invoice.getInvoiceStatus() == InvoiceStatus.Installment) ){
                invoice_list.add(invoice);
            }
        }
        if(invoice_list != null){
            return invoice_list;
        }
        else{
            throw new CustomerDoesntHaveActiveException(customer);
        }
    }

    public static boolean removeInvoice(int id) throws InvoiceNotFoundException
    {
        for(Invoice invoice : INVOICE_DATABASE){
            if(invoice.getId() == id){
                if (invoice.getIsActive() == true) {
                    invoice.setIsActive(false);
                }
                INVOICE_DATABASE.remove(invoice);
                return true;
            }
        }
        throw new InvoiceNotFoundException(id);
//        return false;
    }
}