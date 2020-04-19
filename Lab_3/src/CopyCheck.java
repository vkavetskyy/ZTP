import java.util.List;

public class CopyCheck {
    public void run(List<Uczelnia> listaUczelni, List<Uczelnia> copyListaUczelni) {
        if (listaUczelni.size() == copyListaUczelni.size()) {
            for(int i = 0; i < listaUczelni.size(); i++) {
                checkUczelnia(listaUczelni.get(i), copyListaUczelni.get(i));
            }
            System.out.println("---------------\nCopy check: OK\n---------------");
        }
        else
            System.out.println("FIRST CHECK FAIL");
    }

    private void checkUczelnia(Uczelnia sourceUczelnia, Uczelnia copyUczelnia) {
        if (sourceUczelnia.getNazwaUczelni().equals(copyUczelnia.getNazwaUczelni())
                && sourceUczelnia.getListaWydzialow().size() == copyUczelnia.getListaWydzialow().size()) {
            for (int i = 0; i < sourceUczelnia.getListaWydzialow().size(); i++) {
                checkWydzial(sourceUczelnia.getListaWydzialow().get(i), copyUczelnia.getListaWydzialow().get(i));
            }
        }
        else
            System.out.println("Uczelnia check FAIL");
    }

    private void checkWydzial(Wydzial sourceWydzial, Wydzial copyWydzial) {
        if (sourceWydzial.getNazwaWydzialu().equals(copyWydzial.getNazwaWydzialu())
                && sourceWydzial.getListaStudentow().size() == copyWydzial.getListaStudentow().size()) {
            for (int i = 0; i < sourceWydzial.getListaStudentow().size(); i++) {
                checkStudent(sourceWydzial.getListaStudentow().get(i), copyWydzial.getListaStudentow().get(i));
            }
        }
        else
            System.out.println("Wydział check FAIL");
    }

    private void checkStudent(Student sourceStudent, Student copyStudent) {
        if (sourceStudent.getImie().equals(copyStudent.getImie())
                && sourceStudent.getNazwisko().equals(copyStudent.getNazwisko())
                && sourceStudent.getNumerAlbumu() == copyStudent.getNumerAlbumu()) {
        }
        else
            System.out.println("Student check FAIL");
    }
}
