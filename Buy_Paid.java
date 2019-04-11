
/**
 * Write a description of class Buy_Paid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Buy_Paid extends Invoice
{
    // instance variables - replace the example below with your own

     private static final InvoiceType INVOICE_TYPE = InvoiceType.Buy;
    private static final InvoiceStatus INVOICE_STATUS = InvoiceStatus.Paid;

    
    public Buy_Paid(int id, Item item, int totalItem)
    {
      
      super(id, item, totalItem);
    }
    
    public InvoiceStatus getInvoiceStatus(){
         return INVOICE_STATUS;
    }
    
    public InvoiceType getInvoiceType(){
         return INVOICE_TYPE;
    }
     public void setInvoiceStatus(InvoiceStatus status)
    {
    }
    
    public String toString() {
      return "==========INVOICE======="+
        "\nID ="+getId()+
        "\nItem =" + getItem().getName()+
        "\nAmount ="+ getTotalItem()+
        "\nBuy date =" + getDate()+
        "\nPrice ="+(getTotalPrice()/getTotalItem())+
        "\nPrice total =" + getTotalPrice()+
        "\nSupplier ID ="+ getItem().getSupplier().getId()+
        "\nSupplier name ="+ getItem().getSupplier().getName()+
        "\nStatus = PAID"+
        "Buy success";
   }
    
    public void printData(){
       System.out.println("==========INVOICE=======");
        System.out.println("ID: "+getId());
        System.out.println("Date: "+getDate());
        System.out.println("Item: "+getItem().getName());
        System.out.println("Invoice Status: "+getInvoiceStatus());
        System.out.println("Invoice Type: "+getInvoiceType());
        System.out.println("Total Price: "+getTotalPrice());    
    }
    
    

    
}
