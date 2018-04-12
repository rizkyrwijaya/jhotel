import java.util.ArrayList;

/**
 * Class DatabaseCustomer untuk Case Study Praktikum OOP 
 *
 * @author Rizky Ramadian Wijaya
 * @version 1/3/2018
 */
public class DatabaseCustomer
{
    //Bagian disini menunjukan Variabel-variabel pada class
    private static ArrayList<Customer> CUSTOMER_DATABASE = new ArrayList<>();
    private static int LAST_CUSTOMER_ID;
    //Methode bagian sini akan dibenarkan, sampai modul integrasi database dengan java

    public static ArrayList<Customer> getCustomerDatabase(){
        return CUSTOMER_DATABASE;
    }

    public static int getLastCustomerID() {
        return LAST_CUSTOMER_ID;
    }

    public static Customer getCustomer(int id){
        return null;
    }

    /**
     * Merupakan metode yang akan digunakan pada link database
     * dengan customer untuk menambah customer kepada database
     */
    public static boolean addCustomer(Customer baru) {
     return false;
    }
    
    /**
     * Merupakan metode yang akan digunakan pada link database
     * dengan customer untuk menghapus customer kepada database
     */
    public static boolean removeCustomer(int id) {
        return false;
    }

}
