package classiGeneriche;

public class Mobile {
    private double peso;
    private double prezzo;

    public Mobile(double peso, double prezzo) {
        this.peso = peso;
        this.prezzo = prezzo;
    }

    public double getPeso() {
        return peso;
    }
    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }
    public void setPeso(double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Mobile --> di peso: " + peso + "kg e prezzo: " + prezzo + "€.";
    }
}