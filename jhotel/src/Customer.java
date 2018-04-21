/**
 * Class Customer Tugas Case Study Prak OOP
 *
 * @author Rizky Ramadian Wijaya
 * @version 22/3/2018
 */

import java.util.*;
import java.text.*;

public class Customer
{
    //Bagian disini menunjukan Variabel-variabel pada class Customer
    protected int id;
    protected String nama;
    protected String email;
    protected Date dob;
    
    SimpleDateFormat dobformat = new SimpleDateFormat("dd MMMMMMMMM yyyy");
    
    //Method Constructor dari Class
    /**
     * Ini merupakan Constructor dari Class Customer
     *
     */
    public Customer(String nama,int year,int month, int date,String email)
    {
        this.id = DatabaseCustomer.getLastCustomerID()+1;
        this.nama = nama;
        this.dob = new GregorianCalendar(year,month-1,date).getTime();
        this.email = email;
    }
    
    public Customer(String nama,Date dob,String email)
    {
        this.id = DatabaseCustomer.getLastCustomerID()+1;
        this.nama = nama;
        this.dob = dob;
        this.email = email;
    }
    
    //Methode Getter (Accessor) untuk class
     /**
     * Ini merupakan Methode untuk mendapatkan ID dari objek
     * 
     * @return id merupakan id yang di dapatkan
     */
    public int getID()    {
        return id;
    }
    
    /**
     * Ini merupakan Methode untuk mendapatkan nama dari objek
     * 
     * @return nama merupakan nama yang di dapatkan
     */
    public String getNama()    {
        return nama;
    }
    
    /**
     * Ini merupakan Methode untuk mendapatkan email dari pelanggan
     * 
     * @return email merupakan email yang di dapatkan
     */
    public String getEmail()    {
        return email;
    }
    
    /**
     * Ini merupakan Methode untuk mendapatkan DOB dari pelanggan
     * 
     * @return dob merupakan email yang di dapatkan
     */
    public Date getDOB() {
        //System.out.printf("DOB: %te %<tB %<tY",dob);
        //System.out.println("DOB: " + dobformat.format(dob));
        return dob;
    }
    
    //Methode Setter (Mutator) untuk class
    /**
     * Ini merupakan Methode mutator untuk set nilai id
     * 
     * @param id merupakan id yang dimasukkan
     */
    public void setID(int id) {
        this.id = id;
    }
    
    /**
     * Ini merupakan Methode mutator untuk set nama
     * 
     * @param nama merupakan nama Customer yang dimasukkan
     */
    public void setNama(String nama){
        this.nama = nama;
    }
    
    /**
     * Ini merupakan Methode untuk mengubah email dari pelanggan
     * 
     * @param email mengubah email dari instansi object
     */
    public void setEmail(String email){
        if (email.matches("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
        + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")){
            System.out.println("Email valid");
            this.email = email;
        }
        else {
            System.out.println("Email tidak valid");
        }
    }
    
    /**
     * Ini merupakan Methode untuk mengubah DOB dari pelanggan
     * 
     * @param dob mengubah date of birth dari instansi object
     */
    public void setDOB(Date dob){
        this.dob = dob;
    }
    
    //Methode print semua data
    /**
     * Merupakan Metod yang akan digunakan untuk mengprint data.
     */
    public String toString() {
        if(DatabasePesanan.getPesananAktif(this)==null)
        {
            return "ID: " + getID()
                + "\tName: " + getNama()
                + "\tE-Mail: " + getEmail()
                + "\tDoB: " + dobformat.format(getDOB())
                + "\tBooking Order is in progress\n";
        }
        else
        {
            return "ID: " + getID()
                    + "\tName: " + getNama()
                    + "\tE-Mail: " + getEmail()
                    + "\tDoB: " + dobformat.format(getDOB()) + "\n";
        }
    }
    
}
