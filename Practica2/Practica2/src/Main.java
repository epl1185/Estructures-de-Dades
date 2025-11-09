import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Main {
    public static <E extends Comparable<? super E>> List<E> greaterThan(Iterator<E> it, E sample) {
        List<E> miLista = new ArrayList<>();
        while (it.hasNext()) {
            E current = it.next();
            if (current.compareTo(sample) > 0) {
                miLista.add(current);
            }
        }
        return miLista;
    }
}
