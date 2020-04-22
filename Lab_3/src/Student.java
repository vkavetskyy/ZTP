import java.io.Serializable;

public class Student implements Serializable {
    private String imie;
    private String nazwisko;
    private int numerAlbumu;

    public Student() {
    }

    public Student(String imie, String nazwisko, int numerAlbumu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numerAlbumu = numerAlbumu;
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getNumerAlbumu() {
        return numerAlbumu;
    }

    public void setNumerAlbumu(int numerAlbumu) {
        this.numerAlbumu = numerAlbumu;
    }
}
