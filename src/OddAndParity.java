import java.util.Scanner;
public class OddAndParity {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println ("Enter a number:  ");
        int number1 = scanner.nextInt();
        System.out.println ("Enter a number:  ");
        int number2 = scanner.nextInt();
        int sum = number1+number2;
        if (sum%2 == 0) {
            System.out.println ("Your number is parity");
        } else {
            System.out.println("Your number number is Odd");
        }
            System.out.println("Good bye");
        }
    }
