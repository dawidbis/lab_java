package lab04_pracownik;

abstract class Osoba {
    private String nazwisko;

    public Osoba(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public abstract String getOpis();
}
