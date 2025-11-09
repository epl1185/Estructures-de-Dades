public class ListCua <E> implements CuaInterface <E> {
    private NodeLlista<E> cap;

    private NodeLlista<E> cua;

    @Override
    public boolean isEmpty() {
        return cap == null;
    }

    @Override
    public void inserir(E x) {
        NodeLlista<E> nouNode = new NodeLlista<>(x);
        if (isEmpty()) {
            cap = nouNode;
            cua = nouNode;
        } else {
            cua.next = nouNode;
            cua = nouNode;
        }
    }

    @Override
    public E treure()
    {
        if (isEmpty()) {
            return null;
        }
        E element = cap.element;
        cap = cap.next;
        if (cap == null) {
            cua = null;
        }
        return element;
    }
}
