
/**
 * Write a description of class DatabaseCustomer here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */

package jstore;
import java.util.ArrayList;

public class DatabaseCustomer {
    private static ArrayList<Customer> customer_database = new ArrayList<Customer>();
    private static int last_customer_id=0;

    /**
     * This is accessor for get customer database
     * @return last_customer_database
     */
    public static ArrayList<Customer> getCustomerDatabase(){
        return customer_database;
    }

    /**
     * This is accessor for get last customer ID
     * @return last_customer_id.
     */
    public static int getLastCustomerID(){
        return last_customer_id;
    }

    /**
     * This is method for adding customer
     * @param customer Customer
     * @return boolean
     */
    public static Boolean addCustomer(Customer customer) throws CustomerAlreadyExistsException
    {
        boolean cust = true;
        for (Customer cus1 : customer_database) {
            if (cus1.getName()== customer.getName() &&
                    cus1.getEmail() == customer.getEmail()) {
                throw new CustomerAlreadyExistsException(customer);
            }
        }
        if (customer_database.add(customer)){
            last_customer_id++;
            cust=true;
        }
        return cust;
    }

    /**
     * This is accessor for get customer
     * @param id integer
     * @return hasil.
     */
    public static Customer getCustomer(int id)
    {
        Customer hasil = null;
        for (Customer cus1 : customer_database) {
            if (cus1.getId() == id) {
                hasil = cus1;
            }
        }
        return hasil;
    }



    public static Customer getCustomerLogin(String email, String password){
        for (Customer customerPtr : CUSTOMER_DATABASE){
            if (customerPtr.getEmail().equals(email) && customerPtr.getPassword().equals(password))
            {
                return customerPtr;
            }
        }
        return null;
    }


    /**
     * This is method for remove customer
     * @param id integer
     * @return boolean
     */
    public static Boolean removeCustomer(int id) throws CustomerNotFoundException
    {
        for (Customer cus1 : customer_database) {
            if (cus1.getId() == id) {
                customer_database.remove(cus1);
                return true;
            }
        }
        throw new CustomerNotFoundException(id);
    }
}
