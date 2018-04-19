/**
 * Class Hotel
 *
 * @author Rizky Ramadian Wijaya
 * @version 1/3/2018
 */

import java.util.*;

public class JHotel
{   
    /**
     * Merupakan metode main dari Applikasi JHotel
     * 
     * @param args argumen untuk main
     */
    public static void main(String[] args) {
        try {
            DatabaseCustomer.addCustomer(new Customer("Abi", 1997, 1, 9, "abiabi@gmail.com"));
            DatabaseCustomer.addCustomer(new Customer("Budi", 2000, 3, 4, "budi@gmail.com"));
            DatabaseCustomer.addCustomer(new Customer("Citra", 2018, 6, 10, "citra@gmail.com"));
            DatabaseCustomer.addCustomer(new Customer("Citra", 2018, 6, 10, "citra@gmail.com"));
        }
        catch(PelangganSudahAdaException e){
            System.out.println("---TES PELANGGAN SUDAH ADA BERHASIL---");
            System.out.println(e.getPesan());
        }

        try {
            Lokasi a = new Lokasi(102, 320, "Samping rumah gue");
            DatabaseHotel.addHotel(new Hotel("Ibis", new Lokasi(3, 3, "Depan rumah gue"), 5));
            DatabaseHotel.addHotel(new Hotel("Hilton", new Lokasi(10, 10, "Belakang rumah gue"), 100));
            DatabaseHotel.addHotel(new Hotel("Aston", a, 1));
            DatabaseHotel.addHotel(new Hotel("Aston", a, 1));
        } catch(HotelSudahAdaException e){
            System.out.println("---TES HOTEL SUDAH ADA BERHASIL---");
            System.out.println(e.getPesan());
        }

        try {
            DatabaseRoom.addRoom(new SingleRoom(DatabaseHotel.getHotel(1), "A101"));
            DatabaseRoom.addRoom(new DoubleRoom(DatabaseHotel.getHotel(2), "B202"));
            DatabaseRoom.addRoom(new PremiumRoom(DatabaseHotel.getHotel(3), "C303"));
            DatabaseRoom.addRoom(new PremiumRoom(DatabaseHotel.getHotel(1), "D404"));
            DatabaseRoom.addRoom(new PremiumRoom(DatabaseHotel.getHotel(1), "D404"));

        } catch(RoomSudahAdaException e){
            System.out.println("---TES ROOM SUDAH ADA BERHASIL---");
            System.out.println(e.getPesan());
        }

        try {
            DatabasePesanan.addPesanan(new Pesanan(3, DatabaseCustomer.getCustomer(1)));
            DatabasePesanan.addPesanan(new Pesanan(5, DatabaseCustomer.getCustomer(2)));
            DatabasePesanan.addPesanan(new Pesanan(7, DatabaseCustomer.getCustomer(3)));
            DatabasePesanan.addPesanan(new Pesanan(7, DatabaseCustomer.getCustomer(3)));
        } catch(PesananSudahAdaException e){
            System.out.println("---TES PESANAN SUDAH ADA BERHASIL---");
            System.out.println(e.getPesan());
        }

        try{
            DatabaseCustomer.removeCustomer(10);
        } catch(PelangganTidakDitemukanException e){
            System.out.println("---TES PELANGGAN TIDAK DITEMUKAN BERHASIL---");
            System.out.println(e.getPesan());
        }
        Customer me = new Customer("Rizky rw",2017,3,2,"rizky@gmail.com");
        Pesanan pesan = new Pesanan(32,me);
        try{
            DatabasePesanan.removePesanan(pesan);
        } catch(PesananTidakDitemukanException e){
            System.out.println("---TES PESANAN TIDAK DITEMUKAN BERHASIL---");
            System.out.println(e.getPesan());
        }

        try{
            DatabaseHotel.removeHotel(29);
        } catch(HotelTidakDitemukanException e){
            System.out.println("---TES HOTEL TIDAK DITEMUKAN BERHASIL---");
            System.out.println(e.getPesan());
        }

        try{
            DatabaseRoom.removeRoom(DatabaseHotel.getHotel(2),"AAAA");
        } catch(RoomTidakDitemukanException e){
            System.out.println("---TES ROOM TIDAK DITEMUKAN BERHASIL---");
            System.out.println(e.getPesan());
        }

        System.out.println("===========HASIL==========");

        System.out.println(DatabaseCustomer.getCustomerDatabase());
        System.out.println(DatabaseHotel.getHotelDatabase());
        System.out.println(DatabaseRoom.getRoomDatabase());
        System.out.println(DatabasePesanan.getPesananDatabase());

//            for (Pesanan pesan :
//                    DatabasePesanan.getPesananDatabase()) {
//                System.out.println(pesan);
//            }
//
//            Administrasi.pesananDitugaskan(DatabasePesanan.getPesanan(1), DatabaseRoom.getRoom(DatabaseHotel.getHotel(1), "A101"));
//            Administrasi.pesananDitugaskan(DatabasePesanan.getPesanan(2), DatabaseRoom.getRoom(DatabaseHotel.getHotel(1), "D404"));
//            Administrasi.pesananDitugaskan(DatabasePesanan.getPesanan(3), DatabaseRoom.getRoom(DatabaseHotel.getHotel(2), "B202"));
//
//            for (Pesanan pesan :
//                    DatabasePesanan.getPesananDatabase()) {
//                System.out.println(pesan);
//            }
//
//            Administrasi.pesananSelesai(DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(1)));
//            Administrasi.pesananDibatalkan(DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(2)));
//            Administrasi.pesananSelesai(DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(3)));

//            for (Pesanan pesan :
//                    DatabasePesanan.getPesananDatabase()) {
//                System.out.println(pesan);
//            }

    }
    
    
    /**
     * Constructor dari Class JHotel
     */
    public JHotel(){
    }
}
