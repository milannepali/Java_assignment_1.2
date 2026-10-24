
import java.util.Scanner;

public class ObsoleteMeasures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Weight (g): ");
        double grams = scanner.nextDouble();

        double totalLuoti = grams / 13.28;

        int leiviska = (int) (totalLuoti / 640);
        int naula = (int) ((totalLuoti % 640) / 32);
        double luoti = totalLuoti % 32;

        System.out.printf("%.0f grams is %d leiviskä, %d naula, and %.2f luoti.%n",
                grams, leiviska, naula, luoti);
    }
}
