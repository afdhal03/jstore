package jstore;
public class CustomerAlreadyExistsException extends Exception
{
    private Customer customer_error;

    public CustomerAlreadyExistsException(Customer customer_input)
    {
        super();
        this.customer_error = customer_input;
    }

    @Override
    public String getMessage()
    {
        return "Customer Email: ";
    }

    public String getExMessage()
    {
        return super.getMessage() + customer_error.getEmail() + ", or username: " + customer_error.getUsername() + " already exists.";
    }
}