/**
 * Class Customer Tugas Case Study Prak OOP
 *
 * @author Rizky Ramadian Wijaya
 * @version 22/3/2018
 */

import java.util.*;

public class Customer
{
    //Bagian disini menunjukan Variabel-variabel pada class Customer
    protected int id;
    protected String nama;
    protected String email;
    protected Date dob;
    
    //Method Constructor dari Class
    /**
     * Ini merupakan Constructor dari Class Customer
     * 
     * @param id merupakan parameter untuk menentukan id tiap customer
     * @param id merupakan penentuan nama untuk Customer
     */
    public Customer(int id, String nama,int year,int month, int date)
    {
        this.id = id;
        this.nama = nama;
        this.dob = new GregorianCalendar(year,month,date).getTime();
    }
    
    public Customer(int id, String nama,Date dob)
    {
        this.id = id;
        this.nama = nama;
        this.dob = dob;
    }
    
    //Methode Getter (Accessor) untuk class
     /**
     * Ini merupakan Methode untuk mendapatkan ID dari objek
     * 
     * @return id merupakan id yang di dapatkan
     */
    public int getID()
    {
        return id;
    }
    
    /**
     * Ini merupakan Methode untuk mendapatkan nama dari objek
     * 
     * @return nama merupakan nama yang di dapatkan
     */
    public String getNama()
    {
        return nama;
    }
    
    /**
     * Ini merupakan Methode untuk mendapatkan email dari pelanggan
     * 
     * @return email merupakan email yang di dapatkan
     */
    public String getEmail()
    {
        return email;
    }
    
    /**
     * Ini merupakan Methode untuk mendapatkan DOB dari pelanggan
     * 
     * @return dob merupakan email yang di dapatkan
     */
    public Date getDOB()
    {
        System.out.println("DOB:" + dob.getDate() +"/"+ dob.getMonth() +"/"+ dob.getYear());
        return dob;
    }
    
    //Methode Setter (Mutator) untuk class
    /**
     * Ini merupakan Methode mutator untuk set nilai id
     * 
     * @param id merupakan id yang dimasukkan
     */
    public void setID(int id)
    {
        this.id = id;
    }
    
    /**
     * Ini merupakan Methode mutator untuk set nama
     * 
     * @param nama merupakan nama Customer yang dimasukkan
     */
    public void setNama(String nama)
    {
        this.nama = nama;
    }
    
    /**
     * Ini merupakan Methode untuk mengubah email dari pelanggan
     * 
     * @param email mengubah email dari instansi object
     */
    public void setEmail(String email)
    {
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
    public void setDOB(Date dob)
    {
        this.dob = dob;
    }
    
    //Methode print semua data
    /**
     * Merupakan Metod yang akan digunakan untuk mengprint data.
     */
    public void printData()
    {
        System.out.println("\n==================INFO PELANGGAN===================\n");
        System.out.println("ID Customer \t\t: " + id);
        System.out.println("Nama Customer\t\t: " + nama);
    }
    

}
