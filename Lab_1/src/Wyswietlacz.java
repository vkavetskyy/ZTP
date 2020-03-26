import java.util.ArrayList;
import java.util.List;

public class Wyswietlacz {

    public static void main(String[] args) {

        //Pojazd -> Osobowy - > Samochod
        Pojazd pojazd1 = new Pojazd("Dwuślad", "Elektryczny");
        Pojazd pojazd2 = new Pojazd("Dwuślad", "Spalinowy");

        Osobowy osobowy1 = new Osobowy(pojazd1.typ, pojazd1.naped, "4", "1500");
        Osobowy osobowy2 = new Osobowy(pojazd2.typ, pojazd2.naped, "6", "2000");

        Samochod samochod1 = new Samochod(pojazd1.typ, pojazd1.naped, osobowy1.iloscMiejsc, osobowy1.waga, "BMW", "i3", "2020");
        Samochod samochod2 = new Samochod(pojazd2.typ, pojazd2.naped, osobowy2.iloscMiejsc, osobowy2.waga, "Volkswagen", "Sharan", "2014");



        List kontenerPojazdow = new ArrayList<>();
        kontenerPojazdow.add(pojazd1);
        kontenerPojazdow.add(pojazd2);

        List koneterOsobowych = new ArrayList<>();
        koneterOsobowych.add(osobowy1);
        koneterOsobowych.add(osobowy2);

        List kontenerSamochodow = new ArrayList<>();
        kontenerSamochodow.add(samochod1);
        kontenerSamochodow.add(samochod2);

        pokazDanePojazd(kontenerPojazdow);
        pokazDaneOsobowy(koneterOsobowych);
        pokazDaneSamochodow(kontenerSamochodow);

        System.out.println("--------------------");

        //pokazDaneSamochodow(kontenerPojazdow);
        pokazDaneOsobowy(kontenerSamochodow);

    }

    static void pokazDanePojazd(List<Pojazd> kontener) {
        for(Pojazd pojazd: kontener) {
            Pojazd temp = new Pojazd(pojazd.typ, pojazd.naped);
            System.out.println(temp.toString());
        }
    }

    static void pokazDaneOsobowy(List<Osobowy> kontener) {
        for(Osobowy osobowy: kontener) {
            Osobowy temp = new Osobowy(osobowy.typ, osobowy.naped, osobowy.iloscMiejsc, osobowy.waga);
            System.out.println(temp.toString());
        }
    }

    static void pokazDaneSamochodow(List<Samochod> kontener) {
        for(Samochod samochod: kontener) {
            Samochod temp = new Samochod(samochod.typ, samochod.naped, samochod.iloscMiejsc, samochod.waga, samochod.producent, samochod.model, samochod.rok);
            System.out.println(temp.toString());
        }
    }
}
