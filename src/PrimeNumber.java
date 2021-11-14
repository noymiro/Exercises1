import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int result = positiveIntegar();
        for (int i = 2; i < result ; i++) {
            boolean number = primeNumber(i);
            if (number == true) {
                System.out.print(i + ",");
            }
        }
    }
    public static boolean modulusNumber(int num1, int num2) {
        if (num1 % num2 == 0) {
            return true;
        } else {
            return false;
        }
    }
    public static boolean primeNumber(int number) {
        for (int i = 2; i < number; i++) {
            if (modulusNumber(number, i)) {
                return false;
            }

        } return true;
    }
    public static int positiveIntegar(){
        Scanner scanner = new Scanner(System.in);
        int userChosie;
        do {
            System.out.println("Enter a positive number:");
            userChosie = scanner.nextInt();
            if (userChosie > 0) {
                System.out.println(userChosie);
            } else {
                System.out.println("Please enter a positive number to continue");
            }
        } while (userChosie < 0);{}
        return userChosie;
    }
}
