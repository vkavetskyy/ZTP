public class Osobowy extends Pojazd {
    public String iloscMiejsc;
    public String waga;


    public Osobowy(String typ, String naped, String iloscMiejsc, String waga) {
        super(typ, naped);
        this.iloscMiejsc = iloscMiejsc;
        this.waga = waga;
    }

    public void print(Osobowy osobowy) {
        System.out.println(osobowy.toString());
    }

    @Override
    public String toString() {
        return ">Osobowy" + "\nTyp: " + typ + "\nNapęd: " + naped + "\nIlość miejsc: " + iloscMiejsc + "\nWaga: " + waga + "\n";
    }
}
