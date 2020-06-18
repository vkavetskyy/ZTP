import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentUtils implements IStudentUtils {

    //Filtrowanie
    public List<Student> getNumerIndeksuWiekszyOd(List<Wydzial> wydzialy, int numberAlbumu) {
        Stream<Student> studenci = studentStream(wydzialy);
        return studenci.filter(student -> student.getNumerAlbumu() > numberAlbumu)
                .sorted(Comparator.comparingInt(Student::getNumerAlbumu))
                .collect(Collectors.toList());
    }

    //Map
    public Map<Student, Wydzial> studenciWydzialy(List<Wydzial> wydzialy) {
        Map<Student, Wydzial> map = new HashMap<>();
        for(var wydzial: wydzialy) {
            for(Student student: wydzial.getListaStudentow()) {
                map.put(student, wydzial);
            }
        }
        return map;

    }

    //Min
    public Wydzial studMinKursy(List<Wydzial> wydzialy) {
        return wydzialy.stream()
                .min(Comparator.comparingInt(this::iloscKursow))
                .orElse(null);
    }

    //Max
    public Wydzial studMaxKursy(List<Wydzial> wydzialy) {
        return wydzialy.stream()
                .max(Comparator.comparingInt(this::iloscKursow))
                .orElse(null);
    }

    //GroupingBy
    public void sredniaWieku(List<Wydzial> wydzialy) {
        Map<Student.Plec, List<Student>> studentPlecMap = studentStream(wydzialy).collect(Collectors.groupingBy(Student::getPlec));
        int sumaM = 0;
        int sumaK = 0;
        for(Student student: studentPlecMap.get(Student.Plec.M)) {
            sumaM += student.getWiek();
        }
        for(Student student: studentPlecMap.get(Student.Plec.K)) {
            sumaK += student.getWiek();
        }
        System.out.println("Średnia wieku M: " + sumaM / studentPlecMap.get(Student.Plec.M).size());
        System.out.println("Średnia wieku K: " + sumaK / studentPlecMap.get(Student.Plec.K).size());
    }

    private int iloscKursow(Wydzial wydzial) {
        return wydzial.getListaStudentow().stream()
                .map(Student::getKursy)
                .mapToInt(List::size)
                .sum();
    }

    private Stream<Student> studentStream(List<Wydzial> wydzialy) {
        return wydzialy.stream()
                .map(Wydzial::getListaStudentow)
                .flatMap(List::stream);
    }
}
