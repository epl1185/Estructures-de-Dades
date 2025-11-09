import java.util.ArrayList;
import java.util.List;

public class Department
{
    private Engineer head;
    private List<Person> workers = new ArrayList<>();
    public Department(Engineer head) {
        this.head = head;
    }
    public Engineer getHead() {
        return head;
    }
    public void addWorker(Person worker) {
        workers.add(worker);
    }

    @Override
    public String toString() {
        return "Department{" +
                "head=" + head +
                ", workers=" + workers +
                '}';
    }
}