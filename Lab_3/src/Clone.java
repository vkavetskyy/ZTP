import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.SerializationUtils;

public class Clone {
    public List<Uczelnia> clone(List<Uczelnia> listaUczelni) {
        List<Uczelnia> cloneListaUczelni = new ArrayList<>();
        for(Uczelnia uczelnia : listaUczelni) {
            cloneListaUczelni.add(SerializationUtils.clone(uczelnia));
        }
        return cloneListaUczelni;
    }
}
