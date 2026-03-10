import java.util.Random;
public class Randomnumber {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(100) + 1; // Generates a random number between 1 and 100
        System.out.println("Generated random number: " + randomNumber);
        if(randomNumber % 2 == 0) {
            System.out.println(randomNumber + " is an even number as it is divisible by 2.");
        } else {
            System.out.println(randomNumber + " is an odd number as it is not divisible by 2.");
        }
    }
}
