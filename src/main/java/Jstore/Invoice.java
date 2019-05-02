
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
package jstore;
import java.util.*;
public abstract class Invoice
{
    private int id;
    private ArrayList<Integer> item = new ArrayList<Integer>();
    private Calendar date;
    private int totalPrice;
    private boolean isActive;
    private Customer customer;

    public Invoice(ArrayList<Integer> item)
    {
        // this.id=id;
        // this.totalItem=totalItem;
        // setTotalPrice(totalItem*item.getPrice());

        this.id = DatabaseInvoice.getLastInvoiceID()+1;
        this.item = item;
        this.date = Calendar.getInstance();
    }

    public int getId()
    {
        return id;
    }

    public ArrayList<Integer> getItem()
    {
        return item;
    }

    public Calendar getDate()
    {
        return date;
    }

    public int getTotalPrice()
    {
        return totalPrice;
    }

    public abstract InvoiceStatus getInvoiceStatus();

    public abstract InvoiceType getInvoiceType();

    public boolean getIsActive()
    {
        return isActive;
    }

    public Customer getCustomer()
    {
        return customer;
    }

    public void setId(int id)
    {
        this.id=id;
    }

    public void setItem(ArrayList<Integer> item)
    {
        this.item=item;
    }

    public void setDate(Calendar date)
    {
        this.date=date;
    }

    public void setTotalPrice(int totalPrice)
    {
        for(Integer invoice : item)
        {
            this.totalPrice=this.totalPrice+DatabaseItem.getItemFromID(invoice).getPrice();
        }
    }

    // public void setTotalItem(int totalItem)
    // {
    //   this.totalItem=totalItem;
    // }

    public void setInvoiceStatus(InvoiceStatus status)
    {
        // this.invoiceStatus=invoiceStatus;
    }

    public void setIsActive(boolean isActive)
    {
        this.isActive = isActive;
    }

    public abstract String toString();
}
