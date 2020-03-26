public class Samochod extends Osobowy {
    public final String producent;
    public final String model;
    public final String rok;

    public Samochod(String typ, String naped, String iloscMiejsc, String waga, String producent, String model, String rok) {
        super(typ, naped, iloscMiejsc, waga);
        this.producent = producent;
        this.model = model;
        this.rok = rok;
    }

    public void print(Samochod samochod) {
        System.out.println(samochod.toString());
    }


    @Override
    public String toString() {
        return super.toString() + "\nProducent: " + producent +"\nModel: " + model + "\nRok:" + rok;
    }
}
