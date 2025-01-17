package jstore;
public class CustomerDoesntHaveActiveException extends Exception {
    private Customer customer_error;

    public CustomerDoesntHaveActiveException(Customer customer_input) {
        super();
        this.customer_error=customer_input;
    }

    @Override
    public String getMessage(){
        return "Customer : ";
    }

    public String getExMessage()
    {
        return super.getMessage() + customer_error + "\ndoesnt have active invoice.";
    }
}