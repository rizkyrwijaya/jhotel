package jhotel;
/**
 * Class Hotel buat Tugas Case Study OOP
 * Telah di update untuk Modul 2
 * 
 * @author Rizky Ramadian Wijaya
 * @version 1/3/2018
 */
public class Hotel
{
    //Bagian disini menunjukan Variabel variabel pada class Hotel
    private int id;
    private String nama;
    private Lokasi lokasi;
    private int bintang;
    
    //Method Constructor dari Class
    /**
     * Ini merupakan Constructor dari Class Hotel
     * 
     * @param nama merupakan parameter untuk menentukan nama hotel
     * @param lokasi merupakan parameter untuk menentukan lokasi hotel
     * @param bintang merupakan parameter untuk menentukan bintang dari Hotel
     */
    public Hotel(String nama, Lokasi lokasi, int bintang)
    {
        this.nama = nama;
        this.lokasi = lokasi;
        this.bintang = bintang;
        this.id = DatabaseHotel.getLastHotelID()+1;
    }
    
    //Methode Getter (Accessor) untuk class


    public int getID() {
        return id;
    }

    /**
     * Ini merupakan Methode untuk mendapatkan nama dari objek class Hotel
     * 
     * @return nama mengembalikkan variabel nama objek class Hotel
     */
    public String getNama(){
        return nama;
    }
    
    /**
     * Ini merupakan Methode untuk mendapatkan lokasi dari objek class Hotel
     * 
     * @return lokasi mengembalikkan variabel objek lokasi objek class Hotel
     */
    public Lokasi getLokasi(){
        return lokasi;
    }
    
    /**
     * Ini merupakan Methode untuk mendapatkan Bintang dari objek class Hotel
     * 
     * @return bintang mengembalikkan variabel bintang objek class Hotel
     */
    public int getBintang(){
        return bintang;
    }
    
    //Methode Setter (Mutator) untuk class


    public void setID(int id) {
        this.id = id;
    }

    /**
     * Ini merupakan Methode mutator untuk set nilai nama
     * 
     * @param nama merupakan variabel yang akan di masukkan pada variable nama pada Object Class
     */
    public void setNama(String nama){
        this.nama=nama;
    }
    
    /**
     * Ini merupakan Methode mutator untuk set nilai lokasi
     * 
     * @param lokasi merupakan variabel yang akan di masukkan pada variable Lokasi pada Object Class
     */
    public void setLokasi(Lokasi lokasi){
        this.lokasi=lokasi;
    }
    
    /**
     * Ini merupakan Methode mutator untuk set nilai bintang
     * 
     * @param bintang merupakan variabel yang akan di masukkan pada variable bintang pada Object Class
     */
    public void setBintang(int bintang){
        this.bintang=bintang;
    }
    
    //Methode print semua data
    /**
     * Merupakan Metod yang akan digunakan untuk mengprint data.
     */
    public String toString(){
        return "Hotel: " + getNama()
            +"\tBintang: " + getBintang()
            + "\tLokasi: " + getLokasi().getDeskripsi()+"\n";
    }
    
    
}
