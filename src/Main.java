import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) {
        /*Talkative t1 = new Talkative(1);
        Talkative t2 = new Talkative(2);
        Talkative t3 = new Talkative(3);
        Talkative t4 = new Talkative(4);
        Talkative t5 = new Talkative(5);
        Talkative t6 = new Talkative(6);
        Talkative t7 = new Talkative(7);
        Talkative t8 = new Talkative(8);
        Talkative t9 = new Talkative(9);
        Talkative t10 = new Talkative(10);

        new Thread(t1).start();
        new Thread(t2).start();
        new Thread(t3).start();
        new Thread(t4).start();
        new Thread(t5).start();
        new Thread(t6).start();
        new Thread(t7).start();
        new Thread(t8).start();
        new Thread(t9).start();
        new Thread(t10).start();*/



        int[] tab = new int[10];
        tab[0] = 10;
        tab[1] = 5;
        tab[2] = 12;
        tab[3] = 4;
        tab[4] = 12;
        tab[5] = 10;
        tab[6] = 11;
        tab[7] = 100;
        tab[8] = 10;
        tab[9] = 101;
        // création d'un pool de thread afin d'optimiser l'utilisation des thread
        ExecutorService serviceThreadPool = Executors.newFixedThreadPool(2); //creation de deux threads
        for (int i = 0; i<4; i++){
            Sommeur sommeur = new Sommeur(tab,0+i, i+5);
            serviceThreadPool.submit(sommeur);
        }
        serviceThreadPool.shutdown();
    }
}