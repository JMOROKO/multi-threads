public class Talkative implements Runnable{
    private int attr;
    public Talkative(int attr) {
        this.attr = attr;
    }

    @Override
    public void run() {
        for (int i = 0; i < 100; i++){
            attr++;
            System.out.println(attr);
        }
    }
}
