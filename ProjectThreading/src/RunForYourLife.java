/**
 * RunForYourLife merupakan tugas 12 dari praktikum OOP
 * Tujuan adalah untuk mengtest threading
 *
 * @author Rizky Ramadian Wijaya
 * @version 21/4/2018
 *
 */

public class RunForYourLife implements Runnable{
    private String threadName;
    private int delay;
    public static int checkpoints = 20;


    public RunForYourLife(String threadName,int delay){
        this.threadName = threadName;
        this.delay = delay;
        System.out.println(threadName + ", ready.");
    }

    public void run(){
        System.out.println(threadName + ", go!");
        for(int i = 0;i<checkpoints;i++){
                System.out.println(threadName + "\thas passed checkpoint (" + (i+1) + ")");
            try{
                Thread.sleep(delay);
            } catch(InterruptedException E){
                System.out.println(threadName + " was interrupted");
            }
        }
        System.out.println(threadName + " has finished!");
    }

    public void start(){
        System.out.println(threadName + ", set ...");
        (new Thread(this, threadName)).start();
    }

}
