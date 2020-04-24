import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Samochod> listaSamochodow = new ArrayList<>();

        Samochod samochod1 = new Builder()
                .producent("BMW")
                .model("i8")
                .rok(2020)
                .build();

        Samochod samochod2 = new Builder()
                .producent("Tesla")
                .model("Model S")
                .rok(2018)
                .build();

        Samochod samochod3 = new Builder()
                .producent("Opel")
                .model("Astra")
                .rok(2010)
                .build();

        listaSamochodow.add(samochod1);
        listaSamochodow.add(samochod2);
        listaSamochodow.add(samochod3);

        for(Samochod samochod: listaSamochodow)
            System.out.println(samochod.toString());
    }
}
