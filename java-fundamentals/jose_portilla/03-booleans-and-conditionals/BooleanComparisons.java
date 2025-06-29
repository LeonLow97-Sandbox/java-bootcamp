
public class BooleanComparisons {
    
    public static void main(String[] args) {
        
        int chemistryGrade = 95;
        int biologyGrade = 75;

        System.out.println(biologyGrade > chemistryGrade); // false

        double sales = 37.55;
        double costs = 5.55;

        System.out.println(sales > costs); // true
        System.out.println(sales < costs); // false

        String sentence = "I love this course!";
        String sentence2 = "I love this course!";

        System.out.println(sentence.equals(sentence2)); // true
        System.out.println(!sentence.equals(sentence2)); // false

    }

}
