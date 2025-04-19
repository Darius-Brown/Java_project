```java
import java.util.Scanner;
import java.util.Random;

public class GuessGame {
    public static void main(String[] args) {
        // Scanner to get user input
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        // Pick number between 1 and 10
        int number = rand.nextInt(10) + 1;
        int guess = 0;

        // Ask user to guess
        System.out.println("Guess a number between 1 and 10:");

        // Loop until correct
        while (guess != number) {
            guess = sc.nextInt();
            if (guess < number) {
                System.out.println("Too low");
            } else if (guess > number) {
                System.out.println("Too high");
            } else {
                System.out.println("Correct!");
            }
        }
    }
}
```
