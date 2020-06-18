import java.util.Vector;

public class FakturaModel {
    private String numerFaktury;
    private String dataWystawieniaFaktury;
    private Vector<PozycjaModel> pozycje = new Vector<PozycjaModel>();

    public Vector<PozycjaModel> getPozycje () {
        return pozycje;
    }

    public void addPozycje(PozycjaModel pozycja) {
        this.pozycje.add(pozycja);
    }

    public void removePozycja(PozycjaModel pozycjaModel) {
        this.pozycje.remove(pozycjaModel);
    }

    public void removePozycjaById(int id) {
        this.pozycje.remove(id);
    }

    public void removePozycjeAll() {
        this.pozycje.removeAllElements();
    }

    public void updatePozycjaById(int id, PozycjaModel pozycjaModelNowa) {
        this.pozycje.set(id, pozycjaModelNowa);
    }

    public String getNumerFaktury() {
        return numerFaktury;
    }

    public void setNumerFaktury(String numerFaktury) {
        this.numerFaktury = numerFaktury;
    }

    public String getDataWystawieniaFaktury() {
        return dataWystawieniaFaktury;
    }

    public void setDataWystawieniaFaktury(String dataWystawieniaFaktury) {
        this.dataWystawieniaFaktury = dataWystawieniaFaktury;
    }


}
