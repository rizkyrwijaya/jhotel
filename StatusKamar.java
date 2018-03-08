
/**
 * Enumeration class TipeKamar - Membatasi tipe kamar
 *
 * @author Rizky Ramadian Wijaya
 * @version 3/8/2018
 */
public enum StatusKamar
{
    BOOKED("Booked"),PROCESSED("Processed"),VACANT("Vacant");
    
    private final String status;
    
    /**
     * Constructor StatusKamar
     * 
     * @param type merupakan status dalam string
     */
    StatusKamar(String status)
    {
        this.status=status;
    }
    
    /**
     * toString() - Method pengambilan String
     * 
     * @return type mengembalikkan status kamar sebagai string
     */
    public String toString()
    {
        return status;
    }
}
