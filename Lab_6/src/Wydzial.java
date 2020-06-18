import java.util.List;

public class Wydzial {
    private final String nazwaWydzialu;
    private final List<Student> listaStudentow;

    public Wydzial(String nazwaWydzialu, List<Student> listaStudentow) {
        this.nazwaWydzialu = nazwaWydzialu;
        this.listaStudentow = listaStudentow;
    }

    public List<Student> getListaStudentow() {
        return listaStudentow;
    }

    @Override
    public String toString() {
        return nazwaWydzialu;
    }
}