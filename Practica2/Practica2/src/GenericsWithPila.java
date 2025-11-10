import java.util.*;
public class GenericsWithPila {
    /**
     * Copia elementos de source a target
     */
    public static void copiarPila(Stack<? extends Number> source,
                                  Stack<? super Number> target) {
        // Crear una pila temporal para no vaciar la original
        Stack<Number> temp = new Stack<>();

        // Primero volcamos todo a temporal
        while (!source.isEmpty()) {
            temp.push(source.pop());
        }

        // Luego copiamos de temporal a target (en orden correcto)
        while (!temp.isEmpty()) {
            Number element = temp.pop();
            target.push(element);
            // Si quieres mantener source intacta, también la reconstruyes:
            // source.push(element);
        }
    }

    public static void main() {
        Stack<Integer> s1 = new Stack<>();
        s1.push(0);
        s1.push(1);
        s1.push(2);
        s1.push(3);

        Stack<Number> s2 = new Stack<>();

        System.out.println("Antes de copiar:");
        System.out.println("s1: " + s1);
        System.out.println("s2: " + s2);

        copiarPila(s1, s2);

        System.out.println("\nDespués de copiar:");
        System.out.println("s1: " + s1); // ❌ Ahora está vacía - problema!
        System.out.println("s2: " + s2);

        System.out.println("\nImprimiendo s2:");
        // Forma CORRECTA de imprimir una pila
        while (!s2.isEmpty()) {
            System.out.println(s2.pop());
        }
    }
}