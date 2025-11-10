/**
 * Intercala elementos de list2 en las posiciones impares de list1
 * Ejemplo:
 * list1 = [A, B, C, D], list2 = [1, 2, 3]
 * Resultado: [A, 1, B, 2, C, 3, D]
 * Si list2 tiene más elementos, los ignora
 */
public static void intercalarListas(List<String> list1, List<Integer> list2) {
    ListIterator <String> iter1 = list1.listIterator();
    Iterator <Integer> iter2 = list2.iterator();
    int i = 0;
    while(iter1.hasNext())
    {
        iter1.next();
        i++;
        if(i % 2 != 0 && iter2.hasNext())
        {
            iter1.add(String.valueOf(iter2.next()));
        }
    }
}

public void main() {
    List <String> lista1 = new ArrayList<>();
    List <Integer> lista2 = new ArrayList<>();
    lista1.add("A");
    lista1.add("B");
    lista1.add("C");
    lista2.add(1);
    lista2.add(2);
    lista2.add(3);
    lista2.add(4);
    System.out.println("Antes: " + lista1);
    intercalarListas(lista1, lista2);
    System.out.println("Después: " + lista1);

    // Forma correcta de imprimir
    for (String string : lista1) {
        System.out.println(string); // ✅ get(i) no indexOf(i)
    }
}