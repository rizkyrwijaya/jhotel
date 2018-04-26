package jhotel.controller;

import jhotel.*;
import org.springframework.web.bind.annotation.*;

@RestController
public class PesananController {

    @RequestMapping(value = "/pesanancustomer/{id_customer}", method = RequestMethod.GET)
    public Pesanan pesananCust(@PathVariable int id_customer){
        return DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(id_customer));
    }

    @RequestMapping("/pesanan/{id_pesanan}")
    public Pesanan getPesanan(@PathVariable int id_pesanan){
        return DatabasePesanan.getPesanan(id_pesanan);
    }

    @RequestMapping(value = "/bookpesanan", method = RequestMethod.POST)
    public Pesanan buatPesanan(@RequestParam(value="jumlah_hari") int jumlah_hari,
                               @RequestParam(value="id_cust") int id_customer,
                               @RequestParam(value="id_hotel") int id_hotel,
                               @RequestParam(value="room_no") String nomor_kamar){
        Pesanan pesanan = new Pesanan(jumlah_hari,DatabaseCustomer.getCustomer(id_customer));
        try{
            DatabasePesanan.addPesanan(pesanan);
        } catch(Exception e){
            e.getMessage();
            return null;
        }
        Administrasi.pesananDitugaskan(DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(id_customer)), DatabaseRoom.getRoom(DatabaseHotel.getHotel(id_hotel),nomor_kamar));
        return DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(id_customer));
    }

    @RequestMapping(value = "/cancelpesanan", method = RequestMethod.POST)
    public Pesanan batalkanPesanan(@RequestParam(value = "id_pesanan") int id_pesanan){
        Administrasi.pesananDibatalkan(DatabasePesanan.getPesanan(id_pesanan));
        return DatabasePesanan.getPesanan(id_pesanan);
    }

    @RequestMapping(value = "/finishpesanan", method = RequestMethod.POST)
    public Pesanan selesaikanPesanan(@RequestParam(value = "id_pesanan") int id_pesanan){
        Administrasi.pesananSelesai(DatabasePesanan.getPesanan(id_pesanan));
        return DatabasePesanan.getPesanan(id_pesanan);
    }
}
