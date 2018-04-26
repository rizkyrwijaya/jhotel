package jhotel.controller;

import org.springframework.web.bind.annotation.*;
import jhotel.*;

@RestController
public class CustomerController {

    @RequestMapping("/")
    public String indexPage(@RequestParam(value="name", defaultValue="world") String name) {
        return "Hello " + name;
    }

    @RequestMapping(value = "/newcustomer", method = RequestMethod.POST)
    public Customer newCust(@RequestParam(value="name") String name,
                            @RequestParam(value="email") String email,
                            @RequestParam(value="pass") String pass,
                            @RequestParam(value="tahun", defaultValue="2000") int tahun,
                            @RequestParam(value="bulan", defaultValue="1") int bulan,
                            @RequestParam(value="tanggal", defaultValue="1") int tanggal) {
        Customer customer;
        try{
            customer = new Customer(name,tahun, bulan, tanggal, email,pass);
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

    @RequestMapping(value = "/logincust", method = RequestMethod.POST)
    public Customer loginCust(@RequestParam(value="email") String email,
                              @RequestParam(value="pass") String password){
        Customer customer;
        try{
            customer = DatabaseCustomer.getCustomerLogin(email,password);
        } catch(Exception e){
            e.getMessage();
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