import java.util.ArrayList;
/**
 * Write a description of class Buy_Paid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sell_Paid extends Invoice
{
    static final private InvoiceType INVOICE_TYPE=InvoiceType.Sell;
    static final private InvoiceStatus INVOICE_STATUS=InvoiceStatus.Paid;
    private Customer customer;
    private boolean isActive;
    /**
     * Constructor for objects of class Buy_Paid
     */
    public Sell_Paid(ArrayList<Integer> item, Customer customer)
    {
        super(item);
        this.customer=customer;
        isActive=false;
    }


    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public Customer getCustomer()
    {
        return customer;
    }
    
    public InvoiceStatus getInvoiceStatus()
    {
        return INVOICE_STATUS;
    }
    
    public InvoiceType getInvoiceType()
    {
        return INVOICE_TYPE;
    }
    
    public void setCustomer(Customer customer)
    {
        this.customer=customer;
    }
    
    public void setInvoiceStatus(InvoiceStatus status)
    {
    }
    
     public String toString()
    {
        StringBuilder total = new StringBuilder();
        for(int a : item){
            Item temp = DatabaseItem.getItemFormID(a);
            String stringTemp = null;
            if (temp != null) {
                stringTemp = temp.toString();
                total.append(stringTemp);
            }
            total.append("\n");
        }
        return total.toString();
    }
}
