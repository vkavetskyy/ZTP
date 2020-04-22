import java.util.ArrayList;
import java.util.List;

public class CopyOne {
    public List<Uczelnia> copy(List<Uczelnia> listaUczelni) {
        List<Uczelnia> copyListaUczelni = new ArrayList<>();
        for(Uczelnia uczelnia : listaUczelni) {
            copyListaUczelni.add(new Uczelnia(uczelnia.getNazwaUczelni(), uczelnia.getListaWydzialow()));
        }
        return copyListaUczelni;
    }
}
