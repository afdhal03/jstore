
/**
* <h1>Invoice.java</h1>
* <p>
* Class ini merupakan bagian invoice dari JStore Application
* Class ini representasi dari sebuah invoice yang terdapat pada JStore Application
* </p>
*
* @author afdhal kurniawan
* @version 2019-02-28
*/
public abstract class Invoice
{
    /**
    * ID dari Object Invoice yang dibuat
    */
    private int id;
    
    /**
    * Item dari Object Invoice yang dibuat
    */
    private Item item;
    
    /**
    * Tanggal dari Object Invoice yang dibuat
    */
    private String date;
    
    /**
    * Total Harga dari Object Invoice yang dibuat
    */
    protected int totalPrice;
    
    
    private int totalItem;
    private InvoiceStatus status;
    private InvoiceType type;
    
    

    /**
    * Method Invoice merupakan Constructor dari Invoice Class
    *
    * @param id             ID dari objek invoice yang dibuat
    * @param item           Item dari objek invoice yang dibuat
    * @param date           Tanggal dari objek invoice yang dibuat
    * @param totalPrice     Total Harga dari objek invoice yang dibuat
    */
    public Invoice( int id, Item item, String date, int totalItem, int totalPrice)
    {
        // initialise instance variables
      this.id=id;
        this.item=item;
        this.date=date;
        this.totalPrice=totalPrice;
        this.totalItem=totalItem;
    }

    /**
    * Accessor Method untuk mengambil nilai ID dari objek Invoice
    * @return Nilai ID dari Invoice Object
    */
    public int getId(){
         return id;
    }
    
    /**
    * Accessor Method untuk mengambil Item dari objek Invoice
    * @return Item dari Invoice Object
    */
    public Item getItem(){
         return item;
    }
    
    /**
    * Accessor Method untuk mengambil String Date dari objek Invoice
    * @return String Date dari Invoice Object
    */
    public String getDate(){
         return date;
    }
    
    /**
    * Accessor Method untuk mengambil nilai TotalPrice dari objek Invoice
    * @return Nilai TotalPrice dari Invoice Object
    */
    public int getTotalPrice(){
         return totalPrice;
    }
    
    public abstract InvoiceStatus getInvoiceStatus();
    
    public abstract InvoiceType getInvoiceType();
    
    public int getTotalItem(){
         return totalItem;
    }
    
    /**
    * Mutator Method untuk mengubah ID dari objek Invoice
    * @param id Nilai ID yang diinginkan
    */
    public void setId(int id){
         this.id=id;
    }
    
     /**
    * Mutator Method untuk mengubah Item dari objek Invoice
    * @param item Item yang diinginkan
    */
    public void setItem(Item item){
         this.item=item;
    }
    
    /**
    * Mutator Method untuk mengubah Date dari objek Invoice
    * @param date String Date yang diinginkan
    */
    public void setDate(String date){
         this.date=date;
    }
    
    /**
    * Mutator Method untuk mengubah ID dari objek Invoice
    * @param totalPrice Nilai TotalPrice yang diinginkan
    */
    public void setTotalPrice(int totalPrice){
         this.totalPrice=totalPrice;
    }
    
    
    public void setTotalItem(int totalItem){
         this.totalItem=totalItem;
    }
    
    public void setInvoiceStatus(InvoiceStatus status){
         this.status=status;
    }
    
    
    
    
    /**
    * Sebuah Method untuk melakukan Print Data dari Object Invoice (totalPrice)
    */
    public void printData(){
         System.out.println("==========INVOICE=======");
         System.out.println("ID :" + id);
         System.out.println("Date :" + date);
         System.out.println("Item yang terdapat :" + item);
         System.out.println("Total Item :" + totalItem);
         System.out.println("Total harga :" + totalPrice);
         System.out.println("Status :" + status);
    }
    
    
    
}
