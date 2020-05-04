import java.util.List;
import java.util.Map;

public class Main {

    public static void main(String[] args) {
        Generator generator = new Generator();
        StudentUtils studentUtils = new StudentUtils();
        List<Wydzial> list = generator.generujWydzialy(10, 10);

        //Filtrowanie
        System.out.println("Studenci z numerem albumu większym od 200000");
        List<Student> studentsList = studentUtils.getNumerIndeksuWiekszyOd(list, 200000);
        System.out.println(studentsList);

        //Map
        System.out.println("\nStudenci i nazwa wydziału");
        Map<Student, Wydzial> studentWydzialMap = studentUtils.studenciWydzialy(list);
        studentWydzialMap.forEach((key, value) -> System.out.println(key + " " + value));

        //Min
        System.out.println("\nWydział z najmniejszą ilością kursów");
        System.out.println(studentUtils.studMinKursy(list));

        //Max
        System.out.println("\nWydział z największą ilością kursów");
        System.out.println(studentUtils.studMaxKursy(list));

        //GroupBy
        System.out.println("\nŚrednia wieku studentów wg. płci");
        studentUtils.sredniaWieku(list);

    }
}
