package jhotel;
/**
 * Class Hotel
 *
 * @author Rizky Ramadian Wijaya
 * @version 1/3/2018
 */

import java.util.*;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JHotel
{
    public static void main(String[] args) {
        Hotel hotel1 = new Hotel("Aston",new Lokasi(30,30,"Di Aston"),5);

        try{
            DatabaseHotel.addHotel(hotel1);
        } catch(HotelSudahAdaException e){
            System.out.println("Hotel ada");
        }

        Hotel hotel2 = new Hotel("Carlton",new Lokasi(50,50,"RichCarl"),5);
        try{
            DatabaseHotel.addHotel(hotel2);
        } catch(HotelSudahAdaException e){
            System.out.println("Hotel2 ada");
        }

        try{
            Room room1 = new SingleRoom(hotel1,"S11");
            DatabaseRoom.addRoom(room1);
            Room room2 = new DoubleRoom(hotel1,"D22");
            DatabaseRoom.addRoom(room2);
            Room room3 = new PremiumRoom(hotel2,"P33");
            DatabaseRoom.addRoom(room3);
        } catch(RoomSudahAdaException e){
            System.out.println("Ada");
        }

        SpringApplication.run(JHotel.class, args);
    }
    
    
    /**
     * Constructor dari Class JHotel
     */
    public JHotel(){
    }
}
