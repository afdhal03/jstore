import java.util.Calendar;
import java.util.ArrayList;
/**
 * Write a description of class Sell_Unpaid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sell_Unpaid extends Invoice
{
    // instance variables - replace the example below with your own
    static final private InvoiceType INVOICE_TYPE= InvoiceType.Sell;
    static final private InvoiceStatus INVOICE_STATUS= InvoiceStatus.Unpaid;
    private Calendar dueDate;
    private Customer customer;
    private boolean isActive;

    /**
     * Constructor for objects of class Sell_Unpaid
     */
    public Sell_Unpaid(ArrayList<Integer> item, Customer customer)
    {
        super(item);
        this.customer=customer;
        isActive=true;
    }

    
    public Customer getCustomer()
    {
        return customer;
    }
    
    public boolean getIsActive()
    {
        return true;
    }
    
    public InvoiceStatus getInvoiceStatus(){
         return INVOICE_STATUS;
    }
    
    public InvoiceType getInvoiceType(){
         return INVOICE_TYPE;
    }
    
    public Calendar getDueDate()
    {
        return dueDate;
    }
    
     public void setCustomer(Customer customer)
    {
        this.customer=customer;
    }
    
    public void setDueDate(Calendar dueDate)
    {
        this.dueDate=dueDate;
    }
    
    public void setInvoiceStatus(InvoiceStatus status)
    {
    }
    
    public String toString()
    {
        String string="==========INVOICE=======";
        string += "\nID ="+getId();
        string += "\nBuy date =" + getDate();
        for (Integer invoice : getItem())
        {
            Item item = DatabaseItem.getItemFromID(invoice.intValue());
            string += "\nItem: " + item.getName();
            string += "\nAmount: " + getItem().size();
            string += "\nPrice: " + item.getPrice();
            string += "\nSupplier ID: " + item.getSupplier().getId();
            string += "\nSupplier Name: " + item.getSupplier().getName();
        }
        string += "\nPrice Total: " + getTotalPrice();
        string += "\nCustomer ID: " + customer.getId();
        string += "\nCustomer Name: " + customer.getName();
        string += "\nStatus: " + INVOICE_STATUS;
        string += "\nDue date: " + getDueDate();
        string += "\nIf payment is not received by dueDate, transaction will be cancelled.";
        return string;
    }
    
    public void printData(){
        System.out.println("==========INVOICE=======");
        System.out.println("ID: "+getId());
        System.out.println("Date: "+getDate());
        //System.out.println("Item: "+getItem().getName());
        System.out.println("Invoice Status: "+getInvoiceStatus());
        System.out.println("Invoice Type: "+getInvoiceType());
        System.out.println("Total Price: "+getTotalPrice());    
        System.out.println("DueDate: "+getDueDate());   
    }

    
}
