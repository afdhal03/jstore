import java.util.ArrayList;
/**
 * Write a description of class Sell_Installment here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sell_Installment extends Invoice 
{
    // instance variables - replace the example below with your own
   
    static final private InvoiceType INVOICE_TYPE=InvoiceType.Sell;
    static final private InvoiceStatus INVOICE_STATUS=InvoiceStatus.Installment;
    private int installmentPeriod;
    private int installmentPrice;
    private Customer customer;
    private boolean isActive;

    /**
     * Constructor for objects of class Sell_Installment
     */
    
   public Sell_Installment(ArrayList<Integer> item, int InstallmentPeriod, Customer customer)
    {
        super(item);
        this.installmentPeriod=installmentPeriod;
        this.customer=customer;
        isActive=true;
    }


     public int getInstallmentPeriod()
    {
        return installmentPeriod;
    }
    
        
    public int getInstallmentPrice()
    {
        return installmentPrice;
    }
    
    public Customer getCustomer(){
         return customer;
    }
    
    public InvoiceStatus getInvoiceStatus()
    {
        return INVOICE_STATUS;
    }
    
    public InvoiceType getInvoiceType(){
        return INVOICE_TYPE;
    }

      
    public void setIntallmentPrice(int totalPrice)
    {
        installmentPrice=(totalPrice/installmentPeriod)*102/100;
    }
    
    public void setTotalPrice()
    {
        setTotalPrice(installmentPrice*installmentPeriod);
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
        string += "\nInstallment Price: " + installmentPrice;
        string += "\nCustomer ID: " + customer.getId();
        string += "\nCustomer Name: " + customer.getName();
        string += "\nStatus: " + INVOICE_STATUS;
        string += "\nInstallment period: " + installmentPeriod;
        string += "\nSell Success";
        return string;
    }
    
    public void printData(){
          System.out.println("===========INVOICE Sell_Installment==========");
        System.out.println("ID: "+getId());
        System.out.println("Date: "+getDate());
       // System.out.println("Item: "+getItem().getName());
        System.out.println("Invoice Status: "+getInvoiceStatus());
        System.out.println("Invoice Type: "+getInvoiceType());
        //setInstallmentPrice();
        setTotalPrice();
        //System.out.println("Total Price: "+totalPrice);
        System.out.println("Price Installment: "+ installmentPrice);
    }
    
}
