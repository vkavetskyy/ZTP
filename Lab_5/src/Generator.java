import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Generator {
    private final Random random = new Random();

    private final String[] kursy = new String[] {
            "ASMW", "ZTP", "PO", "PIO", "PP",
            "Analiza Matematyczna", "Algebra", "HD", "BD",
            "PBD", "AISD", "SI", "ISS", "RSI"
    };

    private final String[] wydzialy = new String[] {
            "Wydział Architektury", "Wydział Budownictwa Lądowego i Wodnego", "Wydział Chemiczny", "Wydział Elektroniki", "Wydział Elektryczny",
            "Wydział Geoinżynierii, Górnictwa i Geologii", "Wydział Inżynierii Środowiska", "Wydział Informatyki i Zarządzania", "Wydział Mechaniczno-Energetyczny", "Wydział Mechaniczny"
    };

    private final String[] imiona = new String[] {
            "Adam", "Dawid", "Frydrych", "Włodzisław", "Amadej",
            "Ludwika", "Jadwiga", "Julitta", "Oliwia", "Blanka"
    };

    private final String[] nazwiska = new String[] {
            "Kowalski", "Ostrowski", "Wojciechowski", "Czerwinski", "Kaczmarek",
            "Szczepańska", "Zielinska", "Gorska", "Woźniak", "Duda"
    };

    public Generator() {
    }


    public List<Wydzial> generujWydzialy(int iloscWydzialow, int iloscStudentow) {
        List<Wydzial> listaWydzialow = new ArrayList<>();
        for(int i = 0; i < iloscWydzialow; i++) {
            listaWydzialow.add(new Wydzial(wydzialy[i], generujStudentow(iloscStudentow)));
        }
        return listaWydzialow;
    }

    private List<Student> generujStudentow(int iloscStudentow) {
        List<Student> listaStudentow = new ArrayList<>();
        for (int i = 0; i < iloscStudentow; i++) {
            listaStudentow.add(new Student(imiona[random.nextInt(imiona.length - 1)], nazwiska[random.nextInt(imiona.length - 1)], randomPlec(), 18 + random.nextInt(30), 100000 + random.nextInt(900000), generujKursy(random.nextInt(10))));
        }
        return listaStudentow;
    }

    private List<Kurs> generujKursy(int iloscKursow) {
        List<Kurs> listaKursow = new ArrayList<>();
        for(int i = 0; i < iloscKursow; i++) {
            listaKursow.add(new Kurs(kursy[i]));
        }
        return listaKursow;
    }

    private Student.Plec randomPlec() {
        int i = random.nextInt(2);
        if (i == 0)
            return Student.Plec.M;
        else
            return Student.Plec.K;
    }
}
