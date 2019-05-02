
/**
 * Write a description of class Sell_Installment here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
package jstore;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
public class Sell_Installment extends Invoice
{
    private static final InvoiceType INVOICE_TYPE = InvoiceType.Sell;
    private static final InvoiceStatus INVOICE_STATUS = InvoiceStatus.Installment;
    private int installmentPeriod;
    private int installmentPrice;
    private Customer customer;
    private boolean isActive;

    //  private static final InvoiceStatus INVOICE_STATUS = InvoiceStatus.Installment;
    //  private static final InvoiceType INVOICE_TYPE = InvoiceType.Sell;
    //  public Sell_Installment(int id, ArrayList<Integer> item, int totalItem, int installmentPeriod, Customer customer)
    //  {
    //       super(id, item, totalItem);
    //       this.installmentPeriod = installmentPeriod;
    //       this.customer=customer;
    //  }

    public Sell_Installment(ArrayList<Integer> item, int installmentPeriod, Customer customer)
    {
        super(item);
        this.installmentPeriod=installmentPeriod;
        this.customer=customer;
        setIsActive(true);
        //this.isActive = true;
    }

    public int getInstallmentPeriod()
    {
        return installmentPeriod;
    }

    public int getInstallmentPrice()
    {
        return installmentPrice;
    }

    public Customer getCustomer()
    {
        return customer;
    }

    public InvoiceStatus getInvoiceStatus()
    {
        return INVOICE_STATUS;
    }

    public InvoiceType getInvoiceType()
    {
        return INVOICE_TYPE;
    }

    public void setInstallmentPrice()
    {
        // double result;
        // result= (totalPrice/installmentPeriod * 1.02);
        // this.installmentPrice=(int) result;
    }

    public void setTotalPrice()
    {
        //  double result;
        //  result= (installmentPrice*installmentPeriod);
        //  this.totalPrice= (int) result;
    }

    public void setCustomer(Customer customer)
    {
        this.customer=customer;
    }

    // public void setInvoiceStatus(InvoiceStatus status)
    // {

    // }

    public String toString() {
        SimpleDateFormat sdf = new SimpleDateFormat ("dd MMMMM yyyy");
        setTotalPrice(0);
        setInstallmentPrice();
        for (int temp1 : this.getItem())
        {
            System.out.println(DatabaseItem.getItemFromID(temp1).toString());
        }

        return	"========INVOICE========" +
                "\nID: " +  getId() +
//		"\nItem: " + getItem().getName() +
//		"\nAmount: "  + getTotalItem() +
                "\nBuy date: " + sdf.format(getDate().getTime()) +
//		"\nPrice: " + getItem().getPrice() +
                "\nTotal price: " + getTotalPrice() +
                "\nInstallment price: " + installmentPrice +
//		"\nSupplier ID: " + getItem().getSupplier().getId() +
//		"\nSupplier name: " + getItem().getSupplier().getName() +
                "\nCustomer ID: " + customer.getId() +
                "\nCustomer Name: " + customer.getName() +
                "\nStatus: " + InvoiceStatus.Installment +
                "\nInstallment period: " + installmentPeriod +
                "\nSell Success\n";
    }
}
