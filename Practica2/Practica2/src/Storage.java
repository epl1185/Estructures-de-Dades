import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//Constructor
public class Storage <T>
{

    private ArrayList<T> items = new ArrayList<>();
    public void addItem(T item) {
        items.add(item);
    }
    public List<T> getItems()
    {
        return items;
    }
    public void copyTo (Storage <? super T> otherStorage)
    {
        for (T item : items) {
            otherStorage.addItem(item);
        }
    }

    @Override
    public String toString() {
        return "Storage{" +
                "items=" + items +
                '}';
    }
}
