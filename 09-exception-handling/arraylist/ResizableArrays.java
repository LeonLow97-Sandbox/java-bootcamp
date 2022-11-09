import java.util.ArrayList;

public class ResizableArrays {
    public static void main(String[] args) {
        
        // ArrayList is Resizable
        // can add/remove elements
        // can only store objects. It cannot store primitives.
        ArrayList<String> names = new ArrayList<String>();
        
        // add method
        names.add("Leon");
        names.add("Darrel");
        names.add("Joshua");

        for (int i = 0; i < names.size(); i++) {
            // use a getter to get the element
            System.out.println(names.get(i));        
        }

        names.set(0, "Leonard");
        names.add(3, "Katie");
        names.remove(2);
        // names.clear(); // clears every element

    }
}
