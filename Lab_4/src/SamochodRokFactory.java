import java.util.ArrayList;
import java.util.List;

public class SamochodRokFactory {
    public static SamochodRokFactory INSTANCE = new SamochodRokFactory();
    private List<SamochodRok> listaSamochodRok;

    private SamochodRokFactory() {
        this.listaSamochodRok = new ArrayList<>();
    }

    public SamochodRok getRok(int rokSamochodu) {
        return listaSamochodRok.stream()
                .filter(rok -> (rok.getRok() == rokSamochodu))
                .findFirst()
                .orElseGet(() -> newRok(rokSamochodu));

    }

    private SamochodRok newRok(int rok) {
        SamochodRok newRok = new SamochodRok(rok);
        listaSamochodRok.add(newRok);
        return newRok;
    }
}
