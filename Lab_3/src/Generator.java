import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Generator {
    private final Random random = new Random();

    //14 Politechnik
    private final String[] uczelnie = new String[] {
            "Politechnika Warszawska", "Politechnika Śląska", "Politechnika Gdańska", "Politechnika Łódzka", " Politechnika Wrocławska",
            "Politechnika Krakowska im. Tadeusza Kościuszki", "Politechnika Poznańska", " Politechnika Częstochowska", "Politechnika Rzeszowska im. Ignacego Łukasiewicza",
            "Politechnika Białostocka", "Politechnika Świętokrzyska", "Politechnika Lubelska", "Politechnika Opolska", "Politechnika Koszalińska"
    };

    //10 Wydziałów
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

    public List<Uczelnia> generuj(int iloscUczelni, int iloscWydzialow, int iloscStudentow) {
        List<Uczelnia> listaUczelni = new ArrayList<>();
        for(int i = 0; i < iloscUczelni; i++) {
            listaUczelni.add(new Uczelnia(uczelnie[i], generujWydzialy(iloscWydzialow, iloscStudentow)));
        }
        return listaUczelni;
    }

    private List<Wydzial> generujWydzialy(int iloscWydzialow, int iloscStudentow) {
        List<Wydzial> listaWydzialow = new ArrayList<>();
        for(int i = 0; i < iloscWydzialow; i++) {
            listaWydzialow.add(new Wydzial(wydzialy[i], generujStudentow(iloscStudentow)));
        }
        return listaWydzialow;
    }

    private List<Student> generujStudentow(int iloscStudentow) {
        List<Student> listaStudentow = new ArrayList<>();
        for (int i = 0; i < iloscStudentow; i++) {
            listaStudentow.add(new Student(imiona[imiona.length - 1], nazwiska[imiona.length - 1], 100000 + random.nextInt(900000)));
        }
        return listaStudentow;
    }

}
