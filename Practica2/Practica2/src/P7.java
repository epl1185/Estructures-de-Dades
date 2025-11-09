import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class P7 {
    public static void main(String[] args) {
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(0);
        lista.add(2);
        lista.add(3);
        lista.add(4);
        lista.add(5);
        lista.add(6);
        lista.add(7);
        Iterator<Integer> it = lista.iterator();
        List<Integer> resultado = Main.greaterThan(it, 1);
        System.out.println(resultado);
    }

}
