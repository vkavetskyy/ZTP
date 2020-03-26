import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        PozycjaModel pozycjaModel = new PozycjaModel();
        PozycjaView pozycjaView = new PozycjaView();
        PozycjaController pozycjaController = new PozycjaController(pozycjaModel, pozycjaView);

        FakturaModel fakturaModel = new FakturaModel();
        FakturaView fakturaView = new FakturaView();
        FakturaController fakturaController = new FakturaController(fakturaModel, fakturaView);

        pozycjaController.setPozycjaNazwa("iPhone 11");
        pozycjaController.setPozycjaIlosc(1);
        pozycjaController.setPozycjaCena(3599.99f);

        fakturaController.setFakturaDataWystawienia("16.03.2020");
        fakturaController.setFakturaNumer("F12345678/2020");
        fakturaController.addFakturaPozycje(pozycjaModel);

        fakturaController.updateView();

        PozycjaModel pozycjaModel2 = new PozycjaModel();
        PozycjaView pozycjaView2 = new PozycjaView();
        PozycjaController pozycjaController2 = new PozycjaController(pozycjaModel2, pozycjaView2);

        pozycjaController2.setPozycjaNazwa("Apple Watch 4");
        pozycjaController2.setPozycjaIlosc(4);
        pozycjaController2.setPozycjaCena(1400.00f);

        fakturaController.addFakturaPozycje(pozycjaModel2);

        System.out.println();
        fakturaController.updateView();

        System.out.println();
        pozycjaController2.setPozycjaIlosc(2);
        pozycjaController2.setPozycjaCena(1200.00f);
        fakturaController.updateView();

        System.out.println();
        //fakturaController.removePozycja(pozycjaModel);
        fakturaController.removePozycjaById(0);
        fakturaController.updateView();
    }
}
