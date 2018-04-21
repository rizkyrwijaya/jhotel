import java.util.ArrayList;

/**
 * Class Database Pesanan Tugas OOP Praktikum Case Study
 *
 * @author Rizky Ramadian Wijaya
 * @version 1/3/2018
 */
public class DatabasePesanan
{
    private static ArrayList<Pesanan> PESANAN_DATABASE = new ArrayList<>();
    private static int LAST_PESANAN_ID = 0;

    public static ArrayList<Pesanan> getPesananDatabase(){
        return PESANAN_DATABASE;
    }

    public static int getLastPesananID() {
        return LAST_PESANAN_ID;
    }

    public static boolean addPesanan(Pesanan baru) throws PesananSudahAdaException{
        if(getPesananAktif(baru.getPelanggan()) == null){
            PESANAN_DATABASE.add(baru);
            LAST_PESANAN_ID = baru.getID();
            return true;
        }
        else {
            throw new PesananSudahAdaException(baru);
        }
    }

    public static Pesanan getPesanan(int id){
        for (Pesanan pesan :
                PESANAN_DATABASE) {
            if(pesan.getID() == id){
                return pesan;
            }
        }
        return null;
    }

    public static Pesanan getPesanan(Room kamar){
        for (Pesanan pesan :
                PESANAN_DATABASE) {
            if(kamar.equals(pesan.getRoom())==true){
                return pesan;
            }
        }
        return null;
    }

    public static Pesanan getPesananAktif(Customer pelanggan){
        for (Pesanan pesan :
                PESANAN_DATABASE) {
            if (pesan.getStatusAktif() == true && pesan.getPelanggan().equals(pelanggan) == true){
                return pesan;
            }
        }
        return null;
    }

    public static boolean removePesanan(Pesanan pesan) throws PesananTidakDitemukanException{
        for (Pesanan pesan2 :
                PESANAN_DATABASE) {
            if(pesan.equals(pesan2)){
                if(pesan.getRoom() != null) Administrasi.pesananDibatalkan(pesan);
                else if(pesan.getStatusAktif() == true) pesan.setStatusAktif(false);
                PESANAN_DATABASE.remove(pesan2);
                return true;
            }
        }
        throw new PesananTidakDitemukanException(pesan.getPelanggan());
    }


}
