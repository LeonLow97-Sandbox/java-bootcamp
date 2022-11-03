
public class ReturnValues {

    public static void main(String[] args) {
        
        double area1 = areaOfRectangle(10, 20);
        double area2 = areaOfRectangle(2.6, 3.4);
        double area3 = areaOfRectangle(1.2, 15.4);

        areaOfRectangle(-5, 2.3);

        String englishExplanation  = explainArea("English");
        String frenchExplanation  = explainArea("French");
        String spanishExplanation  = explainArea("Spanish");
        String hokkienExplanation  = explainArea("Hokkien");

    }

    public static double areaOfRectangle(double length, double width) {
        if (length < 0 || width < 0) {
            System.out.println("INVALID DIMENSIONS");
            System.exit(0);  // terminate the runtime
        }
        double area = length * width;
        return area;
    }

    public static String explainArea(String language) {

        switch(language) {
            case "English": return "Area equal length * width";
            case "French": return "La surface est egale a la longueur * la largeur";
            case "Spanish": return "area es igual a largo * aancho";
            default: return "Language not available.";
        }
        
    }
    
}
