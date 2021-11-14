import java.util.Scanner;

public class QuadraticEquation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a first number  ");
        double a  = scanner.nextInt();
        System.out.println("Enter a second number ");
        double b  = scanner.nextInt();
        System.out.println("Enter a third number ");
        double c  = scanner.nextInt();
        double delta = b*b-4*a*c;
        if (delta <0) {
            System.out.println("There are no solutions");
        } else if (delta==0)
        {
            System.out.println("There is one answer: " + -b/(2*a) );
        } else {
            double x1 = (-b+Math.sqrt(delta))/(2*a);
            double x2 = (-b-Math.sqrt(delta))/(2*a);
            System.out.println("The Solutions are: " +x1 + ", "  +x2);
        }
    }
}
