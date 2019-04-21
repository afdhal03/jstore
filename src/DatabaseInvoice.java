

/**
 * Kelas digunakan sebagai informasi database dari invoice
 *
 * @author Afdhal Kurniawan
 * @version 2019-02-28
 */


import java.util.ArrayList;


public class DatabaseInvoice
{
    private static ArrayList<Invoice> INVOICE_DATABASE = new ArrayList<Invoice>();
    private static int LAST_INVOICE_ID = 0;

    public static ArrayList<Invoice> getInvoiceDatabase(){
        return INVOICE_DATABASE;
    }

    public static int getLastInvoiceID(){
        return LAST_INVOICE_ID;
    }

    public static boolean addInvoice(Invoice invoice) throws InvoiceAlreadyExistsException {
        for (Invoice invoice1: INVOICE_DATABASE) {
            if ((invoice.getCustomer().equals(invoice1.getCustomer()))) {
                throw new InvoiceAlreadyExistsException(invoice);
            }
        }
        INVOICE_DATABASE.add(invoice);
        LAST_INVOICE_ID = invoice.getId();
        return true;
    }


    public static Invoice getInvoice(int id)
    {
        for (Invoice invoice : INVOICE_DATABASE) {
            if (id == invoice.getId()) {
                return invoice;
            }
        }
        return null;
    }

    public static ArrayList<Invoice> getActiveOrder(Customer customer) throws CustomerDoesntHaveActiveException {
        ArrayList<Invoice> temp = new ArrayList<>();
        for (Invoice invoice : INVOICE_DATABASE) {
            if (customer.equals(invoice.getCustomer()) && invoice.getIsActive() && (invoice.getInvoiceStatus().equals(InvoiceStatus.Unpaid)||invoice.getInvoiceStatus().equals(InvoiceStatus.Installment)) ) {
                temp.add(invoice);
            }
        }
        if(temp.size()>0){
            return temp;
        }
        else{
            throw new CustomerDoesntHaveActiveException(customer);
        }
    }

    public static boolean removeInvoice(int id) throws InvoiceNotFoundException {
        for(Invoice invoice : INVOICE_DATABASE) {
            if (id == invoice.getId()) {
                if (invoice.getIsActive()==true) {
                    invoice.setIsActive(false);
                    INVOICE_DATABASE.remove(invoice);
                    return true;
                }
            }
        }
        throw new InvoiceNotFoundException(id);
    }

    /**
     * Method of class DatabaseInvoice
     * @return listSupplier
     */

}