import java.util.ArrayList;
import java.util.List;

public class CopyTwo {
    public List<Uczelnia> copy(List<Uczelnia> listaUczelni) {
        List<Uczelnia> copyListaUczelni = new ArrayList<>();
        for(Uczelnia uczelnia : listaUczelni) {
            Uczelnia copyUczelnia = new Uczelnia();
            copyUczelnia.setNazwaUczelni(uczelnia.getNazwaUczelni());
            List<Wydzial> copyListaWydzialow = new ArrayList<>();
            for(Wydzial wydzial : uczelnia.getListaWydzialow()) {
                Wydzial copyWydzial = new Wydzial();
                copyWydzial.setNazwaWydzialu(wydzial.getNazwaWydzialu());
                List<Student> copyListaStudentow = new ArrayList<>();
                for(Student student : wydzial.getListaStudentow()) {
                    Student copyStudent = new Student();
                    copyStudent.setImie(student.getImie());
                    copyStudent.setNazwisko(student.getNazwisko());
                    copyStudent.setNumerAlbumu(student.getNumerAlbumu());
                    copyListaStudentow.add(copyStudent);
                }
                copyWydzial.setListaStudentow(copyListaStudentow);
                copyListaWydzialow.add(copyWydzial);
            }
            copyUczelnia.setListaWydzialow(copyListaWydzialow);
            copyListaUczelni.add(copyUczelnia);
        }
        return copyListaUczelni;
    }
}
