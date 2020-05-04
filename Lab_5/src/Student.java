import java.util.List;

public class Student {
    private final String imie;
    private final String nazwisko;
    private final Plec plec;
    private final int wiek;
    private final int numerAlbumu;
    private final List<Kurs> kursy;

    public Student(String imie, String nazwisko, Plec plec, int wiek, int numerAlbumu, List<Kurs> kursy) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.plec = plec;
        this.wiek = wiek;
        this.numerAlbumu = numerAlbumu;
        this.kursy = kursy;
    }

    public int getNumerAlbumu() {
        return numerAlbumu;
    }

    public List<Kurs> getKursy() {
        return kursy;
    }

    public Plec getPlec() {
        return plec;
    }

    public int getWiek() {
        return wiek;
    }

    public enum Plec {
        M, K
    }

    @Override
    public String toString() {
        return "[" + imie + " " + nazwisko  +
                ", " + plec +
                ", " + wiek +
                ", " + numerAlbumu +
                ", Kursy = " + kursy;
    }
}