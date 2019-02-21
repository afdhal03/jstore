
/**
 * Write a description of class Invoice here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Invoice
{
    // instance variables - replace the example below with your own
    private int x;
    protected int id;
    protected int idItem;
    protected String date;
    protected int totalPrice;
    
    /**
     * Constructor for objects of class Invoice
     */
    public Invoice()
    {
        // initialise instance variables
        x = 0;
    }

    public int getId(){
         return 0;
    }
    public int getIdItem(){
         return 0;
    }
    public String getDate(){
         return "";
    }
    public int getaTotalPrice(){
         return 0;
    }
    
    public int setId(int id){
         return 0;
    }
    public int setIdItem(int idItem){
         return 0;
    }
    public String setDate(String date){
         return "";
    }
    public int setTotalPrice(int totalPrice){
         return 0;
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
