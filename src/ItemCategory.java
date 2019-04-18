/**
 * Enumeration class ItemCategory - write a description of the enum class here
 *
 * @author (your name here)
 * @version (version number or date here)
 */
public enum ItemCategory
{
    Electronics("Electronics"), 
    Furniture("Furniture"),
    Stationery("Stationery");
    
    private String Category;
    
    private ItemCategory(String Category) {
     this.Category = Category;
   }
   
   @Override
   public String toString() {
     return Category;
   }
    
}