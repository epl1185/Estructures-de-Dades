public class NodeLlista <E>
{
    E element;
    NodeLlista<E> next;
    public NodeLlista (E x)
    {
        element = x;
        this.next = null;
    }

    public void setElement(E element) {
        this.element = element;
    }
}
