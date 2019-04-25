/**
 * Enumeration class ItemStatus - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
package jstore;
public enum ItemStatus
{
    New("New"), 
    Second("Second"),
    Refurbished("Refurbished"),
    Sold("Sold");
    
    private String Status;
    
    private ItemStatus(String Status) {
     this.Status = Status;
   }

   @Override
   public String toString() {
     return Status;
   }
}