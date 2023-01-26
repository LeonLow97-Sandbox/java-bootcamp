import models.Employee;
import models.Store;

public class Main {
    public static void main(String[] args) {
        Employee scrumMaster = new Employee("Leon", "Scrum Master");
        Employee softwareEngineer = new Employee("Nicholas", "Software Engineer");
        Employee softwareDeveloper = new Employee("Darrel", "JAVA Developer");

        Store store = new Store();
        store.setEmployees(0, scrumMaster);
        store.setEmployees(1, softwareEngineer);
        store.setEmployees(2, softwareDeveloper);

        System.out.println(store);
        store.open();
        
    }
}
