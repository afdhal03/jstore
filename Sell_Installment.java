
/**
 * Write a description of class Sell_Installment here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sell_Installment extends Invoice 
{
    // instance variables - replace the example below with your own
   
    private InvoiceType INVOICE_TYPE;
    private InvoiceStatus INVOICE_STATUS;
    private int installmentPeriod;
    private int installmentPrice;

    /**
     * Constructor for objects of class Sell_Installment
     */
    
    public Sell_Installment (int id, Item item, String date, 
    int totalItem, int totalPrice, int installmentPeriod)
    {
        super( id,      item,   date,   totalItem,  totalPrice);
        //this.id=id;
        //this.item=item;
        //this.date=date;
        //this.totalItem=totalItem;
        this.installmentPeriod=installmentPeriod;
        InvoiceType INVOICE_TYPE = InvoiceType.Sell;
        InvoiceStatus INVOICE_STATUS = InvoiceStatus.Installment;
    }

     public int getInstallmentPeriod()
    {
        return installmentPeriod;
    }
    
    public int getInstallmentPrice()
    {
        return installmentPrice;
    }
    
    public InvoiceStatus getInvoiceStatus()
    {
        return INVOICE_STATUS;
    }
    
    public InvoiceType getInvoiceType(){
        return INVOICE_TYPE;
    }

    public void setInstallmentPrice(int totalPrice){
        installmentPrice=(totalPrice*102/100)/installmentPeriod;

    }

    public void setTotalPrice(){
        totalPrice=installmentPrice*installmentPeriod;
    }

    public void printData(){
         System.out.println("==========INVOICE=======");
        System.out.println("ID :" + getId());
        System.out.println("Date :" + getDate());
        System.out.println("Item yang terdapat :" + getItem().getName());
        System.out.println("Total harga :" + totalPrice);
        System.out.println("Status :" + getStatus());
        System.out.println("Installment Price :" + installmentPrice);
    }
}
