import java.util.Scanner;

public class RoutineSerial {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a First number");
        int num1 = scanner.nextInt();
        System.out.println("Enter a Difference number");
        int difference = scanner.nextInt();
        int elements = 0 ;
        do {
            System.out.println("Enter a Elements number");
            elements = scanner.nextInt();
        } while (elements<=0);

        PrintRoutineSerial(num1, difference, elements);
    }

    public static void PrintRoutineSerial(int firstNum, int dif, int ele) {
        for (int i = 0; ele >= i; i++) {
            System.out.print(firstNum+(i*dif) + ",");
        }
    }
}

