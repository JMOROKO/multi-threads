public class Main {
    public static void main(String[] args) {
        Talkative t1 = new Talkative(0);
        Talkative t2 = new Talkative(0);
        Talkative t3 = new Talkative(0);
        Talkative t4 = new Talkative(0);
        Talkative t5 = new Talkative(0);
        Talkative t6 = new Talkative(0);
        Talkative t7 = new Talkative(0);
        Talkative t8 = new Talkative(0);
        Talkative t9 = new Talkative(0);
        Talkative t10 = new Talkative(0);

        new Thread(t1).start();
        new Thread(t2).start();
        new Thread(t3).start();
        new Thread(t4).start();
        new Thread(t5).start();
        new Thread(t6).start();
        new Thread(t7).start();
        new Thread(t8).start();
        new Thread(t9).start();
        new Thread(t10).start();
    }
}