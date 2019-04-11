
/**
 * Write a description of class Sell_Installment here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sell_Installment extends Invoice 
{
    // instance variables - replace the example below with your own
   
    private static final InvoiceType INVOICE_TYPE = InvoiceType.Sell;
    private static final InvoiceStatus INVOICE_STATUS = InvoiceStatus.Installment;
    private int installmentPeriod;
    private int installmentPrice;
    private Customer customer;

    /**
     * Constructor for objects of class Sell_Installment
     */
    
   public Sell_Installment(int id, Item item, int totalItem, int installmentPeriod,Customer customer)
    {
        super(id, item, totalItem);
        this.installmentPeriod=installmentPeriod;
        this.customer=customer;
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
        return "==========INVOICE======="+
        "\nID ="+getId()+
        "\nItem =" + getItem().getName()+
        "\nAmount ="+ getTotalItem()+
        "\nBuy date =" + getDate()+
        "\nPrice ="+(getTotalPrice()/getTotalItem())+
        "\nPrice total =" + getTotalPrice()+
        "\nInstallment price ="+ getInstallmentPrice()+
        "\nSupplier ID ="+ getItem().getSupplier().getId()+
        "\nSupplier name ="+ getItem().getSupplier().getName()+
        "\nCustomer ID ="+ getCustomer().getId()+
        "\nCustomer name ="+ getCustomer().getName()+
        "\nStatus = INSTALLMENT"+
        "\nInstallment period ="+ getInstallmentPeriod()+
        "Sell success";
    }
    
    public void printData(){
          System.out.println("===========INVOICE Sell_Installment==========");
        System.out.println("ID: "+getId());
        System.out.println("Date: "+getDate());
        System.out.println("Item: "+getItem().getName());
        System.out.println("Invoice Status: "+getInvoiceStatus());
        System.out.println("Invoice Type: "+getInvoiceType());
        //setInstallmentPrice();
        setTotalPrice();
        //System.out.println("Total Price: "+totalPrice);
        System.out.println("Price Installment: "+ installmentPrice);
    }
    
}
