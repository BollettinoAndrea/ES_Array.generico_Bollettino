import java.util.ArrayList;

class Vettore<T> {
    private ArrayList<T> elementi;

    public Vettore() {
        elementi = new ArrayList<>();
    }

    public void aggiungi(T elemento) {
        elementi.add(elemento);
    }

    public void visualizza() {
        for (T elemento : elementi) {
            System.out.println(elemento);
        }
    }
}
