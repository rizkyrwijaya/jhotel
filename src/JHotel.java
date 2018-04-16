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
        DatabaseCustomer.addCustomer(new Customer("Abi", 1997,1,9));
        DatabaseCustomer.addCustomer(new Customer("Budi", 2000,3,4));
        DatabaseCustomer.addCustomer(new Customer("Citra", 2018,6,10));

        for (Customer cust :
                DatabaseCustomer.getCustomerDatabase()) {
            System.out.println(cust.toString());
        }

        DatabaseHotel.addHotel(new Hotel("Ibis",new Lokasi(3,3,"Depan rumah gue"),5));
        DatabaseHotel.addHotel(new Hotel("Hilton",new Lokasi(10,10,"Belakang rumah gue"),100));
        DatabaseHotel.addHotel(new Hotel("Aston",new Lokasi(102,320,"Samping rumah gue"),1));

        for (Hotel hot :
                DatabaseHotel.getHotelDatabase()) {
            System.out.println(hot.toString());
        }
        
        DatabaseRoom.addRoom(new SingleRoom(DatabaseHotel.getHotel(1),"A101",StatusKamar.VACANT));
        DatabaseRoom.addRoom(new DoubleRoom(DatabaseHotel.getHotel(2),"B202",StatusKamar.VACANT));
        DatabaseRoom.addRoom(new PremiumRoom(DatabaseHotel.getHotel(3),"C303",StatusKamar.VACANT));
        DatabaseRoom.addRoom(new PremiumRoom(DatabaseHotel.getHotel(1),"D404",StatusKamar.VACANT));

        for (Room room :
                DatabaseRoom.getRoomDatabase()) {
            System.out.print(room.toString());
            
        }

        DatabasePesanan.addPesanan(new Pesanan(3,DatabaseCustomer.getCustomer(1)));
        DatabasePesanan.addPesanan(new Pesanan(5,DatabaseCustomer.getCustomer(2)));
        DatabasePesanan.addPesanan(new Pesanan(7,DatabaseCustomer.getCustomer(3)));

        for (Pesanan pesan :
                DatabasePesanan.getPesananDatabase()) {
            System.out.println(pesan);
        }

        Administrasi.pesananDitugaskan(DatabasePesanan.getPesanan(1),DatabaseRoom.getRoom(DatabaseHotel.getHotel(1),"A101"));
        Administrasi.pesananDitugaskan(DatabasePesanan.getPesanan(2),DatabaseRoom.getRoom(DatabaseHotel.getHotel(1),"D404"));
        Administrasi.pesananDitugaskan(DatabasePesanan.getPesanan(3),DatabaseRoom.getRoom(DatabaseHotel.getHotel(2),"B202"));

        for (Pesanan pesan :
                DatabasePesanan.getPesananDatabase()) {
            System.out.println(pesan);
        }

        Administrasi.pesananSelesai(DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(1)));
        Administrasi.pesananDibatalkan(DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(2)));
        Administrasi.pesananSelesai(DatabasePesanan.getPesananAktif(DatabaseCustomer.getCustomer(3)));

        for (Pesanan pesan :
                DatabasePesanan.getPesananDatabase()) {
            System.out.println(pesan);
        }
    }
    
    
    /**
     * Constructor dari Class JHotel
     */
    public JHotel(){
    }
}
