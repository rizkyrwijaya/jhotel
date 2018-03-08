/**
 * Class Customer Tugas Case Study Prak OOP
 *
 * @author Rizky Ramadian Wijaya
 * @version 1/3/2018
 */
public class Customer
{
    //Bagian disini menunjukan Variabel-variabel pada class Customer
    protected int id;
    protected String nama;
    
    //Method Constructor dari Class
    /**
     * Ini merupakan Constructor dari Class Customer
     * 
     * @param id merupakan parameter untuk menentukan id tiap customer
     * @param id merupakan penentuan nama untuk Customer
     */
    public Customer(int id, String nama)
    {
        this.id = id;
        this.nama = nama;
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
    
    //Methode print semua data
    /**
     * Merupakan Metod yang akan digunakan untuk mengprint data.
     */
    public void printData()
    {
        System.out.println(nama);
    }
    

}
