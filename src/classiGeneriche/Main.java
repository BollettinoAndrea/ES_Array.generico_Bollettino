package classiGeneriche;

public class Main {
    public static void main(String[] args) {
        Vettore<Mobile> mobili = new Vettore<>(3);
        mobili.aggiungi(new Mobile(20.8, 120.0));
        mobili.aggiungi(new Mobile(23.7, 160.0));
        mobili.aggiungi(new Mobile(12.2, 70.0));
        mobili.aggiungi(new Mobile(29.1, 210.0));

        System.out.println("Vettore dei Mobili:");
        mobili.visualizza();

        Vettore<Infisso> infissi = new Vettore<>(2);
        infissi.aggiungi(new Infisso("Granito", 0.9, 1.0));
        infissi.aggiungi(new Infisso("Ferro", 1.8, 0.8));
        infissi.aggiungi(new Infisso("Legno", 1.9, 1.7));

        System.out.println(" ");
        System.out.println("Vettore degli Infissi:");
        infissi.visualizza();
    }
}