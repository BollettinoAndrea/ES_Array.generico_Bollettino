package classiGeneriche;

public class Infisso {
    private String materiale;
    private double altezza;
    private double larghezza;

    public Infisso(String materiale, double altezza, double larghezza) {
        this.materiale = materiale;
        this.altezza = altezza;
        this.larghezza = larghezza;
    }

    public String getMateriale() {
        return materiale;
    }
    public double getAltezza() {
        return altezza;
    }
    public double getLarghezza() {
        return larghezza;
    }

    public void setLarghezza(double larghezza) {
        this.larghezza = larghezza;
    }
    public void setMateriale(String materiale) {
        this.materiale = materiale;
    }
    public void setAltezza(double altezza) {
        this.altezza = altezza;
    }

    @Override
    public String toString() {
        return "Infisso --> Materiale: " + materiale + ", di altezza: " + altezza + "m e di larghezza: " + larghezza + "m.";
    }
}