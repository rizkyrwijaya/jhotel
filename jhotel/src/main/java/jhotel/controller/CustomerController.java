package jhotel;
import org.springframework.web.bind.annotation.*;

@RestController
public class CustomerController {

    @RequestMapping("/")
    public String indexPage(@RequestParam(value="name", defaultValue="world") String name) {
        return "Hello " + name;
    }

    @RequestMapping(value = "/newcustomer", method = RequestMethod.POST)
    public Customer newCust(@RequestParam(value="name") String name, @RequestParam(value="email") String email,@RequestParam(value="tahun", defaultValue="2000") String tahun) {
        Customer customer;
        try{
            customer = new Customer(name, Integer.parseInt(tahun), 10, 10, email);
        } catch (Exception e){
            e.getMessage();
            return null;
        }
        try {
            DatabaseCustomer.addCustomer(customer);
        } catch (Exception ex) {
            ex.getMessage();
            return null;
        }

        return customer;
    }

    @RequestMapping("/getcustomer/{id}")
    public Customer getCust(@PathVariable int id) {
        Customer customer = DatabaseCustomer.getCustomer(id);
        return customer;
    }

}