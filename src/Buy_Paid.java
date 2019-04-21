
/**
 * Write a description of class Buy_Paid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.ArrayList;
public class Buy_Paid extends Invoice
{
    // instance variables - replace the example below with your own

    static final private InvoiceType INVOICE_TYPE = InvoiceType.Buy;
    static final private InvoiceStatus INVOICE_STATUS = InvoiceStatus.Paid;
    private boolean isActive;
    
   public Buy_Paid(ArrayList<Integer> item)
    {
        super(item);
        isActive=false;
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
    
    public void printData(){
       System.out.println("==========INVOICE=======");
        System.out.println("ID: "+getId());
        System.out.println("Date: "+getDate());
        //System.out.println("Item: "+getItem().getName());
        System.out.println("Invoice Status: "+getInvoiceStatus());
        System.out.println("Invoice Type: "+getInvoiceType());
        System.out.println("Total Price: "+getTotalPrice());    
    }
    
    

    
}
