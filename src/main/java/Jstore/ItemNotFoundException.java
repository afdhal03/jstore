package jstore;
public class ItemNotFoundException extends Exception {
    private int item_error;

    public ItemNotFoundException(int item_input) {
        super();
        this.item_error=item_input;
    }

    @Override
    public String getMessage(){
        return "Item ID : ";
    }

    public String getExMessage()
    {
        return super.getMessage() + item_error + " not found.";
    }
}