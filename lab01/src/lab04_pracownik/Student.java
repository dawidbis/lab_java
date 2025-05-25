package lab04_pracownik;

class Student extends Osoba {
    private String kierunek;

    public Student(String nazwisko, String kierunek) {
        super(nazwisko);
        this.kierunek = kierunek;
    }

    @Override
    public String getOpis() {
        return "Student kierunku: " + kierunek;
    }
}