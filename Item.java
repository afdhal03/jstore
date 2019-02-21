
/**
 * Write a description of class Item here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Item
{
    // instance variables - replace the example below with your own
    private int x;
    protected int id;
    protected String name;
    protected int stock;
    protected int price;
    protected String category;

    /**
     * Constructor for objects of class Item
     */
    public Item()
    {
        // initialise instance variables
        x = 0;
    }
    
    public int getId(){
        return 0;
    }
    public String getName(){
        return "";
    }
    public int getStock(){
        return 0;
    }
    public int getPrice(){
        return 0;
    }
    public String getCategory(){
        return "";
    }
    
    public int setId(int id){
        return 0;
    }
    public String setName(String name){
        return "";
    }
    public int setStock(int stock){
        return 0;
    }
    public int setPrice(int price){
        return 0;
    }
    public String setCategory(String category){
        return "";
    }
    

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
