import java.util.Arrays;

public class UpdatingArrays {

    public static void main(String[] args) {
        
        String[] menu = {"Espresso", "Iced Coffee", "Macchiato"};
        menu[2] = "Latte";
        // Convert an array to string
        String menuString = Arrays.toString(menu);
        System.out.println(menuString);

        // Creating an that can store 5 values
        String[] newMenu = new String[5];

        for (int i = 0; i < menu.length; i++) {
            // copies the values over to the new array
            newMenu[i] = menu[i];
        }

        System.out.println(Arrays.toString(newMenu));

        // Adding items to the array
        newMenu[3] = "House Blend";
        newMenu[4] = "Dark Roast";
        System.out.println(Arrays.toString(newMenu));
    }
    
}
