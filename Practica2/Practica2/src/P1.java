import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

public class P1 {
    public static void main(String [] args) {
        Engineer Sergio = new Engineer("Sergio", 40, "Coordinador del grau");
        Engineer Santi = new Engineer("Santi", 50, "Xarxes");
        Engineer Alex = new Engineer("Alex", 39, "Xarxes");
        Person Pitbull = new Person("Pitbull", 19);

        Department Informatica = new Department(Sergio);
        Department Software = new Department(Santi);
        Department Xarxes = new Department(Alex);

        List<Department> departmentList = new ArrayList<>();
        departmentList.add(Informatica);
        departmentList.add(Software);
        departmentList.add(Xarxes);

        List<Person> personList = new ArrayList<>();
        personList.add(Pitbull);
        personList.add(Alex);
        personList.add(Santi);
        personList.add(Sergio);

        foundEngineers(departmentList, personList);
        System.out.println(departmentList);

    }
    private static void foundEngineers(List<? extends Department> departmentList, List<? super Engineer> engineerList)
    {
        Iterator <? extends Department> iterator = departmentList.iterator();
        while (iterator.hasNext()) {
            Department department = iterator.next();
            Engineer auxEngineer = department.getHead();
            engineerList.add(auxEngineer);
        }
    }
}
