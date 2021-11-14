import java.util.Scanner;

public class AbsolutNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println ("Enter a number:  ");
        int userInput = scanner.nextInt();
        if (userInput < 0) {
            System.out.println ("Your Absolut number is:   "  + - userInput);
        }
        else  {
            System.out.println("Your Absolut number is:" + userInput);
        }
        System.out.println("Good bye");
    }
}
