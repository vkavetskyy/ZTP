public class Samochod extends Osobowy {
    public String producent;
    public String model;
    public String rok;

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
        return ">Samochód" + "\nTyp: " + typ + "\nNapęd: " + naped + "\nIlość miejsc:" + iloscMiejsc + "\nWaga: " + waga + "\nProducent: " + producent +"\nModel: " + model + "\nRok:" + rok +"\n";
    }
}
