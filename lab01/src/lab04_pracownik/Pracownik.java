package lab04_pracownik;

import java.util.Random;

class Pracownik extends Osoba {
    private final String nazwisko; // teraz tylko w deklaracji
    private double pensja;
    private int id;

    private static int nastepnyId;

    static {
        Random rand = new Random();
        nastepnyId = rand.nextInt(100);
    }

    {
        id = przyznajId();
    }

    public Pracownik() {
        this("Domyślne", 3000);
    }

    public Pracownik(double pensja) {
        this("Domyślne", pensja);
    }

    public Pracownik(String nazwisko, double pensja) {
        super(nazwisko);
        this.nazwisko = nazwisko;
        this.pensja = pensja;
    }

    private static int przyznajId() {
        return nastepnyId++;
    }

    public int getId() {
        return id;
    }

    public double getPensja() {
        return pensja;
    }

    public void setPensja(double pensja) {
        this.pensja = pensja;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void podniesPensje(double procent) {
        pensja += pensja * procent / 100;
    }

    @Override
    public String getOpis() {
        return "Pracownik z pensją: " + pensja;
    }

    @Override
    public String toString() {
        return getClass().getName() + " [ID=" + id + ", Nazwisko=" + nazwisko + ", Pensja=" + pensja + "]";
    }
}
