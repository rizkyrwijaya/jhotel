package jhotel.controller;

import jhotel.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class HotelController {

    @RequestMapping(value = "/hotel", method = RequestMethod.GET)
    public ArrayList<Hotel> hotelsList(){
        return DatabaseHotel.getHotelDatabase();
    }

    @RequestMapping(value = "/hotel/{id_hotel}", method=RequestMethod.GET)
    public Hotel getHotel(@PathVariable int id_hotel){
        return DatabaseHotel.getHotel(id_hotel);
    }
}
