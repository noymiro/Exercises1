
import java.util.Scanner;

    public class Asterisks {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Please enter a number between 5-20:");
            int userInput1 = scanner.nextInt();
            while (userInput1 > 20 || userInput1 < 5) {
                System.out.println("Wrong number, please try again");
                System.out.println("Enter a new number ");
                userInput1 = scanner.nextInt();
                if (userInput1 >= 5 && userInput1 <= 20) {
                    System.out.println(userInput1);
                    printAstreisks(userInput1);
                }
            }
        }

        public static void printAstreisks(int num) {
            if (num >= 5 && num <= 20) {
                for (int i = 1; i <= num; i++) {
                    System.out.println();
                    for (int r = 1; r <= i; r++) {
                        System.out.print("*");
                    }
                }
            }
        }
    }
