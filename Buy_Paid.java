
/**
 * Write a description of class Buy_Paid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Buy_Paid extends Invoice
{
    // instance variables - replace the example below with your own

    private InvoiceType INVOICE_TYPE;
    private InvoiceStatus INVOICE_STATUS;

    
    public Buy_Paid(int id,     Item item,     
    String date,     int totalItem, int totalPrice)
    {
      super( id,      item,   date,   totalItem,  totalPrice);
      //this.id=id;
      //this.item=item;
      //this.date=date;
      //this.totalItem=totalItem;
      //this.totalPrice=totalPrice;
      //this.status=status;
      InvoiceType INVOICE_TYPE = InvoiceType.Buy;
      InvoiceStatus INVOICE_STATUS = InvoiceStatus.Paid;  
    }
    
    public InvoiceStatus getInvoiceStatus(){
         return INVOICE_STATUS;
    }
    
    public InvoiceType getInvoiceType(){
         return INVOICE_TYPE;
    }
    
    public void printData(){
       System.out.println("==========INVOICE=======");
        System.out.println("ID :" + getid());
        System.out.println("Date :" + getdate());
        System.out.println("Item yang terdapat :" + getitem().getName());
        System.out.println("Total harga :" + gettotalPrice());
        System.out.println("Status :" + getStatus());
    }
    
    

    
}
