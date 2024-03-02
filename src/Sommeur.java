public class Sommeur implements Runnable{
    private int[] tab;
    private int debut;
    private int fin;
    @Override
    public void run() {
        String s = "Début "+ this.debut + " - Fin " + this.fin + " - " + this.getSomme();
        System.out.println("Somme : " +s);
    }

    public Sommeur(int[] tab, int debut, int fin) {
        this.tab = tab;
        this.debut = debut;
        this.fin = fin;
    }

    public int getSomme(){
        int somme = 0;
        for(int i = this.debut; i<=this.fin; i++){
            somme = somme + this.tab[i];
        }
        return somme;
    }
}
