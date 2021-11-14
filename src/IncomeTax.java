import java.util.Scanner;

public class IncomeTax {
    public static void main(String[] args) {

        printOptions();
        int userChoice = chosenDay();
        if (userChoice == 1 || userChoice == 2 || userChoice == 4 || userChoice == 5) {
            int[] array = chosenHour();
        }
        if (userChoice == 3) {
            int[] array = Tuersdayhour();
        }
    }


    public static void printOptions() {

        System.out.println("Please choose your interested day:");
        System.out.println("For Sunday press - 1");
        System.out.println("For Monday press - 2");
        System.out.println("For Tuesday press - 3");
        System.out.println("For Wednesday press - 4");
        System.out.println("For Thursday press - 5");
        System.out.println("For Friday press - 6");
        System.out.println("For Saturday press - 7");

    }

    public static int chosenDay() {
        Scanner scanner = new Scanner(System.in);
        int userChoice;
        System.out.println("Enter your choice: ");
        userChoice = scanner.nextInt();
        if (userChoice < 1 || userChoice > 7) {
            System.out.println("wrong day!!");
        } else if (userChoice == 6 || userChoice == 7) {
            System.out.println("Closed office");
        }
        return userChoice;

    }

    public static int[] chosenHour() {
        int[] array = new int[2];
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the earliest hour you can arrive?");
        int earlyhours = scanner.nextInt();
        System.out.println("What is the latest hour you can arrive?");
        int latehours = scanner.nextInt();
        array[0] = earlyhours;
        array[1] = latehours;
        if (latehours < earlyhours) {
            System.out.println("The early hour can not be greater than the late hour");
        }
        if (earlyhours < 0 || latehours > 23) {
            System.out.println("Wrong hour!!");
        }
        if (earlyhours >= 9 && latehours <= 17) {
            System.out.print("You can arrive :)");
        } else if (earlyhours < 9 & latehours > 17) {
            System.out.println("The office open in 09:00-17:00");
        }

        return array;
    }

    public static int[] Tuersdayhour() {
        int[] array = new int[2];
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is the earliest hour you can arrive?");
        int earlyhours = scanner.nextInt();
        System.out.println("What is the latest hour you can arrive?");
        int latehours = scanner.nextInt();
        array[0] = earlyhours;
        array[1] = latehours;
        if (latehours < earlyhours) {
            System.out.println("The early hour can not be greater than the late hour.");
        }
        if (earlyhours < 0 || latehours > 23) {
            System.out.println("Wrong hour");
        } if  (earlyhours >= 8 && latehours <= 12) {
            System.out.print("You can arrive :)");
        }  else if (earlyhours <= 8 & latehours >= 12) {
            System.out.println("The office open in 08:00-12:00.");
        }
        return array;
    }
}



