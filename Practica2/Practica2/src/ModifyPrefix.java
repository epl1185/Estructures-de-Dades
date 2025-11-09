import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class ModifyPrefix {
    public static <E> void modifyPrefix(LinkedList<? extends E> src, LinkedList<? super E> tfg) {
        ListIterator<? extends E> iter1 = src.listIterator();
        ListIterator<? super E> iter2 = tfg.listIterator();
        while (iter1.hasNext() && iter2.hasNext()) {
            iter2.next();
            iter2.set(iter1.next());
        }
        if (iter1.hasNext()) {
            while (iter1.hasNext()) {
                iter2.add(iter1.next());
            }
        }
    }
}
