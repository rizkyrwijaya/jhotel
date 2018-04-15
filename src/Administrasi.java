
/**
 * Class Administrasi dan fungsi method yang penting
 *
 * @author Rizky Ramadian Wijaya
 * @version 8/3/2018
 */
public class Administrasi
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Administrasi
     */
    public Administrasi()
    {
    }

    /**
     * Methode administratif untuk memproses ruangan yang akan di assign
     * kepada kamar tertentu
     */
    public static void pesananDitugaskan(Pesanan pesan, Room kamar)
    {
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(true);
        pesan.setRoom(kamar);
        DatabaseRoom.getRoom(kamar.getHotel(),kamar.getNomorKamar()).setStatusKamar(StatusKamar.BOOKED);
        
    }

    
    /**
     * Methode administratif untuk mengubah status pesanan dan status room dan unlink
     */
    public static void pesananDibatalkan(Room kamar)
    {
        Pesanan pesan = DatabasePesanan.getPesanan(kamar);
        if(pesan != null) {
            pesan.setStatusSelesai(false);
            pesan.setStatusDiproses(false);
            pesan.setRoom(null);
        }
        DatabaseRoom.getRoom(kamar.getHotel(), kamar.getNomorKamar()).setStatusKamar(StatusKamar.VACANT);
        
    }
    
    /**
     * Methode administratif untuk mengubah status pesanan dan status room dan unlink
     */
    public static void pesananSelesai(Room kamar) {
        Pesanan pesan = DatabasePesanan.getPesanan(kamar);
        if(pesan != null) {
            pesan.setStatusSelesai(true);
            pesan.setStatusDiproses(false);
            pesan.setRoom(null);
        }
        DatabaseRoom.getRoom(kamar.getHotel(), kamar.getNomorKamar()).setStatusKamar(StatusKamar.VACANT);
    }
    
    /**
     * Methode administratif untuk mengubah 
     * status pesanan dan status room yang telah membatalkan 
     * pesanan serta me-unlink masing-masing objek.
     */
    public static void pesananDibatalkan(Pesanan pesan)
    {
        DatabaseRoom.getRoom(pesan.getRoom().getHotel(),pesan.getRoom().getNomorKamar()).setStatusKamar(StatusKamar.VACANT);
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(false);
        pesan.setStatusAktif(false);
        pesan.setRoom(null);
    }
    
    /**
     * Method ini untuk mengubah status pesanan dan status room 
     * yang telah menyelesaikan
     * pesanan serta me-unlink masing-masing objek.
     */
    public static void pesananSelesai(Pesanan pesan)
    {
        DatabaseRoom.getRoom(pesan.getRoom().getHotel(),pesan.getRoom().getNomorKamar()).setStatusKamar(StatusKamar.VACANT);
        pesan.setStatusSelesai(true);
        pesan.setStatusDiproses(false);
        pesan.setStatusAktif(false);
        pesan.setRoom(null);   
    }
    
}
