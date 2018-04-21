/**
 * LetsGo merupakan tugas 12 dari praktikum OOP
 * Tujuan adalah untuk mengtest threading
 *
 * @author Rizky Ramadian Wijaya
 * @version 21/4/2018
 *
 */

import java.util.Random;

public class LetsGo {

    public static int random(){
        int min = 100;
        int max = 500;
        return new Random().nextInt((max-min))+min;
    }

    public static void main(String[] args){
        int d1,d2,d3;
        do {
            d1 = random();
            d2 = random();
            d3 = random();
        }while(!(d1>d2 && d2>d3));

        RunForYourLife Lionel = new RunForYourLife("Lionel",d1);
        Lionel.start();
        RunForYourLife Andres = new RunForYourLife("Andres",d2);
        Andres.start();
        RunForYourLife Messi = new RunForYourLife("Messi",d3);
        Messi.start();
    }
}
