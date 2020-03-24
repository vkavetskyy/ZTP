import java.util.Vector;

public class FakturaController {
    private FakturaModel model;
    private FakturaView view;

    public FakturaController(FakturaModel model, FakturaView view) {
        this.model = model;
        this.view = view;
    }

    public void setFakturaNumer(String numerFaktury) {
        model.setNumerFaktury(numerFaktury);
    }

    public void setFakturaDataWystawienia(String dataWystawieniaFaktury) {
        model.setDataWystawieniaFaktury(dataWystawieniaFaktury);
    }

    public String getFakturaNumer() {
        return model.getNumerFaktury();
    }

    public String getFakturaDataWystawienia() {
        return model.getDataWystawieniaFaktury();
    }

    public void addFakturaPozycje(PozycjaModel pozycjaModel) {
        model.addPozycje(pozycjaModel);
    }

    public Vector<PozycjaModel> getFakturaPozycje() {
        return model.getPozycje();
    }

    public void removePozycja(PozycjaModel pozycjaModel) {
        model.removePozycja(pozycjaModel);
    }

    public void removePozycjaById(int id) {
        model.removePozycjaById(id);
    }

    public void removePozycjeAll() {
        model.removePozycjeAll();
    }

    public void updatePozycjaById(int id, PozycjaModel pozycjaModelNowa) {
        model.updatePozycjaById(id, pozycjaModelNowa);
    }

    public void updateView() {
        view.printFaktura(model.getNumerFaktury(), model.getDataWystawieniaFaktury(), model.getPozycje());
    }
}
