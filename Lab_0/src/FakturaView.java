import java.util.Iterator;
import java.util.Vector;

public class FakturaView {
    public void printFaktura(String numerFaktury, String dataWystawieniaFaktury, Vector<PozycjaModel> pozycjeFaktury) {
        System.out.print("Numer faktury: " + numerFaktury + "\t");
        System.out.print("Data wystawienia: " + dataWystawieniaFaktury + "\n");
        System.out.println("Pozycje faktury: ");
        Iterator<PozycjaModel> iterator = pozycjeFaktury.iterator();
        while(iterator.hasNext()) {
            PozycjaModel temp = iterator.next();
            System.out.println("N: " + temp.getNazwaPozycji() + " | I: " + temp.getIloscPozycji() + " | C: " + temp.getCenaPozycji() + " PLN");
        }
    }
}
