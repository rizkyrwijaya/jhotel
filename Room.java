
/**
 * Class untuk objek objek Room
 *
 * @author Rizky Ramadian Wijaya
 * @version 8/3/2018
 */
public abstract class Room
{
    // instance variables
    private Hotel hotel;
    private String nomor_kamar;
    private boolean isAvailable;
    protected double dailyTariff;
    private StatusKamar status_kamar;
    private Pesanan pesan;
    
    /**
     * Constructor for objects of class Room
     */
    public Room(Hotel hotel,String nomor_kamar,boolean isAvailable,StatusKamar status_kamar)
    {
        this.hotel = hotel;
        this.nomor_kamar = nomor_kamar;
        this.isAvailable = isAvailable;
        this.status_kamar = status_kamar;
    }

    /**
     * Metode Accessor untuk Hotel
     *
     * @return Object Hotel
     */
    public Hotel getHotel()
    {
        return hotel;
    }
    
    
    /**
     * Method Accessor untuk Nomor Kamar
     *
     * @return Nomor Kamar
     */
    public String getNomorKamar()
    {
        return nomor_kamar;
    }
    
    /**
     * Method Accessor untuk Status Available
     *
     * @return Status Availability
     */
    public boolean StatusAvailable()
    {
        return isAvailable;
    }
    
    /**
     * Method Accessor untuk Tarif perhari
     *
     * @return Tarif perhari
     */
    public double getDailyTariff()
    {
        return dailyTariff;
    }
    
    /**
     * Method Accessor untuk Status Kamar
     *
     * @return Status kamar berdasarkan enum
     */
    public StatusKamar getStatusKamar()
    {
        return status_kamar;
    }
    
    /**
     * Method Accessor untuk Pesanan
     *
     * @return Pesanan
     */
    public Pesanan getPesanan()
    {
        return pesan;
    }
    
    /**
     * Method Abstract method untuk tipeKamar
     *
     * @return TipeKamar
     */
    public abstract TipeKamar getTipeKamar();
    
    /**
     * Method Mutator untuk Hotel
     *
     * @param hotel object hotel
     */
    public void setHotel(Hotel hotel)
    {
        this.hotel = hotel;
    }
    
    
    /**
     * Method Mutator untuk NomorKamar
     *
     * @param nomor_kamar untuk nomorkamar
     */
    public void setNomorKamar(String nomor_kamar)
    {
        this.nomor_kamar = nomor_kamar;
    }
    
    /**
     * Method Mutator untuk Status Available
     *
     * @param isAvailable status avaibilitas kamar
     */
    public void setStatusAvailable(boolean isAvailable)
    {
        this.isAvailable = isAvailable;
    }
    
    
    /**
     * Method Mutator untuk DailyTariff
     *
     * @param dailytariff untuk set daily tariff
     */
    public void setDailyTariff(double dailytariff)
    {
        this.dailyTariff = dailytariff;
    }
    
    /**
     * Method Mutator untuk Status Kamar
     *
     * @param status_kamar untuk mengganti status kamar
     */
    public void setStatusKamar(StatusKamar status_kamar)
    {
        this.status_kamar = status_kamar;
    }
    
    /**
     * Method Mutator untuk Pesanan
     *
     * @param pesan untuk mengganti Object Pesanan
     */
    public void setPesanan(Pesanan pesan)
    {
        this.pesan = pesan;
    }
    
    /**
     * Method untuk mengprint semua data pada class
     * 
     * 
     */
    
    public void printData()
    {
        System.out.println("\n====================INFO KAMAR=====================\n");
        System.out.println("Nama Hotel \t\t: " + getHotel().getNama());
        System.out.println("Nomor Kamar \t\t: " + nomor_kamar);
        System.out.println("Ketersediaan Kamar \t: " + isAvailable);
        System.out.println("Harga Permalam  \t\t: " + dailyTariff);
        System.out.println("Status Kamar \t\t: " + status_kamar.toString());
        System.out.println("Tipe Kamar \t\t: " + getTipeKamar().toString());
    }
    
    
}
