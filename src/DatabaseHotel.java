import java.util.ArrayList;

/**
 * Class DatabaseHotel untuk Case Study Praktikum OOP 
 *
 * @author Rizky Ramadian Wijaya
 * @version 12/4/2018
 */
public class DatabaseHotel
{
    //Bagian disini menunjukan Variabel-variabel pada class
    private static ArrayList<Hotel> HOTEL_DATABASE = new ArrayList<>();
    private static int LAST_HOTEL_ID;
    
    //Methode bagian sini akan dibenarkan, sampai modul integrasi database dengan java

    public static ArrayList<Hotel> getHotelDatabase() {
        return HOTEL_DATABASE;
    }

    public static int getLastHotelID() {
        return LAST_HOTEL_ID;
    }

    /**
     * Merupakan metode yang akan digunakan pada link database
     * dengan Room untuk menambah Rooom kepada database
     */
    public static boolean addHotel(Hotel baru) {
        return false;
    }

    public static Hotel getHotel(String nama){
        return null;
    }
    /**
     * Merupakan metode yang akan digunakan pada link database
     * dengan Room untuk menghapus Room kepada database
     */
    public static boolean removeHotel(int id) {
        return false;
    }

}
