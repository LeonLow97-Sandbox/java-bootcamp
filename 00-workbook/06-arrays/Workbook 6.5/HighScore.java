public class HighScore {
    public static void main(String[] args) {
        
        int highScore = 0;
        
        // Create an array that stores 10 random numbers:
        int[] randomNumbers = {randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber(), randomNumber()};

        // Use a for loop to print every element on the same line. Leave one space between each element.
        System.out.print("Here are the scores: ");
        for (int i = 0; i < randomNumbers.length; i++) {
            System.out.print(randomNumbers[i] + " ");
        }

        // Use a for loop to update the variable (highScore) with the highest score in the array and print it.
        // Hint: your for loop needs a condition that updates the variable whenever an element is higher.
        for (int i = 0; i < randomNumbers.length; i++) {
            if (randomNumbers[i] > highScore) {
                highScore = randomNumbers[i];
            }
        }

        System.out.println("\n\nThe highest score is: " + highScore + ". Give that man a cookie!");

        
    }

    /**
     *  Function name - randomNumber
     *  @return (int)
     *
     *  Inside the function
     *    - returns a random number between 0 to 49999
     *
     */
    public static int randomNumber() {
        double randomNumber = 50000 * Math.random();
        int randomInt = (int)randomNumber;
        return randomInt;
    }

}
