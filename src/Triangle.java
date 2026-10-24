
import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first leg: ");
        double a = scanner.nextDouble();

        System.out.print("Enter the second leg: ");
        double b = scanner.nextDouble();

        double c = Math.sqrt(a * a + b * b);

        System.out.println("Hypotenuse: " + c);
    }
}
