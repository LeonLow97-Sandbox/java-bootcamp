public class Wrapper {
    public static void main(String[] args) {
        // int wholeNumber = 5;
        // long largeWholeNumber = 5000000000L;
        // double decimal = 5.493;
        // char letter = 'b';

        Integer wholeNumber = 5;
        Integer numberTwo = wholeNumber;
        numberTwo = 10;
        System.out.println(wholeNumber);
        System.out.println(numberTwo);

        Long largeWholeNumber = 5000000000L;
        Double decimal = 5.493;
        Character letter = 'b';

        // can equate to null because they are objects
        wholeNumber = null;
    }
}
