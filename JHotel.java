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
        /* Latihan Modul 4
        Customer customer1 = new Customer(150729, "Rizky Ramadian Wijaya");
        Lokasi lokasi1 = new Lokasi(30, 30, "Bukan Lokasi saya");
        Hotel hotel1 = new Hotel("Bukan Hotel Saya", lokasi1, 5); 
        Pesanan pesanan1 = new Pesanan(50000, customer1);
        Room kamar1 = new Room(hotel1,"123",true,customer1,500000,StatusKamar.VACANT);
        System.out.println("\n=====================DATA AWAL=====================");
        lokasi1.printData();
        customer1.printData();
        hotel1.printData();
        
        //Test Pertama fungsi pesanan Ditugaskan
        Administrasi.pesananDitugaskan(pesanan1,kamar1);
        System.out.println("\n======================FUNGSI 1=====================");
        pesanan1.printData();
        kamar1.printData();
        
        //Test Kedua fungsi pesananDibatalkan dengan kamar
        Administrasi.pesananDibatalkan(kamar1);
        System.out.println("\n======================FUNGSI 2=====================");
        pesanan1.printData();
        kamar1.printData();
        
        //Test Ketiga fungsi pesananSelesai dengan kamar)
        Administrasi.pesananDitugaskan(pesanan1,kamar1);
        Administrasi.pesananSelesai(kamar1);
        System.out.println("\n======================FUNGSI 3=====================");
        pesanan1.printData();
        kamar1.printData();
        
        //Test KeEmpat fungsi pesanandibatalkan dengan pesanan
        Administrasi.pesananDitugaskan(pesanan1,kamar1);
        Administrasi.pesananDibatalkan(pesanan1);
        System.out.println("\n======================FUNGSI 4=====================");
        pesanan1.printData();
        kamar1.printData();
        
        //Test Kelima fungsi pesananSelesai dengan pesanan
        Administrasi.pesananDitugaskan(pesanan1,kamar1);        
        Administrasi.pesananSelesai(pesanan1);
        System.out.println("\n======================FUNGSI 5=====================");
        pesanan1.printData();
        kamar1.printData();
        */
        System.out.println("7a");
        Lokasi lokasi1 = new Lokasi(30, 30, "Bukan Lokasi saya");
        Hotel hotel1 = new Hotel("Bukan Hotel Saya", lokasi1, 5);
        Room singleroom1 = new SingleRoom(hotel1, "A.101", true, StatusKamar.VACANT);
        Customer customer1 = new Customer(150729, "Rizky Ramadian Wijaya");
        singleroom1.setDailyTariff(300000);
        Pesanan pesanan1 = new Pesanan(4, customer1,singleroom1);
        
        System.out.println("7b");
        lokasi1.printData();
        customer1.printData();
        hotel1.printData();
        
        System.out.println("\n\n7c");
        Administrasi.pesananDitugaskan(pesanan1, singleroom1);
        System.out.println("\n====================DITUGASKAN =====================");
        pesanan1.printData();
        singleroom1.printData();
        
        System.out.println("\n\n7d");
        if(singleroom1 instanceof DoubleRoom){
            System.out.println("Benar Double Room");
        }
        else {
            System.out.println("Salah, bukan Double Room");
        }
        
        System.out.println("\n\n7e dan 7f dan 7g");
        System.out.println("===================Pembuatan DoubleRoom===============");
        Room doubleroom1 = new DoubleRoom(hotel1, "B.102", true, StatusKamar.VACANT);
        doubleroom1.setDailyTariff(500000);
        Pesanan pesanan2 = new Pesanan(3, customer1, doubleroom1);
        Administrasi.pesananDitugaskan(pesanan2, doubleroom1);
        pesanan2.printData();
        doubleroom1.printData();
        
        System.out.println("\n\n7h");
        if(doubleroom1 instanceof DoubleRoom){
            System.out.println("Benar Double Room");
        }
        else {
            System.out.println("Salah, bukan Double Room");
        }
        
        
    }
    
    
    /**
     * Constructor dari Class JHotel
     */
    public JHotel()
    {
    }
}
