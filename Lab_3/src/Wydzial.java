import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Wydzial implements Serializable {
    private String nazwaWydzialu;
    private List<Student> listaStudentow;

    public Wydzial() {
        this.listaStudentow = new ArrayList<>();
    }

    public Wydzial(String nazwaWydzialu, List<Student> listaStudentow) {
        this.nazwaWydzialu = nazwaWydzialu;
        this.listaStudentow = listaStudentow;
    }

    public String getNazwaWydzialu() {
        return nazwaWydzialu;
    }

    public void setNazwaWydzialu(String nazwaWydzialu) {
        this.nazwaWydzialu = nazwaWydzialu;
    }

    public List<Student> getListaStudentow() {
        return listaStudentow;
    }

    public void setListaStudentow(List<Student> listaStudentow) {
        this.listaStudentow = listaStudentow;
    }

    public int getIloscStudentow() {
        return listaStudentow.size();
    }
}
