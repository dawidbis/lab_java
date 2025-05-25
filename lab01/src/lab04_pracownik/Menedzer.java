package lab04_pracownik;

class Menadzer extends Pracownik {
    private double bonus;

    public Menadzer() {
        this("Domyślny Menadżer", 5000, 1000);
    }

    public Menadzer(double pensja) {
        this("Domyślny Menadżer", pensja, 1000);
    }

    public Menadzer(String nazwisko, double pensja, double bonus) {
        super(nazwisko, pensja);
        this.bonus = bonus;
    }

    public void zmienBonus(double bonus) {
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    @Override
    public double getPensja() {
        return super.getPensja() + bonus;
    }

    @Override
    public String getOpis() {
        return "Menadżer z pensją: " + getPensja();
    }
}
