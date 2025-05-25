package lab04_pracownik;

public class TestPracownik {
    public static void main(String[] args) {
        System.out.println("ZADANIE 5 - MENADŻER:");
        Menadzer szef = new Menadzer("Kowalski", 10000, 5000);

        Pracownik[] pracownicy = new Pracownik[6];
        pracownicy[0] = new Pracownik();
        pracownicy[1] = new Pracownik(5000);
        pracownicy[2] = new Pracownik("Nowak", 6000);

        pracownicy[3] = new Menadzer();
        pracownicy[4] = new Menadzer(8000);
        pracownicy[5] = new Menadzer("Wiśniewski", 9000, 1000);

        for (Pracownik p : pracownicy) {
            p.podniesPensje(5);
        }

        for (Pracownik p : pracownicy) {
            System.out.println(p);
            System.out.println("Opis: " + p.getOpis());
        }

        System.out.println("\nZADANIE 6 - OSOBY:");
        Osoba[] osoby = new Osoba[9];
        osoby[0] = new Student("Kowal", "Informatyka");
        osoby[1] = new Student("Mazur", "Matematyka");
        osoby[2] = new Student("Nowicka", "Biologia");

        osoby[3] = new Pracownik("Lewandowski", 4000);
        osoby[4] = new Pracownik("Szymański", 4500);
        osoby[5] = new Pracownik("Kamińska", 4200);

        osoby[6] = new Menadzer("Szef1", 10000, 3000);
        osoby[7] = new Menadzer("Szef2", 11000, 2000);
        osoby[8] = new Menadzer("Szef3", 12000, 4000);

        for (Osoba o : osoby) {
            System.out.println(o.getClass().getSimpleName() + " → " + o.getOpis());
            if (o instanceof Menadzer) {
                Menadzer m = (Menadzer) o;
                System.out.println("Bonus: " + m.getBonus());
            }
        }
    }
}
