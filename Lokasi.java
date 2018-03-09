
/**
 * Class Lokasi buat Tugas Case Study OOP
 *
 * @author Rizky Ramadian Wijaya
 * @version 1/3/2018
 */
public class Lokasi
{
    //Bagian disini menunjukan Variabel-variabel pada class Lokasi
    private float x_coord;
    private float y_coord;
    private String deskripsiLokasi;
    
    //Method Constructor dari Class
    /**
     * Ini merupakan Constructor dari Class Lokasi
     * 
     * @param x_coord merupakan parameter untuk menentukan koordinasi x hotel
     * @param y_coord merupakan parameter untuk menentukan koordinasi y hotel
     * @param deskripsiLokasi merupakan parameter untuk menentukan deskripsiLokasi dari Hotel
     */
    public Lokasi(float x_coord, float y_coord, String deskripsiLokasi)
    {
        this.x_coord = x_coord;
        this.y_coord = y_coord;
        this.deskripsiLokasi = deskripsiLokasi;
    }
    
    //Methode Getter (Accessor) untuk class
    /**
     * Ini merupakan Methode untuk mendapatkan X_Coord dari objek class Lokasi
     * 
     * @return x_coord mengembalikkan variabel koordinasi x objek class Lokasi
     */
    public float getX(){
        return x_coord;
    }
    
    /**
     * Ini merupakan Methode untuk mendapatkan Y_Coord dari objek class Lokasi
     * 
     * @return y_coord mengembalikkan variabel koordinasi y objek class Lokasi
     */
    public float getY(){
        return y_coord;
    }
    
    /**
     * Ini merupakan Methode untuk mendapatkan deskripsiLokasi dari objek class Lokasi
     * 
     * @return deskripsiLokasi mengembalikkan variabel deskripsiLokasi objek class Lokasi
     */
    public String getDeskripsi(){
        return deskripsiLokasi;
    }
    
    //Methode Setter (Mutator) untuk class
    /**
     * Ini merupakan Methode mutator untuk set nilai x_coord
     * 
     * @param x_coord merupakan variabel yang akan di masukkan pada variable x_coord pada Object Class Lokasi
     */
    public void setX(float x_coord){
        this.x_coord=x_coord;
    }
    
    /**
     * Ini merupakan Methode mutator untuk set nilai y_coord
     * 
     * @param y_coord merupakan variabel yang akan di masukkan pada variable y_coord pada Object Class Lokasi
     */
    public void setY(float y_coord){
        this.y_coord=y_coord;
    }
    
    /**
     * Ini merupakan Methode mutator untuk set nilai deskripsiLokasi
     * 
     * @param deskripsi merupakan variabel yang akan di masukkan pada variable deskripsi pada Object Class Lokasi
     */
    public void setDeskripsi(String deskripsi){
        deskripsiLokasi = deskripsi;
    }
    
    
    //Methode print semua data
    /**
     * Merupakan Metod yang akan digunakan untuk mengprint data.
     */
    public void printData(){
        System.out.println("\n====================LOKASI HOTEL===================\n");
        System.out.println("Coordinasi X \t\t: " + x_coord);
        System.out.println("Coordinasi Y \t\t: " + y_coord);
        System.out.println("Deskripsi Lokasi\t\t: " + deskripsiLokasi);
    }
    
}
