public class PozycjaController {
    private PozycjaModel model;
    private PozycjaView view;

    public PozycjaController(PozycjaModel model, PozycjaView view) {
        this.model = model;
        this.view = view;
    }

    public void setPozycjaNazwa(String pozycjaNazwa) {
        model.setNazwaPozycji(pozycjaNazwa);
    }

    public void setPozycjaIlosc(int pozycjaIlosc) {
        model.setIloscPozycji(pozycjaIlosc);
    }

    public void setPozycjaCena(float  pozycjaCena) {
        model.setCenaPozycji(pozycjaCena);
    }

    public String getPozycjaNazwa() {
        return model.getNazwaPozycji();
    }

    public int getPozycjaIlosc() {
        return model.getIloscPozycji();
    }

    public float getPozycjaCena() {
        return model.getCenaPozycji();
    }

    public void updateView() {
        view.printPozycja(model.getNazwaPozycji(), model.getIloscPozycji(), model.getCenaPozycji());
    }
}
