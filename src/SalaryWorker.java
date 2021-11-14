import java.util.Scanner;
public class SalaryWorker {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the number of workers in the factory: ");
        int number = scanner.nextInt();
        for (int i = 0; i < number; i++) {
            System.out.println("Please enter the code worker, for senior worker enter 1 and for junior worker enter 0:");
            int userInput1 = scanner.nextInt();
            System.out.println("How many hours did the worker work this month? ");
            int userInput2 = scanner.nextInt();
            System.out.println("How many days the worker passed the daily target? ");
            int userInput3 = scanner.nextInt();

            int total_salary = salaryWorker(userInput1, userInput2, userInput3);
            System.out.println("The salary for the worker is: " + total_salary);
        }
    }
    public static int salaryWorker ( int code_worker, int hours, int good_days) {
        if (code_worker == 0) {
            int month_hours = (hours * 50);
            month_hours = month_hours + (250 * good_days);
            return month_hours;
        } else {
            int month_hours = (hours * 200);
            month_hours = month_hours + (250 * good_days);
            return month_hours;
        }
    }
}
