
public class Draghetto implements Runnable {
    private String nome;
    private int numBattiti;

    public Draghetto(int numBattiti, String nome) {
        this.numBattiti = numBattiti;
        this.nome = nome;
    }

    @Override
    public void run() {
        for (int i = 0; i < numBattiti && !Thread.currentThread().isInterrupted(); i++) {
            System.out.println(this.nome + " vola per la: " + (i + 1) + " volta");

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println(this.nome + " è stato colpito!");
                return;
            }
        }
    }
}
