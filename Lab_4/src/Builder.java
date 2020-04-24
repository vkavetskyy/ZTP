public class Builder {
    private String producent;
    private String model;
    private SamochodRok rok;

    public Builder producent(String producent) {
        this.producent = producent;
        return this;
    }

    public Builder model(String model) {
        this.model = model;
        return this;
    }

    public Builder rok(int rok) {
        this.rok = SamochodRokFactory.INSTANCE.getRok(rok);
        return this;
    }

    public Samochod build() {
        return new Samochod(this);
    }

    public String getProducent() {
        return producent;
    }

    public String getModel() {
        return model;
    }

    public SamochodRok getRok() {
        return rok;
    }
}
