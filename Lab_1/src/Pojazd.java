public class Pojazd {
    public final String typ;
    public final String naped;

    public Pojazd(String typ, String naped) {
        this.typ = typ;
        this.naped = naped;
    }

    public void print(Pojazd pojazd) {
        System.out.println(pojazd.toString());
    }

    @Override
    public String toString() {
        return "\nTyp: " + typ + "\nNapęd: " + naped;
    }
}
