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
    private double biaya;
    private double jumlahHari;
    private Customer pelanggan;
    private boolean isDiproses;
    private boolean isSelesai;
    private Room kamar;
    private Date tanggalPesan;

    //Method Constructor dari Class
    /**
     * Ini merupakan Constructor dari Class Pesanan
     * 
     * @param biaya merupakan parameter untuk menentukan harga pesanan
     * @param pelanggan merupakan parameter yang akan menunjukan pelanggan yang memesan
     */
    public Pesanan(double jumlahHari,Customer pelanggan,Room kamar,int year, int month, int day)
    {
        this.jumlahHari=jumlahHari;
        this.pelanggan = pelanggan;
        this.kamar = kamar;
        this.biaya = kamar.getDailyTariff()*jumlahHari;
        this.tanggalPesan = new GregorianCalendar(year,month-1,day).getTime();
    }
    
    public Pesanan(double jumlahHari,Customer pelanggan,Room kamar,Date tanggalPesan)
    {
        this.jumlahHari=jumlahHari;
        this.pelanggan = pelanggan;
        this.kamar = kamar;
        this.biaya = kamar.getDailyTariff()*jumlahHari;
        this.tanggalPesan = tanggalPesan;
        this.tanggalPesan.setMonth(tanggalPesan.getMonth()-1);
    }
    
    //Methode Getter (Accessor) untuk class
     /**
     * Ini merupakan Methode untuk mendapatkan biaya dari objek class pesanan
     * 
     * @return biaya mendapatkan biaya bayar dari pesanan
     */
    public double getBiaya()
    {
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
    public Date tanggalPesan(){
        return tanggalPesan;
    }
    
    //Methode Setter (Mutator) untuk class
    /**
     * Ini merupakan Methode mutator untuk set nilai biaya
     * 
     * @param biaya merupakan variabel yang akan di masukkan pada variable biaya pada Class
     */
    public void setBiaya()
    {
        this.biaya = kamar.getDailyTariff()*jumlahHari;
    }
    
    /**
     * Ini merupakan Methode mutator untuk set nilai pelanggan
     * 
     * @param baru merupakan variabel yang akan di masukkan pada variable peanggan pada Class
     */
    public void setPelanggan(Customer baru)
    {
        pelanggan=baru;
    }
    
    /**
     * Ini merupakan Methode mutator untuk set nilai jumlahHari
     * 
     * @param jumlahHari merupakan variabel yang akan di masukkan pada variable biaya pada Class
     */
    public void setJumlahHari(double jumlahHari)
    {
        this.jumlahHari = jumlahHari;
    }

    
    /**
     * Ini merupakan Methode mutator untuk set nilai isDiproses
     * 
     * @param diproses merupakan variabel yang akan di masukkan pada variable isDiproses pada Class
     */
    public void setStatusDiproses(boolean diproses)
    {
        isDiproses = diproses;
    }
    
    /**
     * Ini merupakan Methode mutator untuk set nilai isSelesai
     * 
     * @param diproses merupakan variabel yang akan di masukkan pada variable isSelesai pada Class
     */
    public void setStatusSelesai(boolean diproses)
    {
        isSelesai = diproses;
    }
    
    /**
     * Ini merupakan Methode mutator untuk set Room
     * 
     * @param kamar merupakan Object yang akan di pasangkan pada object pesanan
     */
    public void setRoom(Room kamar)
    {
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
    public String toString()
    {
        String final_status = "KOSONG";
        if(isDiproses == true && isSelesai == false) final_status = "DIPROSES";
        else if(isDiproses == false && isSelesai == false) final_status = "KOSONG";
        else if(isDiproses == false && isSelesai == true) final_status = "SELESAI";
        
        return "Dibuat oleh " + getPelanggan().getNama() 
            + ". Proses booking untuk " + getRoom().getHotel().getNama() 
            + "kamar nomor " + getRoom().getNomorKamar() 
            + "dengan tipe kamar yang diinginkan " + getRoom().getTipeKamar().toString() 
            + ". Status: " + final_status + ".";
    }
}
