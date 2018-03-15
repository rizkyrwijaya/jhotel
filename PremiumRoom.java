
/**
 * Merupakan subclass room
 *
 * @author Rizky Ramadian Wijaya
 * @version 15/3/2018
 */
public class PremiumRoom extends Room
{
    // instance variables - replace the example below with your own
    private static TipeKamar TIPE_KAMAR = TipeKamar.DOUBLE;
    private static double DISCOUNT = 0.3;
    
    /**
     * Constructor for objects of class SingleRoom
     */
    public PremiumRoom(Hotel hotel,String nomor_kamar,boolean isAvailable,StatusKamar status_kamar)
    {
        super(hotel, nomor_kamar, isAvailable, status_kamar);
        
    }
    
    /**
     * Method accessor untuk tipe kamar
     * 
     * @return TIPE_KAMAR mengembalikkan tipekamar
     */
    public TipeKamar getTipeKamar(){
        return TIPE_KAMAR;
    }
    
    /**
     * Method accessor untuk Discount
     * 
     * @return DISCOUNT mengembalikkan Discount Premium room
     */
    public double getDiscount(){
        return DISCOUNT;
    }
    
    /**
     * Method mutator untuk Daily tariff pada room
     * 
     * @param dailyTariff masukkan nilai daily tariff baru
     */
    public void setDailyTariff(double dailyTariff){
        super.setDailyTariff(dailyTariff*DISCOUNT);
        
    }
}
