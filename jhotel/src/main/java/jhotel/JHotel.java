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

import javax.swing.*;

@SpringBootApplication
public class JHotel
{
    public static void main(String[] args) {
        Hotel hotel1 = new Hotel("Aston", new Lokasi(32,33,"Disana"),4);
        try{
            DatabaseHotel.addHotel(hotel1);
        } catch(HotelSudahAdaException e){

        }

        Room kamar1 = new SingleRoom(hotel1,"A11");
        Room kamar2 = new DoubleRoom(hotel1,"B22");
        Room kamar3 = new PremiumRoom(hotel1,"C33");

        try{
            DatabaseRoom.addRoom(kamar1);
            DatabaseRoom.addRoom(kamar2);
            DatabaseRoom.addRoom(kamar3);
        } catch(RoomSudahAdaException e){

        }
        SpringApplication.run(JHotel.class, args);
    }
    
    
    /**
     * Constructor dari Class JHotel
     */
    public JHotel(){
    }
}
