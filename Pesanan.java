
 /**
 * Class Pesanan Tugas Case Study Prak OOP
 *
 * @author Rizky Ramadian Wijaya
 * @version 1/3/2018
 */
public class Pesanan
{
    //Bagian disini menunjukan Variabel-variabel pada class
    private double biaya;
    private Customer pelanggan;
    private String nama_pelanggan;
    private TipeKamar tipe_kamar;
    private boolean isDiproses;
    private boolean isSelesai;
    private Room kamar;

    //Method Constructor dari Class
    /**
     * Ini merupakan Constructor dari Class Pesanan
     * 
     * @param biaya merupakan parameter untuk menentukan harga pesanan
     * @param pelanggan merupakan parameter yang akan menunjukan pelanggan yang memesan
     */
    public Pesanan(double biaya, Customer pelanggan)
    {
        this.biaya = biaya;
        this.pelanggan = pelanggan;
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
    public String getNamaPelanggan(){
        return nama_pelanggan;
    }
    
    /**
     * Ini merupakan Methode untuk mendapatkan tipe kamar dari objek class pesanan
     * 
     * @return tipe_kamar mengembalikkan variabel tipe_kamar objek class pesanan
     */
    public TipeKamar getTipeKamar(){
        return tipe_kamar;
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
    
    //Methode Setter (Mutator) untuk class
    /**
     * Ini merupakan Methode mutator untuk set nilai biaya
     * 
     * @param biaya merupakan variabel yang akan di masukkan pada variable biaya pada Class
     */
    public void setBiaya(double biaya)
    {
        this.biaya=biaya;
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
     * Ini merupakan Methode mutator untuk set nilai nama Pelanggan 
     * 
     * @param nama_pelanggan merupakan variabel yang akan di masukkan pada variable nama_pelanggan pada Class
     */
    public void setNamaPelanggan(String nama_pelanggan)
    {
        this.nama_pelanggan=nama_pelanggan;
    }
    
    /**
     * Ini merupakan Methode mutator untuk set nilai nama Tipe Kamar 
     * 
     * @param tipe_kamar merupakan variabel yang akan di masukkan pada variable tipe_kamar pada Class
     */
    public void setTipeKamar(TipeKamar tipe_kamar)
    {
        this.tipe_kamar=tipe_kamar;
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
    
    //Methode print semua data
    /**
     * Merupakan Metod yang akan digunakan untuk mengprint data.
     * Tipe kamar harus di edit untuk to string, sekarang tidak bisa karena belom di set oleh fungsi - fungsi
     * Untuk mengurangi permasalah nullexception diberikan try catch.
     */
    public void printData()
    {
        System.out.println("\n======================PESANAN======================\n");
        System.out.println("Nama Pelanggan \t\t: " + getPelanggan().getNama());
        try {
            System.out.println("Tipe Kamar dipesan \t: " + tipe_kamar.toString());
        }
        catch (NullPointerException e){
            System.out.println("Tipe Kamar dipesan \t: Not set");
        }
        System.out.println("Sedang di proses \t\t: " + isDiproses);
        System.out.println("Sudah Selesai  \t\t: " + isSelesai);
    }
}
