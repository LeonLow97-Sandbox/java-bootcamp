
public class Scope {

    static int dogs = 5;
    
    public static void main(String[] args) {
        
        someFunction();
        System.out.println(dogs);

    }

    public static void someFunction() {
        // int apples = 5;
        System.out.println(dogs);
    }

}
