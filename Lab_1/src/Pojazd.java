public class Pojazd {
    public String typ;
    public String naped;

    public Pojazd(String typ, String naped) {
        this.typ = typ;
        this.naped = naped;
    }

    public void print(Pojazd pojazd) {
        System.out.println(pojazd.toString());
    }

    @Override
    public String toString() {
        return ">Pojadz" + "\nTyp: " + typ + "\nNapęd: " + naped + "\n";
    }
}
