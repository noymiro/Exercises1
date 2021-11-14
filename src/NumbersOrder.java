
import java.util.Scanner;

public class NumbersOrder {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a first number: ");
        int number1 = scanner.nextInt();
        System.out.println("Enter a second number: ");
        int number2 = scanner.nextInt();
        System.out.println("Enter a third number: ");
        int number3 = scanner.nextInt();
        if (number1 != number2 && number1 != number3 && number2 != number3) {
            if (number1 > number2 && number1 > number3 && number2 > number3) {
                System.out.println("Your serial is:" + number1 + " ," + number2 + " ,"+ number3);
            }
            if (number3 > number1 && number1 > number2 ) {
                System.out.println("Your serial is: " + number3+ " ,"  + number1 + " ," + number2);
            }
            if (number2 > number3 && number2 > number1 && number3 > number1) {
                System.out.println("Your serial is: " + number2+ " ,"  + number3 + ", " + number1);
            }
            if (number1 > number3 && number1 > number2 && number3 > number2) {
                System.out.println("Your serial is:" + number1+ " ,"  + number3+ " ,"  + number2);
            }
            if (number2 > number1 && number2 > number3 && number1 > number3) {
                System.out.println("Your serial is: " + number2+ ", "  + number1 + " ,"  + number3);
            }
            if (number3 > number2 && number3 > number1 && number2 > number1) {
                System.out.println("Your serial is: " + number3 + ", "  + number2 + ", "  + number1);
            }
        }
    }
}
