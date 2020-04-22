import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Uczelnia implements Serializable {
    private String nazwaUczelni;
    private List<Wydzial> listaWydzialow;

    public Uczelnia() {
        this.listaWydzialow = new ArrayList<>();
    }

    public Uczelnia(String nazwaUczelni, List<Wydzial> listaWydzialow) {
        this.nazwaUczelni = nazwaUczelni;
        this.listaWydzialow = listaWydzialow;
    }

    public String getNazwaUczelni() {
        return nazwaUczelni;
    }

    public void setNazwaUczelni(String nazwaUczelni) {
        this.nazwaUczelni = nazwaUczelni;
    }

    public List<Wydzial> getListaWydzialow() {
        return listaWydzialow;
    }

    public void setListaWydzialow(List<Wydzial> listaWydzialow) {
        this.listaWydzialow = listaWydzialow;
    }

    public void printUczelniaPodsumowanie() {
        int temp = 0;
        for(int i = 0; i < listaWydzialow.size(); i++) {
            temp += listaWydzialow.get(i).getIloscStudentow();
        }
        System.out.println(nazwaUczelni + "\nWydziałów: " + listaWydzialow.size() + "\nStudentów (suma): " + temp);
    }
}
