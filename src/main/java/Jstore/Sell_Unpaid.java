
/**
 * Write a description of class Sell_Unpaid here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
package jstore;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
public class Sell_Unpaid extends Invoice
{
    private static final InvoiceType INVOICE_TYPE= InvoiceType.Sell;
    private static final InvoiceStatus INVOICE_STATUS= InvoiceStatus.Unpaid;
    private Calendar dueDate;
    private Customer customer;
    private boolean isActive;

    // public Sell_Unpaid(int id, ArrayList<Integer> item, int totalItem, Customer customer)
    // {
    //   super(id, item, totalItem);
    //   this.customer=customer;
    //   this.dueDate = Calendar.getInstance();
    //   this.dueDate.add(Calendar.DATE, +1);
    // }

    public Sell_Unpaid(ArrayList<Integer> item, Customer customer)
    {
        super(item);
        this.customer=customer;
        setIsActive(true);
        //this.isActive = true;
    }

    public InvoiceStatus getInvoiceStatus(){
        return INVOICE_STATUS;
    }

    public InvoiceType getInvoiceType(){
        return INVOICE_TYPE;
    }

    public Customer getCustomer(){
        return customer;
    }

    public Calendar getDueDate(){
        return dueDate;
    }

    public void setCustomer(Customer customer)
    {
        this.customer=customer;
    }

    public void setDueDate(Calendar dueDate)
    {
        this.dueDate=dueDate;
    }

    // public void setInvoiceStatus(InvoiceStatus status)
    // {

    // }

    public String toString()
    {
        setTotalPrice(0);
        for (int temp1 : this.getItem())
        {
            System.out.println(DatabaseItem.getItemFromID(temp1).toString());
        }

        SimpleDateFormat sdf = new SimpleDateFormat ("dd MMMMM yyyy");

        return "========INVOICE========" +
                "\nID: " +  getId() +
//		"\nItem: " + getItem().getName() +
//		"\nAmount: "  + getTotalItem() +
                "\nBuy date: " + sdf.format(getDate().getTime()) +
//		"\nPrice: " + getItem().getPrice() +
                "\nTotal price: " + getTotalPrice() +
//		"\nSupplier ID: " + getItem().getSupplier().getId() +
//		"\nSupplier name: " + getItem().getSupplier().getName() +
                "\nCustomer ID: " + customer.getId() +
                "\nCustomer Name: " + customer.getName() +
                "\nStatus: " + InvoiceStatus.Unpaid +
                "\nSell Success\n";
    }
}