package jstore.controller;


        import jstore.DatabaseSupplier;
        import jstore.Supplier;
        import org.springframework.web.bind.annotation.PathVariable;
        import org.springframework.web.bind.annotation.RequestMapping;
        import org.springframework.web.bind.annotation.RequestMethod;

        import java.util.ArrayList;

public class SupplierController {

    @RequestMapping(value = "/suppliers", method = RequestMethod.GET)
    public ArrayList<Supplier> supplierList() {
        ArrayList<Supplier> tempDatabaseSupplier = DatabaseSupplier.getSupplierDatabase();
        return tempDatabaseSupplier;
    }

    @RequestMapping(value = "/suppliers/{id_supplier}", method = RequestMethod.GET)
    public Supplier getSupplier(@PathVariable int id) {
        Supplier tempSupplier = DatabaseSupplier.getSupplier(id);
        return tempSupplier;
    }

}


