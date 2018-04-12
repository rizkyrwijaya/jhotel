import java.util.ArrayList;

/**
 * Class DatabaseRoom untuk Case Study Praktikum OOP 
 *
 * @author Rizky Ramadian Wijaya
 * @version 8/3/2018
 */
public class DatabaseRoom
{
    //Bagian disini menunjukan Variabel-variabel pada class
    private static ArrayList<Room> ROOM_DATABASE = new ArrayList<>();
    
    //Methode bagian sini akan dibenarkan, sampai modul integrasi database dengan java
    public static ArrayList<Room> getRoomDatbabse(){
        return ROOM_DATABASE;
    }

    public static boolean addRoom(Room baru){
        return true;
    }

    public static Room getRoom(Hotel hotel,String nomor_kamar){
        return null;
    }

    public static ArrayList<Room> getRoomsFromHotel(Hotel hotel){
        return null;
    }

    public static ArrayList<Room> getVacantRooms(){
        return null;
    }

    public static boolean removeRoom(Hotel hotel, String nomor_kamar){
        return false;
    }
}
