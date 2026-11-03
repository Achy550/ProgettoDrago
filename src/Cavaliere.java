
public class Cavaliere {
    private String nome;

    public Cavaliere(String nome) {
        this.nome = nome;
    }

    public void lanciaDardi(Thread drago) {
        System.out.println(nome + " lancia un dardo contro il drago!");
        drago.interrupt();
    }
}
