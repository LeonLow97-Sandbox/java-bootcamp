import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // List<String> cities = new ArrayList<>();
        List<String> cities = new LinkedList<>();

        cities.add("Paris");
        cities.add("Florence");
        cities.add("Rome");
        cities.add("Venice");
        cities.add("Amsterdam");
        cities.add("Berlin");
        cities.add("Madrid");
        cities.add("Barcelona");
        cities.add("London");
        cities.add("Lisbon");
        cities.add("Prague");
        cities.add("Vienna");
        cities.add("Budapest");
        cities.add("Warsaw");
        cities.add("New Delhi");

        System.out.println(cities.size());
        System.out.println(cities.get(5));
        System.out.println(cities.get(8));
        cities.set(2, "Naples");
        System.out.println(cities.get(2));
        cities.remove(5);

        List<Integer> linkedList = new LinkedList<>();
		List<Integer> arrayList = new ArrayList<>();

        for(int i = 0; i < 11_000_000; i++) {
			linkedList.add(i);
            arrayList.add(i);
        }

        /******************FETCHING DATA******************/

        System.out.println("\nFETCHING DATA\n");

        long start = System.currentTimeMillis();
		linkedList.get(4_500_000);
        System.out.println("LinkedList: " + (System.currentTimeMillis() - start) + "ms");

        start = System.currentTimeMillis();
		arrayList.get(4_500_000);
        System.out.println("ArrayList: " + (System.currentTimeMillis() - start) + "ms");
        

        /******************FIRST / LAST INDEX******************/

        System.out.println("\nFIRST / LAST INDEX\n");

        start = System.currentTimeMillis();
		linkedList.get(0);
        linkedList.get(linkedList.size() - 1);
        System.out.println("LinkedList: " + (System.currentTimeMillis() - start) + "ms");

        start = System.currentTimeMillis();
		arrayList.get(0);
        arrayList.get(arrayList.size() - 1);
        System.out.println("ArrayList: " + (System.currentTimeMillis() - start) + "ms");


        /******************INSERTION FROM MIDDLE******************/

        System.out.println("\nINSERTION FROM MIDDLE\n");

        start = System.currentTimeMillis();
        linkedList.add(5, 121); // insert 121 at index 5
        System.out.println("LinkedList: " + (System.currentTimeMillis() - start) + "ms");

        start = System.currentTimeMillis();
        arrayList.add(5, 121);  // insert 121 at index 5
        System.out.println("ArrayList: " + (System.currentTimeMillis() - start) + "ms");


        /******************INSERTION******************/

        System.out.println("\nINSERTION\n");

        start = System.currentTimeMillis();		
        linkedList.add(121);
        System.out.println("LinkedList: " + (System.currentTimeMillis() - start) + "ms");

        start = System.currentTimeMillis();
        arrayList.add(121);
        System.out.println("ArrayList: " + (System.currentTimeMillis() - start) + "ms");

        /******************REMOVAL******************/
        
        System.out.println("\nREMOVAL\n");

        start = System.currentTimeMillis();			
        linkedList.remove(400);
        System.out.println("LinkedList: " + (System.currentTimeMillis() - start) + "ms");

        start = System.currentTimeMillis();			
        arrayList.remove(400);
        System.out.println("ArrayList: " + (System.currentTimeMillis() - start) + "ms");


        /******************UPDATES******************/

        System.out.println("\nUPDATES\n");

        start = System.currentTimeMillis();					
		linkedList.set(4_500_000, 5);
        System.out.println("LinkedList: " + (System.currentTimeMillis() - start) + "ms");

        start = System.currentTimeMillis();			
		arrayList.set(4_500_000, 5);
        System.out.println("ArrayList: " + (System.currentTimeMillis() - start) + "ms");

        City paris = new City("Paris", 2161000);
        City copy = new City(paris);
        System.out.println("Override equals: " + paris.equals(copy));

        City copy2 = paris;
        System.out.println("Copied equals: " + paris.equals(copy2));

        copy.setPopulation(2059003);
        paris.setPopulation(3129003);

        ArrayList<City> cities2 = new ArrayList<>();
        cities2.add(new City("Paris", 2161000));
        cities2.add(new City("Florence", 382258));
        cities2.add(new City("Venice", 261905));
        cities2.add(new City("Versailles", 85771));
        cities2.add(new City("London", 8982000));
        
        System.out.println("Contains: " + cities2.contains(paris));
    }
}