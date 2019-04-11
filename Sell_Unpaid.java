import java.util.Calendar;
/**
 * Write a description of class Sell_Unpaid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sell_Unpaid extends Invoice
{
    // instance variables - replace the example below with your own
    private static final InvoiceType INVOICE_TYPE= InvoiceType.Sell;
    private static final InvoiceStatus INVOICE_STATUS= InvoiceStatus.Unpaid;
    private Calendar dueDate;
    private Customer customer;

    /**
     * Constructor for objects of class Sell_Unpaid
     */
    public Sell_Unpaid(int id, Item item, int totalItem, Customer customer)
    {
        super(id, item, totalItem);
        this.customer=customer;
        this.dueDate=Calendar.getInstance();
        this.dueDate.add(Calendar.DATE,1);
    }
    
    public Customer getCustomer()
    {
        return customer;
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
        return "==========INVOICE======="+
        "\nID ="+getId()+
        "\nItem =" + getItem().getName()+
        "\nAmount ="+ getTotalItem()+
        "\nBuy date =" + getDate()+
        "\nPrice ="+(getTotalPrice()/getTotalItem())+
        "\nPrice total =" + getTotalPrice()+
        "\nSupplier ID ="+ getItem().getSupplier().getId()+
        "\nSupplier name ="+ getItem().getSupplier().getName()+
        "\nCustomer ID ="+ getCustomer().getId()+
        "\nCustomer name ="+ getCustomer().getName()+
        "\nStatus = UNPAID"+
        "\nDue date ="+ getDueDate()+
        "If payment is not received by dueDate, transaction will be cancelled.";
    }
    
    public void printData(){
        System.out.println("==========INVOICE=======");
        System.out.println("ID: "+getId());
        System.out.println("Date: "+getDate());
        System.out.println("Item: "+getItem().getName());
        System.out.println("Invoice Status: "+getInvoiceStatus());
        System.out.println("Invoice Type: "+getInvoiceType());
        System.out.println("Total Price: "+getTotalPrice());    
        System.out.println("DueDate: "+getDueDate());   
    }

    
}
