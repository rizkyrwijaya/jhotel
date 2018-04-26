package jhotel;
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
    protected double dailyTariff;
    private StatusKamar status_kamar;
    
    /**
     * Constructor for objects of class Room
     */
    public Room(Hotel hotel,String nomor_kamar)
    {
        this.hotel = hotel;
        this.nomor_kamar = nomor_kamar;
        this.status_kamar = StatusKamar.VACANT;
    }

    /**
     * Metode Accessor untuk Hotel
     *
     * @return Object Hotel
     */
    public Hotel getHotel(){
        return hotel;
    }
    
    
    /**
     * Method Accessor untuk Nomor Kamar
     *
     * @return Nomor Kamar
     */
    public String getNomorKamar()    {
        return nomor_kamar;
    }

    /**
     * Method Accessor untuk Tarif perhari
     *
     * @return Tarif perhari
     */
    public double getDailyTariff() {
        return dailyTariff;
    }
    
    /**
     * Method Accessor untuk Status Kamar
     *
     * @return Status kamar berdasarkan enum
     */
    public StatusKamar getStatusKamar() {
        return status_kamar;
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
    public void setHotel(Hotel hotel)    {
        this.hotel = hotel;
    }
    
    
    /**
     * Method Mutator untuk NomorKamar
     *
     * @param nomor_kamar untuk nomorkamar
     */
    public void setNomorKamar(String nomor_kamar)    {
        this.nomor_kamar = nomor_kamar;
    }

    /**
     * Method Mutator untuk DailyTariff
     *
     * @param dailytariff untuk set daily tariff
     */
    public void setDailyTariff(double dailytariff){
        this.dailyTariff = dailytariff;
    }
    
    /**
     * Method Mutator untuk Status Kamar
     *
     * @param status_kamar untuk mengganti status kamar
     */
    public void setStatusKamar(StatusKamar status_kamar)    {
        this.status_kamar = status_kamar;
    }
    

    
    /**
     * Method untuk mengprint semua data pada class
     * 
     * 
     */
    public String toString()
    {
        if(DatabasePesanan.getPesananAktif(this) == null)
        {
            return "Hotel: " + getHotel().getNama()
                    + "\tTipeKamar: " + getTipeKamar()
                    + "\tHarga: " + getDailyTariff()
                    + "\tStatusKamar:" + getStatusKamar().toString() + "\n";
        }
        else
        {
            return "Hotel: " + getHotel().getNama()
                    + "\tTipeKamar: " + getTipeKamar()
                    + "\tHarga:" + getDailyTariff()
                    + "\tStatus Kamar: " + getStatusKamar().toString()
                    + "Pelanggan: " + DatabasePesanan.getPesananAktif(this).getPelanggan().getNama() + "\n";
        }
    }
    
    
}
