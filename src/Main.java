
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inTastiera = new Scanner(System.in);

        System.out.println("Inserisci il numero di battiti di ali: ");
        int count = inTastiera.nextInt();

        Thread argo = new Thread(new Draghetto(count, "Argo"));
        argo.start();

        Cavaliere cavaliere = new Cavaliere("Artù");

        for (int i = 0; i < count; i++) {
            System.out.println("main sta osservando il drago... " + (i + 1));

            if (i == count / 2) {
                cavaliere.lanciaDardi(argo);
            }

            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Main interrotto");
            }
        }

        inTastiera.close();
    }
}
