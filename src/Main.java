public class Main {
    public static void main(String[] args) {
        Vettore<Infisso> vettoreInfissi = new Vettore<>();
        vettoreInfissi.aggiungi(new Infisso("Legno", 2.0, 1.5));
        vettoreInfissi.aggiungi(new Infisso("Alluminio", 2.2, 1.3));

        Vettore<Mobile> vettoreMobili = new Vettore<>();
        vettoreMobili.aggiungi(new Mobile(30.5, 250.0));
        vettoreMobili.aggiungi(new Mobile(15.0, 120.0));

        System.out.println("Lista Infissi:");
        vettoreInfissi.visualizza();

        System.out.println("\nLista Mobili:");
        vettoreMobili.visualizza();
    }
}