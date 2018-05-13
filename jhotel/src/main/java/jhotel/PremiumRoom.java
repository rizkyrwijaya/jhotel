package jhotel;

/**
 * Merupakan subclass room
 *
 * @author Rizky Ramadian Wijaya
 * @version 15/3/2018
 */
public class PremiumRoom extends Room
{
    // instance variables - replace the example below with your own
    private static TipeKamar TIPE_KAMAR = TipeKamar.PREMIUM;
    private static double DISCOUNT = 0.3;
    
    /**
     * Constructor for objects of class SingleRoom
     */
    public PremiumRoom(Hotel hotel,String nomor_kamar)
    {
        super(hotel, nomor_kamar);
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
     * Method mutator untuk Daily tariff pada room
     * 
     * @param dailyTariff masukkan nilai daily tariff baru
     */
    public void setDailyTariff(double dailyTariff){
        super.setDailyTariff(dailyTariff*DISCOUNT);
        
    }
}
