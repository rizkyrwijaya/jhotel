/**
 * Class Pesanan Tugas Case Study Prak OOP
 *
 * @author Rizky Ramadian Wijaya
 * @version 1/3/2018
 */

import java.util.*;

public class Pesanan
{
    //Bagian disini menunjukan Variabel-variabel pada class
    private int id;
    private double biaya;
    private double jumlahHari;
    private Customer pelanggan;
    private boolean isAktif;
    private boolean isDiproses;
    private boolean isSelesai;
    private Room kamar;
    private Date tanggalPesan;

    //Method Constructor dari Class
    /**
     * Ini merupakan Constructor dari Class Pesanan
     * 
     * @param jumlahHari merupakan parameter untuk menentukan banyak hari
     * @param pelanggan merupakan parameter yang akan menunjukan pelanggan yang memesan
     */
    public Pesanan(double jumlahHari,Customer pelanggan) {
        this.jumlahHari = jumlahHari;
        this.pelanggan = pelanggan;
        //this.kamar = kamar;
        //this.biaya = kamar.getDailyTariff()*jumlahHari;
        this.isAktif = true;
        this.tanggalPesan = new Date();
        this.id = DatabasePesanan.getLastPesananID()+1;
    }

    //Methode Getter (Accessor) untuk class


    public int getID() {
        return id;
    }

    /**
     * Ini merupakan Methode untuk mendapatkan biaya dari objek class pesanan
     * 
     * @return biaya mendapatkan biaya bayar dari pesanan
     */
    public double getBiaya(){
        return biaya;
    }
    
     /**
     * Ini merupakan Methode untuk mendapatkan pelanggan dari objek class pesanan
     * 
     * @return pelanggan mengembalikkan variabel pelanggan objek class pesanan
     */
    public Customer getPelanggan(){
        return pelanggan;
    }
    
    /**
     * Ini merupakan Methode untuk mendapatkan Nama pelanggan dari objek class pesanan
     * 
     * @return nama_pelanggan mengembalikkan variabel nama_pelanggan objek class pesanan
     */
    public double getJumlahHari(){
        return jumlahHari;
    }
    
    
    /**
     * Ini merupakan Methode untuk mendapatkan status diproses dari objek class pesanan
     * 
     * @return isDiproses mengembalikkan variabel isDiproses objek class pesanan
     */
    public boolean getStatusDiproses(){
        return isDiproses;
    }

    public boolean getStatusAktif() {
        return isAktif;
    }

    /**
     * Ini merupakan Methode untuk mendapatkan status proses selesai dari objek class pesanan
     * 
     * @return isSelesai mengembalikkan variabel isSelesai objek class pesanan
     */
    public boolean getStatusSelesai(){
        return isSelesai;
    }


    /**
     * Ini merupakan Methode untuk mendapatkan object room dari object ini
     * 
     * @return kamar merupakan kamar yang akan dikembalikkan
     */
    public Room getRoom(){
        return kamar;
    }
    
    /**
     * Ini merupakan Methode untuk mendapatkan Date dari Object ini
     * 
     * @return tanggalPesan merupakan tanggal pesanan
     */
    public Date getTanggalPesan(){
        return tanggalPesan;
    }
    
    //Methode Setter (Mutator) untuk class


    public void setID(int id) {
        this.id = id;
    }

    /**
     * Ini merupakan Methode mutator untuk set nilai biaya
     * 
     *
     *
     *
     */
    public void setBiaya() {
        this.biaya = kamar.getDailyTariff()*jumlahHari;
    }
    
    /**
     * Ini merupakan Methode mutator untuk set nilai pelanggan
     * 
     * @param baru merupakan variabel yang akan di masukkan pada variable peanggan pada Class
     */
    public void setPelanggan(Customer baru) {
        pelanggan=baru;
    }
    
    /**
     * Ini merupakan Methode mutator untuk set nilai jumlahHari
     * 
     * @param jumlahHari merupakan variabel yang akan di masukkan pada variable biaya pada Class
     */
    public void setJumlahHari(double jumlahHari) {
        this.jumlahHari = jumlahHari;
    }

    
    /**
     * Ini merupakan Methode mutator untuk set nilai isDiproses
     * 
     * @param diproses merupakan variabel yang akan di masukkan pada variable isDiproses pada Class
     */
    public void setStatusDiproses(boolean diproses) {
        isDiproses = diproses;
    }
    
    /**
     * Ini merupakan Methode mutator untuk set nilai isSelesai
     * 
     * @param diproses merupakan variabel yang akan di masukkan pada variable isSelesai pada Class
     */
    public void setStatusSelesai(boolean diproses) {
        isSelesai = diproses;
    }

    public void setStatusAktif(boolean aktif) {
        isAktif = aktif;
    }

    /**
     * Ini merupakan Methode mutator untuk set Room
     * 
     * @param kamar merupakan Object yang akan di pasangkan pada object pesanan
     */
    public void setRoom(Room kamar) {
        this.kamar = kamar;
    }
    
    /**
     * Ini merupakan Methode untuk mengset Date dari Object ini
     * 
     * @return tanggalPesan merupakan tanggal pesanan
     * 
     */
    public void tanggalPesan(Date tanggalPesan){
        this.tanggalPesan = tanggalPesan;
    }
    
    //Methode print semua data
    /**
     * Merupakan Metod yang akan digunakan untuk mengprint data.
     * Tipe kamar harus di edit untuk to string, sekarang tidak bisa karena belom di set oleh fungsi - fungsi
     * Untuk mengurangi permasalah nullexception diberikan try catch.
     */
    public String toString() {
        String final_status = "KOSONG";
        if(isDiproses == true && isSelesai == false) final_status = "DIPROSES";
        else if(isDiproses == false && isSelesai == false) final_status = "KOSONG";
        else if(isDiproses == false && isSelesai == true) final_status = "SELESAI";

        if(getRoom()==null){
            return "\npelanggan=" + getPelanggan().getNama()
                    + " status=" + final_status;
        }

        return "pelanggan=" + getPelanggan().getNama()
            + " hotel=" + getRoom().getHotel().getNama()
            + " kamar=" + getRoom().getNomorKamar()
            + " tipeKamar=" + getRoom().getTipeKamar().toString()
            + " Status=" + final_status + ".";
    }
}
