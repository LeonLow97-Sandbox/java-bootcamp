public class Main {
    public static void main(String[] args) {
        Person person = new Person("Ryan", "Canadian"); // Immutable
        // person class does not have any setters
        
        Person person2 = person; // there are no setters, so cannot change anything
        person2 = new Person("John", "American");
    }
}
