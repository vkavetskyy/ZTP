public class Samochod {
    private String producent;
    private String model;
    private SamochodRok rok;

    public Samochod(Builder builder) {
        this.producent = builder.getProducent();
        this.model = builder.getModel();
        this.rok = builder.getRok();
    }

    @Override
    public String toString() {
        return "Samochod [" +
                "Producent '" + producent + '\'' +
                ", Model '" + model + '\'' +
                ", Rok '" + rok +
                "']";
    }
}
