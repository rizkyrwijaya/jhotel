package jhotel;
/**
 * Merupakan subclass room
 *
 * @author Rizky Ramadian Wijaya
 * @version 15/3/2018
 */
public class SingleRoom extends Room
{
    // instance variables - replace the example below with your own
    private static TipeKamar TIPE_KAMAR = TipeKamar.SINGLE;

    /**
     * Constructor for objects of class SingleRoom
     */
    public SingleRoom(Hotel hotel,String nomor_kamar) {
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
}
