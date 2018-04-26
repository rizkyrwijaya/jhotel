package jhotel.controller;

import jhotel.*;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
public class RoomController {

    @RequestMapping(value = "/vacantrooms", method = RequestMethod.GET)
    public ArrayList<Room> vacantRooms(){
        return DatabaseRoom.getVacantRooms();
    }

    @RequestMapping(value = "/room/{id_hotel}/{room_no}", method=RequestMethod.GET)
    public Room getRoom(@PathVariable int id_hotel,
                        @PathVariable String room_no){
        return DatabaseRoom.getRoom(DatabaseHotel.getHotel(id_hotel),room_no);
    }
}
