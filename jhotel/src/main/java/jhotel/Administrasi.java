/**
 * jhotel is the group for the whole jhotel project
 */
package jhotel;

/**
 * Class Administrasi meurpakan sebuah class untuk fungsi fungsi variable. Class Administrasi
 * berisikan fungsi untuk mengatur sistem pesanan. Administrasi berisikan fungsi fungsi static dan tidak dibutuhkan
 * pembuatan objek.
 *
 * @author Rizky Ramadian Wijaya
 * @version 13/5/2018 - ver. Beta 1
 *
 */
public class Administrasi
{
    /**
     * Constructor dari class Administrasi. Tidak digunakan dikarenakan Administrasi berisikan
     * static method, sehingga tidak dibutuhkan pembuatan object dan constructor
     */


    public Administrasi()
    {
    }

    /**
     * pesananDitugaskan merupakan sebuah method yang akan mengset sebuah pesanan bergantung dari pesanan dari kamar
     * dalam pesananDitugaskan akan di check apabila kamar kosong atau tidak. Apabila kosong maka akan di set diproses
     * dan pesanan akan diberikan room. Apabila ternyata room tidak vacant, pesanan akan di set sebagai false untuk menunjukan
     * bahwa penugasan kamar gagal.
     *
     * @param pesan Pesanan yang akan ditugaskan terhadap kamar
     * @param kamar Kamar yang menjadi bagian dari pesanan yang akan di pesan
     */
    public static void pesananDitugaskan(Pesanan pesan, Room kamar) {
        if(kamar.getStatusKamar().equals(StatusKamar.VACANT)) {
            pesan.setStatusSelesai(false);
            pesan.setStatusDiproses(true);
            pesan.setRoom(kamar);
            DatabaseRoom.getRoom(kamar.getHotel(), kamar.getNomorKamar()).setStatusKamar(StatusKamar.BOOKED);
        }
        else pesan.setStatusAktif(false);
    }

    
    /**
     * Method Administratif untuk membatalkan sebuah pesanan berdasarkan dari kamar yang ditempati.
     * Method ini menggunakan parameter kamar, dimana akan di cari pesanan yang terhubung dengan kamar.
     *
     * @param kamar Kamar yang terlink ke pesanan dan pesanannnya ingin dibatalkan
     */
    public static void pesananDibatalkan(Room kamar){
        Pesanan pesan = DatabasePesanan.getPesananAktif(kamar);
        if(pesan != null) {
            pesan.setStatusSelesai(false);
            pesan.setStatusDiproses(false);
        }
        DatabaseRoom.getRoom(kamar.getHotel(), kamar.getNomorKamar()).setStatusKamar(StatusKamar.VACANT);
        
    }

    /**
     * Method Administratif untuk membatalkan sebuah pesanan berdasarkan dari pesanan yang dipilih oleh method.
     * Method ini menggunakan parameter pesanan.
     *
     * @param pesan merupakan pesanan yang dimana pesanan tersebut akan dibatalkan.
     */
    public static void pesananDibatalkan(Pesanan pesan)
    {
        DatabaseRoom.getRoom(pesan.getRoom().getHotel(),pesan.getRoom().getNomorKamar()).setStatusKamar(StatusKamar.VACANT);
        pesan.setStatusSelesai(false);
        pesan.setStatusDiproses(false);
        pesan.setStatusAktif(false);
    }

    /**
     * Methode administratif untuk mengset nilai pesanan menjadi selesai, dimana pesanan berhasil dari awal sampai akhir.
     * Method ini menggunakan kamar sebagai parameter nya sehingga pesanan diambil berdasarkan dari kamar yang dimasukkan.
     *
     * @param kamar Parameter method menggunakan kamar dimana kamar tersebut menjadi referensi untuk pesanan yang akan dibatalkan
     */
    public static void pesananSelesai(Room kamar) {
        Pesanan pesan = DatabasePesanan.getPesananAktif(kamar);
        if(pesan != null) {
            pesan.setStatusSelesai(true);
            pesan.setStatusDiproses(false);
        }
        DatabaseRoom.getRoom(kamar.getHotel(), kamar.getNomorKamar()).setStatusKamar(StatusKamar.VACANT);
    }


    /**
     * Methode administratif untuk mengset nilai pesanan menjadi selesai, dimana pesanan berhasil dari awal sampai akhir.
     * Method ini menggunakan pesanan langsung sehingga tidak berdasarkan dari kamar
     *
     * @param pesan Parameter untuk method yang dimana pesanan dijadikan referensi dan bukan dari kamar
     */
    public static void pesananSelesai(Pesanan pesan)
    {
        DatabaseRoom.getRoom(pesan.getRoom().getHotel(),pesan.getRoom().getNomorKamar()).setStatusKamar(StatusKamar.VACANT);
        pesan.setStatusSelesai(true);
        pesan.setStatusDiproses(false);
        pesan.setStatusAktif(false);
    }
    
}
