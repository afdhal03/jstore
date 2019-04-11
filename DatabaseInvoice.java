

/**
 * Kelas digunakan sebagai informasi database dari invoice
 *
 * @author Muhamad Luthfi Mufadel
 * @version 10/4/2019
 */

public class DatabaseInvoice
{
    //variabel yang dipakai
    private Invoice[] listInvoice;

    //Menambah supplier
    /**
     * Method addSupplier()
     * @param supplier
     * @return false
     */
    public boolean addInvoice(Invoice invoice)
    {
        return false;
    }
    
    //Menghapus supplier
    /**
     * Method remove Supplier()
     * @param supplier
     */
    public static void removeInvoice(Invoice invoice)
    {
        
    }
    
    //Menampilkan nama supplier
    /**
     * Method getSupplier()
     * @return supplier
     */
    public Invoice getInvoice()
    {
        return listInvoice[0];
    }
    
    //Menampilkan list supplier
    /**
     * Method getListSupplier()
     * @return listSupplier
     */
    public Invoice[] getListInvoice()
    {
        return listInvoice;
    }
}
