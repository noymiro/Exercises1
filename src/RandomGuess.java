import java.util.Scanner;

public class RandomGuess {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = 1;
        int max = 1000;
        int secretNumber;
        secretNumber = (int) ((Math.random() * (max - min + 1)) + min);
        int wrongNumberUser1 = 0;
        int wrongNumberUser2 = 0;
        System.out.println(+secretNumber);
        while (true) {
            System.out.println("User 1 please enter number");
            int user1Number = scanner.nextInt();
            if (user1Number < secretNumber) {
                System.out.println("Your number is smaller than secret number");
                wrongNumberUser1 = wrongNumberUser1 + 1;
            }
            if (user1Number > secretNumber) {
                System.out.println("Your number is bigger than secret number");
                wrongNumberUser1 = wrongNumberUser1 + 1;
            }
            if (user1Number == secretNumber) {
                System.out.println("congratulation User 1 You have guest the secret number after " + wrongNumberUser1 + " times");
            }

            System.out.println("User 2 please enter number");
            int user2Number = scanner.nextInt();
            if (user2Number < secretNumber) {
                System.out.println("Your number is smaller than secret number");
                wrongNumberUser2 = wrongNumberUser2 + 1;
            }
            if (user2Number > secretNumber) {
                System.out.println("Your number is bigger than secret number");
                wrongNumberUser2 = wrongNumberUser2 + 1;
            }
            if (user2Number == secretNumber) {
                System.out.println("congratulation User 2 You have guest the secret number after " + wrongNumberUser2 + " times");
            }
        }
    }
}
