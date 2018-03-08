/**
 * Class Hotel
 *
 * @author Rizky Ramadian Wijaya
 * @version 1/3/2018
 */
public class JHotel
{   
    /**
     * Merupakan metode main dari Applikasi JHotel
     * 
     * @param args argumen untuk main
     */
    public static void main(String[] args)
    {
        Customer customer1 = new Customer(150729, "Rizky Ramadian Wijaya");
        Lokasi lokasi1 = new Lokasi(30, 30, "Bukan Lokasi saya");
        Hotel hotel1 = new Hotel("Bukan Hotel Saya", lokasi1, 5); 
        Pesanan pesanan1 = new Pesanan(50000, customer1);
        
        customer1.printData();
        hotel1.printData();
        pesanan1.printData();
        
        customer1.setNama("Kristofer Jehezkiel Bangun");
        
        System.out.println("Diubah Nama");
        
        customer1.printData();
        hotel1.printData();
        pesanan1.printData();
        
    }
    
    /**
     * Constructor dari Class JHotel
     */
    public JHotel()
    {
    }
}
