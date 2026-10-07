package Office2026;


import java.util.ArrayList;
import java.util.List;

public class DirectorEmployeeSearcher implements EmployeeSearcher {

    private final List<NameEmployee> subordinates = new ArrayList<>();

    public void addSubordinate(NameEmployee employee) {
        subordinates.add(employee);
    }

    @Override
    public void searchByName(NameEmployee director, String name) {
        for (NameEmployee subordinate : subordinates) {
            if (name.equals(subordinate.getName())) {
                System.out.println("Сотрудник \"" + name +
                        "\" находится в подчинении директора " +
                        director.getName() + ".");

                return;
            }
        }
        System.out.println("Сотрудник \"" + name +
                "\" не находится в подчинении директора " +
                director.getName() + ".");
    }
}


