
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
    
    /**
     * Constructor for objects of class Buy_Paid
     */
    public Sell_Paid(int id, Item item, int totalItem, Customer customer)
    {
        super(id, item, totalItem);
        this.customer=customer;
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
        "\nStatus = PAID"+
        "Sell success";
    }
}
