package JStore.controller;
        import JStore.*;
        import org.springframework.web.bind.annotation.*;
        import javax.xml.crypto.Data;
        import java.util.ArrayList;
        import Jstore.Item;

public class ItemController {

    @RequestMapping(value= "/itemlist/", method= RequestMethod.GET)
    public ArrayList<Item> itemlist()
    {
        ArrayList<Item> tempDatabaseItem = DatabaseItem.getItemDatabase();
        return tempDatabaseItem;
    }
    @RequestMapping(value= "/iteml/{id_item}", method= RequestMethod.GET)
    public Item getItemFromID(@PathVariable int id)
    {
        Item tempItem = DatabaseItem.getItemFormID(id);
        return tempItem;
    }
}
