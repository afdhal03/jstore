
/**
 * Enumeration class InvoiceType - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
package jstore;
public enum InvoiceType
{
    Buy("Buy"), 
    Sell("Sell");
   
    private String Type;
    
    private InvoiceType(String Type) {
     this.Type = Type;
   }

   @Override
   public String toString() {
     return Type;
   }
}
