/**
 * Enumeration class ItemCategory - write a description of the enum class here
 *
 * @author afdhal kurniawan
 * @version 2019-03-13
 */

public enum InvoiceStatus
{
    Paid("Paid"), 
    Unpaid("Unpaid"),
    Installment("Installment");
    
    private String Status;
    
    private InvoiceStatus(String Status) {
     this.Status = Status;
   }

   @Override
   public String toString() {
     return Status;
   }
    
}